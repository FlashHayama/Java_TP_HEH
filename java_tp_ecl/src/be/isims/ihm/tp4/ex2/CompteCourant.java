package be.isims.ihm.tp4.ex2;

public class CompteCourant extends Compte
{
    public CompteCourant(double solde) {
        super("Compte courant", solde);
    }
    public CompteCourant() {
        super("Compte courant", 0);
    }

    @Override
    public void verserArgent(double value)
    {
        super.solde += value;
    }

    @Override
    public void retirerArgent(double value)
    {
        if(super.solde >= (value * 1.05))
        {
            super.solde -= (value * 1.05);
            double dValue = (super.solde * 100);
            int iValue = (int) dValue;
            super.solde =  (double) iValue / 100;
        }
    }

}
