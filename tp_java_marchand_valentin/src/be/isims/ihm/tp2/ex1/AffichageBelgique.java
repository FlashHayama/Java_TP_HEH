package be.isims.ihm.tp2.ex1;

/**
 * AffichageAllemagne est l'interface représentant le mode d'affichage Belge
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class AffichageBelgique implements Affichage
{
	/**
	 * Permet d'envoyer la facture en français
	 *
	 * @param value Montant de la facture
	 * @return Chaine de caractére représentant la facture
	 */
	@Override
	public String toString(float value)
	{
		String s = "Le montant de la facture est : " + value + " €";
		return s;
	}
}
