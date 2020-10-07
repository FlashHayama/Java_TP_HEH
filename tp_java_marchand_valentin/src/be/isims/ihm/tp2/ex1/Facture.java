package be.isims.ihm.tp2.ex1;

/**
 * Facture est la classe qui gère la facture ainsi que l'affichage
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Facture
{
	/**
	 * Le mode d'affichage de la facture.
	 *
	 * @see Affichage
	 */
	private Affichage affichage;
	private float facture = 0;

	/**
	 * Constructeur de Facture
	 *
	 * @param value
	 * 			Valeur de la facture
	 */
	public Facture(float value)
	{
		affichage = new AffichageBelgique();
		this.facture = value;
	}

	/**
	 * Permet de configurer l'affichage
	 *
	 * @param affichage
	 * 				Instance du mode d'affichage
	 *
	 * @see Affichage
	 */
	public void setAffichage(Affichage affichage)
	{
		this.affichage = affichage;
	}

	/**
	 * Affiche le montant de la facture
	 */
	public void affiche()
	{
		System.out.println(affichage.toString(facture));
	}
}
