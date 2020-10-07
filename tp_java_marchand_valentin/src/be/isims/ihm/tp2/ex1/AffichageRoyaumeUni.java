package be.isims.ihm.tp2.ex1;

/**
 * Affichage est l'interface représentant le mode d'affichage Anglais
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class AffichageRoyaumeUni implements Affichage
{
	/**
	 * Permet d'envoyer la facture en anglais
	 *
	 * @param value Montant de la facture
	 * @return Chaine de caractére représentant la facture
	 */
	@Override
	public String toString(float value)
	{
		String s = "The amount of the invoice is : £ " + value;
		return s;
	}
}
