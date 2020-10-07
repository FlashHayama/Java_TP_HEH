package be.isims.ihm.tp1.ex2;

public class Main
{
    public static void main(String[] args)
    {
        Pays belgique = new Pays("Belgique");
        Pays france = new Pays("France");

        Province hainaut = new Province("Hainaut");
        Province liege = new Province("Liege");

        hainaut.add(new Ville("Mons", 5987.25));
        hainaut.add(new Ville("Colfontaine", 125.89));
        liege.add(new Ville("Liege", 1258.36));

        belgique.add(hainaut);
        belgique.add(liege);
        france.add(new Ville("Paris", 10526.36));
        france.add(new Ville("Marseille", 1225.10));

        System.out.println(france);
        System.out.println(belgique);
    }
}
