package be.isims.ihm.tp4.ex2;

import java.util.ArrayList;

/**
 * Banque est une classe gérent les comptes
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Banque
{
    private ArrayList<Compte> lesCompte = new ArrayList<Compte>();
    Fenetre fenetre;

    /**
     * Constructeur de banque
     *
     * @param fenetre Fenètre charger
     */
    public Banque(Fenetre fenetre)
    {
        this.fenetre = fenetre;
    }

    /**
     * Ajoute un compte
     *
     * @param compte Compte ajouter
     */
    public void addCompte(Compte compte)
    {
        lesCompte.add(compte);
        fenetre.addComboCompte(compte.nom);
    }

    /**
     * Retourne un compte celon l'index
     *
     * @param index Index du compte
     * @return
     */
    public Compte getCompte(int index)
    {
        if (index < lesCompte.size() || index >= 0) {
            return lesCompte.get(index);
        }
        else{
            return null;
        }
    }

    /**
     * Retourne tous les comptes
     * @return
     */
    public ArrayList<Compte> collectionComptes()
    {
        return lesCompte;
    }
}
