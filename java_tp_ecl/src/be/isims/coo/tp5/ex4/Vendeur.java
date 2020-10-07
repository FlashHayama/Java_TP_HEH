package be.isims.coo.tp5.ex4;

public class Vendeur extends Employe
{
	protected float sales;

	public Vendeur(String name, String firstName, String nbrSecureSocial, float commission, float sales)
	{
		super(name, firstName, nbrSecureSocial, commission);
		this.sales = sales;
	}

	@Override
	public float income()
	{
		return super.salary * this.sales;
	}

	@Override
	public String toString()
	{
		String s = super.toString() + "Ventes : " + this.sales + " €\n" +
				"Taux de commission : " + super.salary;
		return s;
	}
}
