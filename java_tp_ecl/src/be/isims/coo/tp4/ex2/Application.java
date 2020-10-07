package be.isims.coo.tp4.ex2;

import java.util.ArrayList;
import java.util.List;

public class Application
{
	public static void main(String[] args)
	{
		PaquetCartes cartes = new PaquetCartes();

		//System.out.println(cartes.paquet);
		//System.out.println(cartes.paquetMelanger);

		List<List> subPaquet = cartes.distribuerPacket(3);

		for(int i = 0; i < subPaquet.size(); i++)
		{
			System.out.println("------------");
			System.out.println("Paquet " + (i + 1));
			System.out.println("------------");
			for(int j = 0; j < subPaquet.get(i).size(); j++)
			{
				System.out.println(subPaquet.get(i).get(j).toString());
			}
		}
	}
}
