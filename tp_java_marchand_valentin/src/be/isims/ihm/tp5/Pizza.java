package be.isims.ihm.tp5;

/**
 * Pizza est la class abstraite représentant les sortes de pizza et les ingrédient
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public abstract class Pizza
{
    private String label;
    private double prix;

    public String afficheDescription(){ return label; }
    public double calculePrix(){ return prix; }

    protected void setLabel(String label){ this.label = label; }
    protected void setPrix(double prix){ this.prix = prix; }

    @Override
    public String toString() {
        return "Pizza : " + afficheDescription() + ", prix : " + calculePrix() + " Euros";
    }
}
