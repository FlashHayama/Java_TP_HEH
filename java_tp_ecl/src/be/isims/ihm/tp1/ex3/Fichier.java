package be.isims.ihm.tp1.ex3;

public class Fichier implements Composant
{
    private String nom;

    public Fichier(String nom)
    {
        this.nom = nom;
    }

    @Override
    public String getFichier() {
        return "\t- " + nom + "\n";
    }

    @Override
    public String getNom() { return nom; }
}
