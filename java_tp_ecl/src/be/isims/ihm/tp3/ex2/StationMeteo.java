package be.isims.ihm.tp3.ex2;

import java.util.ArrayList;

/**
 * StationMeteo est la classe représentant les données météorologique
 *
 * @author Marchand valentin
 * @version 1.0
 */
public class StationMeteo
{
    private ArrayList<Integer> temperature = new ArrayList<Integer>();
    private ArrayList<Integer> humidite = new ArrayList<Integer>();
    private int min = Integer.MAX_VALUE;
    private int max = 0;
    private int moyenne = 0;

    private ArrayList<Affichage> affichage = new ArrayList<Affichage>();

    public int getTemperature() {return temperature.get(temperature.size() - 1);}
    public int getHumidite() {return humidite.get(humidite.size() - 1);}
    public int getMin() {return min;}
    public int getMax() {return max;}
    public int getMoyenne() {return moyenne;}

    /**
     * Permet d'ajouter un observeur
     *
     * @param observer nouvel observeur
     */
    public void addObserveur(Affichage observer)
    {
        affichage.add(observer);
    }

    /**
     * Ajoute les donées est les traite
     *
     * @param temp temperature
     * @param hum humidité
     */
    public void ajouterDonnees(int temp, int hum)
    {
        int somme = 0;
        this.temperature.add(temp);
        this.humidite.add(hum);

        if(temp < this.min)
        {
            this.min = temp;
        }
        if(temp > this.max)
        {
            this.max = temp;
        }
        for(int i : temperature) { somme += i; }
        moyenne = somme / temperature.size();

        afficher();
    }

    /**
     * Affiche les résultas sur la console grace aux observeurs
     */
    public void afficher()
    {
        System.out.println("-------------------------------------------");
        for(Affichage obj : affichage)
        {
            System.out.print(obj.affichage());
            System.out.print(" >> ");
        }
        System.out.println("");
    }
}
