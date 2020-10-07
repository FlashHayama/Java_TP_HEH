package be.isims.coo.tp7.ex2;

public class SoldeInsufisantExeption extends IllegalArgumentException
{
	public SoldeInsufisantExeption(double value, double solde)
	{
		System.out.println("Retrait de " + value + "€ imposible car solde insufisant qui est de " + solde + "€");
	}
}
