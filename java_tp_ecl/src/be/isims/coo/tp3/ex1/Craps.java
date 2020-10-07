package be.isims.coo.tp3.ex1;

import java.io.IOException;
import java.util.Scanner;

public class Craps
{
	private int point;
	private Mise maMise;
	private De de1;
	private De de2;

	public Craps()
	{
		this.maMise = new Mise();
		this.de1 = new De();
		this.de2 = new De();
	}

	public void Combination(int de1 , int de2)
	{
		int sum = de1 + de2;
		if(sum == 7)
		{
			System.out.println("Natural");
		}
		else if(sum == 11)
		{
			System.out.println("Yo-level");
		}
		else if(sum == 2)
		{
			System.out.println("Snake Eyes");
		}
		else if(sum == 3)
		{
			System.out.println("Ace Deuce");
		}
		else if(sum == 12)
		{
			System.out.println("Boxcars");
		}
	}
	public Etat Verify(int de1, int de2)
	{
		int sum = de1 + de2;
		if(sum == 7 || sum == 11)
		{
			return Etat.GAGNE;
		}
		else if(sum == 2 || sum == 3 || sum == 12)
		{
			return Etat.PERDU;
		}
		else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
		{
			this.point = sum;
			return Etat.CONTINU;
		}
		else
		{
			return null;
		}
	}
	public void playPoint() throws IOException
	{
		char c;

		int sum = 0;
		do
		{
			System.out.println("[Appuier sur enter pour lancer les dés ou q pour quitter]");
			c = (char) System.in.read();
			if (c == '\n')
			{
				de1.Roles();
				de2.Roles();
				sum = de1.getValue() + de2.getValue();
				System.out.println(de1.getValue() + "\t+\t" + de2.getValue() + "\t=\t" + sum);
				Combination(de1.getValue(), de2.getValue());
				if(sum == this.point)
				{
					System.out.println("Vous avez ateind le point : ");
					System.out.println("Gagner");
					maMise.miseGagnee();
				}
				else if (sum == 7)
				{
					System.out.println("Perdu");
					maMise.misePerdue();
				}
			}
			else if(c == 'q')
			{
				break;
			}
			else
			{
				System.out.println("Mauvaise saisie");
				System.in.skip(100);
			}
		}while (sum != this.point && sum != 7);
	}
	public void play() throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		char c;
		Etat i;
		do
		{
			maMise.tryMise();
			System.out.println("Votre mise est de " + maMise.getMise() + "€");
			//System.console().flush();
			System.out.println("[Appuier sur enter pour lancer les dés ou q pour quitter]");
			c = (char) System.in.read();
			if (c == '\n')
			{
				de1.Roles();de2.Roles();
				System.out.println(de1.getValue() + "\t+\t" + de2.getValue() + "\t=\t" + (de1.getValue() + de2.getValue()));
				Combination(de1.getValue(),de2.getValue());
				i = Verify(de1.getValue(),de2.getValue());

				if(i.equals(Etat.GAGNE))
				{
					System.out.println("Gagner");
					maMise.miseGagnee();
				}
				else if(i.equals(Etat.PERDU))
				{
					System.out.println("Perdu");
					maMise.misePerdue();
				}
				else if(i.equals(Etat.CONTINU))
				{
					System.out.println("Vous avez etablie le point");
					System.out.println("Point etabli : " + this.point);
					this.playPoint();
				}
			}
			else if(c == 'q')
			{
				break;
			}
			else
			{
				System.out.println("Mauvaise saisie");
				System.in.skip(100);
			}
		}while (true);
	}

}
