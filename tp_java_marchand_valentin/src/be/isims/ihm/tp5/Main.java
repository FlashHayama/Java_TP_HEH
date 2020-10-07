package be.isims.ihm.tp5;

/**
 * Main est la class permettant de tester le programme
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Main
{
    /**
     * Point d'entré du programme
     */
    public static void main(String[] args)
    {
        Pizza p1 = new PizzaConcrete("Classique", 4);
        p1 = new IngrediantConcret(p1,"thon", 3);
        p1 = new IngrediantConcret(p1,"frommage", 2);
        System.out.println(p1);

        Pizza p2 = new PizzaConcrete("Fourrée au fromage", 5);
        p2 = new IngrediantConcret(p2,"boulette de viande", 4);
        p2 = new IngrediantConcret(p2,"jambon", 2);
        System.out.println(p2);

        Pizza p3 = new PizzaConcrete("Pâte fine", 4);
        p3 = new IngrediantConcret(p3,"oignons", 1);
        p3 = new IngrediantConcret(p3,"champignons", 2);
        p3 = new IngrediantConcret(p3,"olives noires", 2);
        System.out.println(p3);

    }

}
