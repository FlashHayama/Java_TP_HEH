package be.isims.ihm.tp5;

/**
 * PizzaConcrete est la class implémentant les sortes de pizza
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class PizzaConcrete extends Pizza
{
    /**
     * Constructeur de la class
     *
     * @param label Sorte de la pizza
     * @param prix Prix de la pizza
     */
    public PizzaConcrete(String label, double prix)
    {
        setLabel(label);
        setPrix(prix);
    }
}
