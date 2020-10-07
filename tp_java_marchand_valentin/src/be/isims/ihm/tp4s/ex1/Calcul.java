package be.isims.ihm.tp4s.ex1;

/**
 * Calcul est l'interface représentant les modes de calcul
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public interface Calcul
{
    /**
     * Convertie la valeur par le ratio
     *
     * @param value Valeur à Convertie
     * @return Valeur convertie
     */
    public double convertToDown(double value);

    /**
     * Convertie la valeur par l'inverse du ratio
     *
     * @param value Valeur à Convertie
     * @return Valeur convertie
     */
    public double convertToUp(double value);

    /**
     * Configure le ratio tva
     *
     * @param value Rasio
     */
    public void setTva(double value);
}
