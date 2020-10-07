package be.isims.ihm.tp1.ex2;

public class Pays extends Composite
{
    public Pays(String name) {
        super(name);
    }

    @Override
    public String toString()
    {
        String s = "Les benefices en " + name + " sont de " + getBenefice() + " Euros\n";
        for (Composant composant : collection)
        {
            s += "\t" + composant.toString();
        }
        return s;
    }
}
