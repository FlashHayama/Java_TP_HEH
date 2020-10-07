package be.isims.coo.tp6.ex3;

public class Employe implements Comparable<Employe>
{
	private String name;
	private String firstName;
	private String nbrSecureSocial;
	private float salary;

	public float getSalary() { return salary; }

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

	public String toString()
	{
		String s = "Employé salarié : " + this.name + " " + this.firstName + "\n" +
				"Numéro de sécurite social : " + this.nbrSecureSocial + "\n" +
				"Salaire : " + this.salary;
		return s;
	}

	@Override
	public int compareTo(Employe employe)
	{
		Employe em = employe;
		if (this.salary == em.salary) return 0;
		if (this.salary > em.salary) return 1;
		return -1;
	}

}
