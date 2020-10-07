package be.isims.coo.tp7.ex1;

import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{
		System.setProperty("file.encoding","UTF-8");
		Scanner s = new Scanner(System.in);
		s.useDelimiter(" ");
		int numDen[] = new int[2];
		int ifDenZero = 5;
		int ifIncorect = 3;
		boolean inCalcul = true;

		do {
			System.out.println("Bienvenu dans le simulateur de division 9000 !");
			inCalcul = true;
			ifDenZero = 5;
			ifIncorect = 3;

			do {
				System.out.println("Entrée le numérateur suivi du dénominateur");

				try
				{
					String e = s.nextLine();
					String[] parts = e.split(" ",0);
					numDen[0] = Integer.parseInt(parts[0]);
					numDen[1] = Integer.parseInt(parts[1]);
					if(numDen[1] != 0)
					{
						System.out.println(numDen[0] + "/" + numDen[1] + " = " + ((float)numDen[0] / (float)numDen[1]));
						inCalcul = false;
					}
					else
					{
						ifDenZero--;
						if(ifDenZero == 0)
						{
							System.out.println("Vous n'avez plus d'essaye !");
							System.exit( 1);
						}
						System.out.println("Division par 0 imposible !");
						System.out.println("Plus que " + ifDenZero + " erreur de se type !");
					}
				}
				catch ( NumberFormatException e)
				{
					//e.printStackTrace();
					ifIncorect--;
					System.out.println("Saisie incorect !");
					if(ifIncorect == 0)
					{
						System.out.println("Vous n'avez plus d'essaye !");
						System.exit( 1);
					}
					System.out.println("Vous n'avez plus que " + ifIncorect + " essais !");
				}
			}while(inCalcul);
		}while(true);
	}
}
