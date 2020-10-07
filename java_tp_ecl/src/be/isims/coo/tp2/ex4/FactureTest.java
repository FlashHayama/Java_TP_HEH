package be.isims.coo.tp2.ex4;

public class FactureTest
{
	public static void main(String[] args)
	{
		Facture produit1 = Facture.initFacture(22.0f);

		produit1.setMontant(-23);

		Facture produit2 = Facture.initFacture(-9);

		System.out.println(produit2);
		System.out.println(produit1);
	}
}
