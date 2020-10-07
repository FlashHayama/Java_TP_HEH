package be.isims.ihm.tp3.ex1;

import java.util.ArrayList;

/**
 * Saisie est la classe Observeur
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Saisie
{
    private ArrayList<Convert> convert = new ArrayList<Convert>();

    /**
     * Notifie les classes Convert afin de convertire le nombre
     *
     * @param nombre Nombre à convertire
     */
    public void setNombre(int nombre)
    {
        if(convert != null)
        {
            for(Convert c : convert)
            {
                System.out.println(c.convert(nombre));
            }
        }
    }

    /**
     * Ajoute un convertiseur au tableau convert
     *
     * @param convert Nouvelle objet Convert
     */
    public void add(Convert convert)
    {
        this.convert.add(convert);
    }
}
