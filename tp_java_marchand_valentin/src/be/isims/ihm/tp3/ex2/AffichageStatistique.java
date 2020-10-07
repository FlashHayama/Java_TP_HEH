package be.isims.ihm.tp3.ex2;

/**
 * AffichageCondition est la classe représentant affichant les statistiques météo
 *
 * @see Affichage
 * @author Marchand Valentin
 * @version 1.0
 */
public class AffichageStatistique implements Affichage
{
    StationMeteo sm;

    /**
     * Constructeur de la classe
     *
     * @param sm Station meteo récupérant les données
     */
    public AffichageStatistique(StationMeteo sm)
    {
        this.sm = sm;
    }

    /**
     * Envois les statistiques météo
     *
     * @return chaine de caractères
     */
    @Override
    public String affichage()
    {
        String s = "Température min/max/moy : " + sm.getMin() + "°C/ " + sm.getMax() + "°C/ " + sm.getMoyenne() + "°C";
        return s;
    }
}
