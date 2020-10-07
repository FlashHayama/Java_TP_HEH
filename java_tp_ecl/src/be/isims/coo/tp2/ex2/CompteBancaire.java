package be.isims.coo.tp2.ex2;

public class CompteBancaire
{
	private double solde;
	public double getSolde() { return solde; }

	public CompteBancaire(double solde)
	{
		if(solde >= 0)
			this.solde = solde;
		else
			this.solde = 0.0;
	}

	public void depot(double value)
	{
		this.solde += value;
	}
}
