package be.isims.ihm.tp4.ex2;

public class CompteEpargne extends Compte
{

    public CompteEpargne( double solde) {
        super("Compte Epargne", solde);
    }
    public CompteEpargne() {
        super("Compte Epargne",0);
    }

    @Override
    public void verserArgent(double value)
    {
        super.solde += value;
        double dValue = (super.solde * 100);
        int iValue = (int) dValue;
        super.solde =  (double) iValue / 100;
    }

    @Override
    public void retirerArgent(double value)
    {
        if(value <= super.solde)
        {
            super.solde -= value;
            double dValue = (super.solde * 100);
            int iValue = (int) dValue;
            super.solde =  (double) iValue / 100;
        }
    }

    @Override
    public void calculInterets()
    {
        super.solde *= 1.01;
        double dValue = (super.solde * 100);
        int value = (int) dValue;
        super.solde =  (double) value / 100;
    }

}
