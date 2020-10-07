package be.isims.coo.tp5.ex4;

public class Salarie extends Employe
{

	public Salarie(String name, String firstName, String nbrSecureSocial, float salary)
	{
		super(name, firstName, nbrSecureSocial, salary);
	}

	@Override
	public float income()
	{
		return super.salary;
	}

	@Override
	public String toString()
	{
		String s = super.toString() + "Salaire hebdomataire : " + super.salary + " €";
		return s;
	}
}
