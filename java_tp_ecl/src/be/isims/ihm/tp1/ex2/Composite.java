package be.isims.ihm.tp1.ex2;

import java.util.ArrayList;

public abstract class Composite implements Composant
{
    protected String name;
    protected ArrayList<Composant> collection = new ArrayList<Composant>();

    public Composite(String name)
    {
        this.name = name;
    }

    @Override
    public double getBenefice()
    {
        double result = 0;

        for (Composant composant : this.collection)
        {
            result += composant.getBenefice();
        }

        return result;
    }

    public void add(Composant composant)
    {
        this.collection.add(composant);
    }

    public void remove(Composant composant)
    {
        this.collection.remove(composant);
    }

    @Override
    public abstract String toString() ;
}
