package be.isims.coo.tp4.ex3;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class CarreTest
{
	public static void main(String[] args)
	{
		Carre carre;
		int[] valeurs = new int[9];
		int i = 0;
		try
		{
			Scanner scanner = new Scanner(new File("magicData.txt"));
			scanner.useDelimiter(",");
			while(scanner.hasNext())
			{
				valeurs[i] = Integer.parseInt(scanner.next());
				i++;
			}
			carre = new Carre(valeurs);
		}
		catch (FileNotFoundException e )
		{
			e.printStackTrace();
		}
	}
}
