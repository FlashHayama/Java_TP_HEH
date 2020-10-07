package be.isims.ihm.tp2.ex2;

/**
 * FormatEntier est la classe qui vérifie si la chaine est un entier
 *
 * @see Format
 * @author Marchand Valentin
 * @version 1.0
 */
public class FormatEntier implements Format
{

    /**
     * Teste si le format est un entier
     *
     * @param value Valeur testé
     * @return true si c'est un entier
     */
    @Override
    public boolean isValid(String value)
    {
        try
        {
            Integer.parseInt(value);

            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}
