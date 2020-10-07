package be.isims.ihm.tp3.ex1;

/**
 * ConvHex est la classe représentant le mode de convertion hexadecimal
 *
 * @see Convert
 * @author Marchand Valentin
 * @version 1.0
 */
public class ConvHex implements Convert
{
    /**
     * Permet de convertire la valeur en hexadecimal
     *
     * @param value Valeur à convertire
     * @return
     */
    @Override
    public String convert(int value)
    {
        return "Conversion en hexadecimal : " + Integer.toHexString(value);
    }
}
