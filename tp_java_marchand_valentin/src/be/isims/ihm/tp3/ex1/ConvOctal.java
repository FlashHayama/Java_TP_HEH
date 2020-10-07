package be.isims.ihm.tp3.ex1;

/**
 * ConvOctal est la classe représentant le mode de convertion octal
 *
 * @see Convert
 * @author Marchand Valentin
 * @version 1.0
 */
public class ConvOctal implements Convert
{
    /**
     * Permet de convertire la valeur en octal
     *
     * @param value Valeur à convertire
     * @return
     */
    @Override
    public String convert(int value)
    {
        return "Conversion en octal : " + Integer.toOctalString(value);
    }
}
