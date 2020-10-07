package be.isims.ihm.tp1.ex2;

public class Province extends Composite
{

    public Province(String name) {
        super(name);
    }

    @Override
    public String toString()
    {
        String s = "Les benefice aux " + name + " sont de " + getBenefice() + " euros\n";
        for(Composant ville : collection)
        {
            s += "\t\t" + ville.toString();
        }
        return s;
    }
}
