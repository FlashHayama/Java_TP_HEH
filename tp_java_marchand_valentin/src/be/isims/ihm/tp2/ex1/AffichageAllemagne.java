package be.isims.ihm.tp2.ex1;

/**
 * AffichageAllemagne est l'interface représentant le mode d'affichage Allemand
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class AffichageAllemagne implements Affichage
{
	/**
	 * Permet d'envoyer la facture en allemand
	 *
	 * @param value Montant de la facture
	 * @return Chaine de caractére représentant la facture
	 */
	@Override
	public String toString(float value)
	{
		String s = "Der Rechnungsbetrag ist : € " + value;
		return s;
	}
}
