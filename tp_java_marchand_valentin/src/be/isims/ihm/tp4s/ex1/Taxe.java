package be.isims.ihm.tp4s.ex1;

import javax.swing.*;

/**
 * Taxe est la class convertissant la valeur HT en TTC
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Taxe implements Calcul
{
    private double tva;

    @Override
    public void setTva(double tva) { this.tva = tva; }

    public Taxe(double tva)
    {
        this.tva = tva;
    }

    @Override
    public double convertToDown(double value)
    {
        return value * tva;
    }

    @Override
    public double convertToUp(double value)
    {
        return value / tva;
    }

}
