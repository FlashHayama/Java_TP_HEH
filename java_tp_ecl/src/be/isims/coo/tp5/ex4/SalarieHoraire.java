package be.isims.coo.tp5.ex4;

public class SalarieHoraire extends Employe
{
	private int hours;

	public void setHours(int hours) { this.hours = hours; }

	public SalarieHoraire(String name, String firstName, String nbrSecureSocial, float salaryHours, int hours)
	{
		super(name, firstName, nbrSecureSocial, salaryHours);
		this.hours = hours;
	}

	@Override
	public float income()
	{
		return super.salary * this.hours;
	}

	@Override
	public String toString()
	{
		String s = super.toString() + "Salaire horaire : " + super.salary + " €/h\n" +
				"Heures prestees : " + this.hours + "h";
		return s;
	}

}
