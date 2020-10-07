package be.isims.ihm.tp2.ex2;

/**
 * Validateur est une classe qui appel Format pour tester une chaine de caractère
 *
 * @see Format
 * @author Marchand Valentin
 * @version 1.0
 */
public class Validateur
{
    /**
     * Le mode du format verifier
     *
     * @see Format
     */
    Format format;
    String value;

    /**
     * Constructeur du validateur
     *
     * @param format Mode du format à tester
     * @param value Valeur tester
     */
    public Validateur(Format format, String value)
    {
        this.format = format;
        this.value = value;
    }

    /**
     * Configure le mode du format à tester
     *
     * @param format Mode du format à tester
     * @param value Valeur tester
     */
    public void setFormat(Format format, String value)
    {
        this.format = format;
        this.value = value;
    }

    /**
     * Appel le mode du format pour tester si il est correct
     *
     * @return true si c'est correct
     */
    public boolean isValid()
    {
        return format.isValid(value);
    }
}
