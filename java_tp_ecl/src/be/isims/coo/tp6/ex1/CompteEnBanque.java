package be.isims.coo.tp6.ex1;

public class CompteEnBanque
{
	private int nbrCompte;
	private double solde;

	public CompteEnBanque(int nbrCompte, double solde) {
		this.nbrCompte = nbrCompte;
		this.solde = solde;
	}

	public double getSolde() { return solde; }

	public void setSolde(double solde) { this.solde = solde; }
}
