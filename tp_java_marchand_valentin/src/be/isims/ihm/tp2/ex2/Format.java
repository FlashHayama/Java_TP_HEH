package be.isims.ihm.tp2.ex2;

/**
 * Format est l'interface représentant les modes de format
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public interface Format
{
    /**
     * Teste si le format de la chaine est correct
     *
     * @param value Valeur testé
     * @return true si c'est correct
     */
    public boolean isValid(String value);
}
