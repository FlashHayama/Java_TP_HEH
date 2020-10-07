package be.isims.coo.tp7.ex2;

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

	public void retrait(double value)
			throws SoldeInsufisantExeption
	{
		if(value > this.solde)
		{
			throw new SoldeInsufisantExeption(value, this.solde);
		}
		else
		{
			this.solde -= value;
		}

	}
}
