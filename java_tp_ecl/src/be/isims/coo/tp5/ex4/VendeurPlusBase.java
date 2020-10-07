package be.isims.coo.tp5.ex4;

public class VendeurPlusBase extends Vendeur
{
	private float salaryBase;

	public void setSalaryBase(float value){ this.salaryBase = value;}
	public float getSalaryBase(){ return salaryBase;}

	public VendeurPlusBase(String name, String firstName, String nbrSecureSocial, float commission, float sales, float salaryBase)
	{
		super(name, firstName, nbrSecureSocial, commission,sales);
		this.salaryBase = salaryBase;
	}

	@Override
	public float income()
	{
		return super.income() + this.salaryBase;
	}

	@Override
	public String toString()
	{
		String s = super.toString() + "\n" + "Salaire de base : " + this.salaryBase + " €";
		return s;
	}
}
