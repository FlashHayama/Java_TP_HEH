package be.isims.coo.tp3.ex1;

import java.util.Scanner;

public class Mise
{
	private int value = 100;
	private int mise = 0;

	public int getValue() { return value; }

	public void setValue(int value) { this.value = value; }

	public int getMise() { return mise; }

	public void setMise(int mise) { this.mise = mise; }

	public void tryMise()
	{
		Scanner scanner = new Scanner(System.in);
		boolean done = true;
		int miseTestInt;
		do {
			System.out.println("Donner votre mise : ");
			System.out.println("Vous avez " + this.value + "€");
			try
			{
				miseTestInt = Integer.parseInt(scanner.next());
				if(miseTestInt > 0)
				{
					if(miseTestInt <= this.value) {
						this.mise = miseTestInt;
						done = false;
					}
					else
					{
						System.out.println("La mise doit etre inferieur a votre argent");
					}
				}
				else
				{
					System.out.println("La mise ne peut pas etre inferieur ou eguale a 0");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Mise incorecte, indique une valeur correcte : ");
			}
		}while(done);
	}
	public void miseGagnee()
	{
		this.value += this.mise;
		this.mise = 0;
		System.out.println("Vous avez maintenant " + this.value + "€");
	}
	public void misePerdue()
	{
		this.value -= this.mise;
		this.mise = 0;
		System.out.println("Vous avez maintenant " + this.value + "€");
	}


}
