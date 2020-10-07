package be.isims.ihm.tp3.ex1;

/**
 * ConvBin est la classe représentant le mode de convertion binaire
 *
 * @see Convert
 * @author Marchand Valentin
 * @version 1.0
 */
public class ConvBin implements Convert
{
    /**
     * Permet de convertire la valeur en binaire
     *
     * @param value Valeur à convertire
     * @return
     */
    @Override
    public String convert(int value)
    {
        return "Conversion en binaire : " + Integer.toBinaryString(value);
    }
}
