package be.isims.coo.tp5.ex4;

public abstract class Employe
{
	protected String name;
	protected String firstName;
	protected String nbrSecureSocial;
	protected float salary;

	public Employe(String name, String firstName, String nbrSecureSocial, float salary)
	{
		this.name = name;
		this.firstName = firstName;
		this.nbrSecureSocial = nbrSecureSocial;
		this.salary = salary;
	}
	public Employe(String name, String firstName, String nbrSecureSocial)
	{
		this.name = name;
		this.firstName = firstName;
		this.nbrSecureSocial = nbrSecureSocial;
		this.salary = 0;
	}

	public abstract float income();
	public String toString()
	{
		String s = "Employé salarié : " + this.name + " " + this.firstName + "\n" +
				"Numéro de sécurite social : " + this.nbrSecureSocial + "\n";
		return s;
	}
}
