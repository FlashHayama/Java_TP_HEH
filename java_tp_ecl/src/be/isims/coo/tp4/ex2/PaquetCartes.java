package be.isims.coo.tp4.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaquetCartes
{
	public ArrayList<Carte> paquet;
	public ArrayList<Carte> paquetMelanger;

	public PaquetCartes()
	{
		paquet = new ArrayList<Carte>();
		buildPaquet();
		melangePacket();
	}

	private void buildPaquet()
	{
		buildCartes("trefle");
		buildCartes("carreau");
		buildCartes("coeur");
		buildCartes("pique");
	}

	private void buildCartes(String couleur)
	{
		for (int i = 13; i >= 1; i--)
		{
			if(i == 13) paquet.add(new Carte("Roi", couleur));
			else if(i == 12) paquet.add(new Carte("Renne", couleur));
			else if(i == 11) paquet.add(new Carte("Valet", couleur));
			else if(i < 11 && i > 1) paquet.add(new Carte(String.valueOf(i), couleur));
			else if(i == 1) paquet.add(new Carte("As", couleur));
		}
	}

	public void melangePacket()
	{
		paquetMelanger = (ArrayList<Carte>)paquet.clone();
		Collections.shuffle(paquetMelanger);
	}

	public List distribuerPacket(int nbr)
	{
		List<List> result = new ArrayList<>();
		int sub = 52 / nbr;
		for (int i = 0; i < nbr; i++)
		{
			List subPaquet = paquetMelanger.subList(i * sub, (sub * (i + 1)));
			result.add(subPaquet);
		}
		return result;
	}
}
