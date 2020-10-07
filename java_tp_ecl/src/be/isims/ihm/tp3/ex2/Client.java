package be.isims.ihm.tp3.ex2;

/**
 *  Client est la classe Principale permettant de tester le programme
 *
 *  @author Marchand Valentin
 *  @version 1.0
 */
public class Client
{
    /**
     * Point d'entrée de l'application
     *
     * @param args
     * 			Argument passer au lancement de l'application
     */
    public static void main(String[] args)
    {
        StationMeteo sm = new StationMeteo();
        AffichageCondition ac = new AffichageCondition(sm);
        AffichageStatistique as = new AffichageStatistique(sm);

        sm.addObserveur(ac);
        sm.addObserveur(as);

        sm.ajouterDonnees(20,50);
        sm.ajouterDonnees(25,65);
        sm.ajouterDonnees(27,70);
    }
}
