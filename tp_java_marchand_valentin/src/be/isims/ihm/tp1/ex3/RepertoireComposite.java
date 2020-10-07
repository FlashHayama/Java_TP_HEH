package be.isims.ihm.tp1.ex3;

import java.util.ArrayList;

public class RepertoireComposite implements Composant
{
    private String nom;
    private ArrayList<Composant> collection = new ArrayList<Composant>();

    public String getNom(){ return nom;}

    public RepertoireComposite(String nom)
    {
        this.nom = nom;
    }

    public void add(Composant composant)
    {
        this.collection.add(composant);
    }

    public void remove(Composant composant)
    {
        this.collection.remove(composant);
    }

    public String getFichierByNom(String nom)
    {
        String result = "";
        for (Composant composant : collection)
        {
            if(composant.getNom().equals(nom))
            {
                result += composant.getFichier();
            }
        }
        if(result != "")
        {
            return result;
        }
        else
        {
            return "Aucun fichier de se nom";
        }
    }

    @Override
    public String getFichier()
    {
        String result = "";
        result += "+ " + nom + "\n";
        for (Composant composant : collection)
        {
            result += "\t" +  composant.getFichier();
        }
        return result;
    }
}
