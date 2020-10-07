package be.isims.ihm.tp3.ex2;

/**
 * AffichageCondition est la classe représentant affichant les condition météo
 *
 * @see Affichage
 * @author Marchand Valentin
 * @version 1.0
 */
public class AffichageCondition implements Affichage
{
    StationMeteo sm;

    /**
     * Constructeur de la classe
     *
     * @param sm Station meteo récupérant les données
     */
    public AffichageCondition(StationMeteo sm)
    {
        this.sm = sm;
    }

    /**
     * Envois les conditions météo
     *
     * @return chaine de caractères
     */
    @Override
    public String affichage()
    {
        String s = "Température : " + sm.getTemperature() + "°C - Humidité : " + sm.getHumidite() + "%";
        return s;
    }
}
