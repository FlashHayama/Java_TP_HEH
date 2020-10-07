package be.isims.ihm.tp5;

/**
 * DecorateurPizza est la class abstraite decorateur qui représente les différent ingrédient
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public abstract class DecorateurPizza extends Pizza
{
    protected Pizza pizza;
    protected String label;
    protected double prix;

    @Override
    public abstract String afficheDescription();
    @Override
    public abstract double calculePrix();
}
