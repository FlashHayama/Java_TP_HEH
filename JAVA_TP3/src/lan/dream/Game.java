package lan.dream;

import java.io.IOException;
import java.util.*;

public class Game
{


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
	public int Verify(int de1, int de2)
	{
		int sum = de1 + de2;
		if(sum == 7 || sum == 11)
		{
			return 0;
		}
		else if(sum == 2 || sum == 3 || sum == 12)
		{
			return 1;
		}
		else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
		{
			return 2;
		}
		else
		{
			return -1;
		}
	}
	public void Start() throws IOException
	{
		De de1 = new De();
		De de2 = new De();
		char c;
		int i;
		do
		{
			System.out.println("[Appuier sur enter pour lancer les dés ou q pour quitter]");
			c = (char) System.in.read();
			if (c == '\n')
			{
				de1.Roles();de2.Roles();
				System.out.println(de1.getValue() + "\t+\t" + de2.getValue() + "\t=\t" + (de1.getValue() + de2.getValue()));
				Combination(de1.getValue(),de2.getValue());
				i = Verify(de1.getValue(),de2.getValue());
				switch(i)
				{
					case 0:
						System.out.println("Gagner");
						break;
					case 1:
						System.out.println("Perdu");
						break;
					case 2:
						/*do
						{

						}while ();*/
						break;
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
