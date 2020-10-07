package be.isims.ihm.tp4.ex2;

public class ComptePayant extends Compte
{

    public ComptePayant()
    {
        super("Compte payant", 0);
    }

    @Override
    public void verserArgent(double value) {
        super.solde += value * 0.95;
        double dValue = (super.solde * 100);
        int iValue = (int) dValue;
        super.solde =  (double) iValue / 100;
    }

    @Override
    public void retirerArgent(double value) {
        if(super.solde >= (value * 1.05))
        {
            super.solde -= (value * 1.05);
            double dValue = (super.solde * 100);
            int iValue = (int) dValue;
            super.solde =  (double) iValue / 100;
        }
    }
}
