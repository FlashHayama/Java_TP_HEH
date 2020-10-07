package be.isims.ihm.tp4.ex2;

/**
 * BanqueFrm est une classe gérent la banque
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class BanqueFrm
{
    private Banque banque;

    /**
     * Constructeur de BanqueFrm
     * Implémente les comptes
     *
     * @param fenetre Fenètre charger
     */
    public BanqueFrm(Fenetre fenetre)
    {
        banque = new Banque(fenetre);
        banque.addCompte(new CompteCourant());
        banque.addCompte(new CompteEpargne());
        banque.addCompte(new ComptePayant());
    }

    /**
     * Retire de l'argent au compte selectionné
     * @param index Index du compte
     * @param value Valeur retiré au compte
     * @return Methode toString du compte
     */
    public String retrait(int index, double value)
    {
        if (banque.getCompte(index) != null) {
            banque.getCompte(index).retirerArgent(value);
            return banque.getCompte(index).toString();
        }
        else
        {
            return "Le compte n'existe pas";
        }
    }

    /**
     * Ajoute de l'argent au compte selectionné
     * @param index Index du compte
     * @param value Valeur ajouté au compte
     * @return Methode toString du compte
     */
    public String depot(int index, double value)
    {
        if (banque.getCompte(index) != null) {
            banque.getCompte(index).verserArgent(value);
            return banque.getCompte(index).toString();
        }
        else
        {
            return "Le compte n'existe pas";
        }
    }

    /**
     * Met à jour les intérets du compte
     * @param index Index du compte
     * @return Methode toString du compte
     */
    public String majInteret(int index)
    {
        if (banque.getCompte(index) != null) {
            banque.getCompte(index).calculInterets();
            return banque.getCompte(index).toString();
        }
        else
        {
            return "Le compte n'existe pas";
        }
    }

}
