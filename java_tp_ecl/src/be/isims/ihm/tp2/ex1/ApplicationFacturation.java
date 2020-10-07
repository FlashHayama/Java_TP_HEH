package be.isims.ihm.tp2.ex1;

/**
 *  ApplicationFacturation est la classe Principale permettant de tester le programme
 *
 *  @author Marchand Valentin
 *  @version 1.0
 */
public class ApplicationFacturation
{
	/**
	 * Point d'entrée de l'application
	 *
	 * @param args
	 * 			Argument passer au lancement de l'application
	 */
	public static void main(String[] args)
	{
		Facture maFacture = new Facture(50.5f);

		System.out.println("Par defaut (Belgique)");
		System.out.println("---------------------");
		maFacture.affiche();

		System.out.println("\nAllemagne");
		System.out.println("---------------------");
		maFacture.setAffichage(new AffichageAllemagne());
		maFacture.affiche();

		System.out.println("\nRoyaume-Uni");
		System.out.println("---------------------");
		maFacture.setAffichage(new AffichageRoyaumeUni());
		maFacture.affiche();
	}
}
