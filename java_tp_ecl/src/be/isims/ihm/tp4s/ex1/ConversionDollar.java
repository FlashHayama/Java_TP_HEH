package be.isims.ihm.tp4s.ex1;

/**
 * ConversionDollart est la class qui converti les euros en dollar
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class ConversionDollar implements Calcul
{
    private final double RATIO = 1.08;

    @Override
    public double convertToDown(double value)
    {
        return value * this.RATIO;
    }

    @Override
    public double convertToUp(double value)
    {
        return value / RATIO;
    }

    @Override
    public void setTva(double value) {

    }


}
