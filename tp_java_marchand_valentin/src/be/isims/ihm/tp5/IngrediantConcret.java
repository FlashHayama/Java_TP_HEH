package be.isims.ihm.tp5;

/**
 * IngrediantConcret est la class implémentant les différents ingrédiants
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class IngrediantConcret extends DecorateurPizza
{
    /**
     * Constructeur de la class
     *
     * @param p Objet enfant dans la chaine
     * @param la Nom de l'ingrédiant
     * @param pr prix de l'ingrédiant
     */
    public IngrediantConcret(Pizza p, String la, double pr)
    {
        pizza = p;
        label = la;
        prix = pr;
    }

    @Override
    public String afficheDescription() { return pizza.afficheDescription() + " + " + label; }

    @Override
    public double calculePrix() { return pizza.calculePrix() + prix; }
}
