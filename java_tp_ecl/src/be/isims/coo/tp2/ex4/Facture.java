package be.isims.coo.tp2.ex4;

public class Facture
{
	private static int nbr = 0;
	private final double TVA = 0.21;
	private int numFactures = 0;
	private float montHT = 0;

	private Facture(float montHT, int numFactures)
	{
		this.montHT = montHT;
		this.numFactures = numFactures;
	}

	public static Facture initFacture(float montHT)
	{
		if(valideMontant(montHT))
		{
			Facture.nbr += 1;
			return new Facture(montHT, Facture.nbr);
		}
		else
		{
			System.out.println("Montant invalide");
			return null;
		}
	}

	private static boolean valideMontant(float montant)
	{
		return !(montant <= 0.0f);
	}

	public boolean setMontant(float montant)
	{
		if(valideMontant(this.montHT + montant))
		{
			this.montHT += montant;
			return true;
		}
		else
		{
			System.out.println("Montant ajouter invalide");
			return false;
		}
	}

}
