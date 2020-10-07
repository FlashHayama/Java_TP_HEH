package be.isims.ihm.tp1.ex2;

public class Ville implements Composant
{
    private String name;
    private double benefice;

    public Ville(String name, double benefice)
    {
        this.name = name;
        this.benefice = benefice;
    }

    @Override
    public double getBenefice() {
        return benefice;
    }

    public String toString()
    {
        String s = "Les benefices à " + name + " sont de " + getBenefice() + " Euros\n";
        return s;
    }
}
