package be.isims.ihm.tp4.ex2;

/**
 * Compte est une classe implémentant les différents comptes
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public abstract class Compte
{
    protected String nom;
    protected double solde;

    /**
     * Constructeur du compte
     *
     * @param nom Nom du compte
     * @param solde Solde du compte
     */
    public Compte(String nom, double solde)
    {
        this.nom = nom;
        this.solde = solde;
    }

    /**
     * Ajoute de l'argent au solde
     *
     * @param value Valeur ajouté au solde
     */
    public abstract void verserArgent(double value);

    /**
     * Retire de l'argent au solde
     *
     * @param value Valeur retiré au solde
     */
    public abstract void retirerArgent(double value);

    /**
     * Calcule les intérés si il y en a
     */
    public void calculInterets() { }

    /**
     * Retourne les nom du compte plus le solde
     *
     * @return
     */
    public String toString()
    {
        String s = "<" + this.nom + "> : solde = " + this.solde + " Euros";
        return s;
    }
}
