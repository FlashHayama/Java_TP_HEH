package be.isims.ihm.tp2.ex1;

/**
 * Affichage est l'interface représentant les modes d'affichage
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public interface Affichage
{
	/**
	 * Permet d'envoyer la facture selon le mode d'affichage
	 *
	 * @param value Montant de la facture
	 * @return Chaine de caractére représentant la facture
	 */
	public String toString(float value);
}
