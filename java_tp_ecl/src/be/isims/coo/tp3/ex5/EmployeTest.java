package be.isims.coo.tp3.ex5;

import java.util.Date;

public class EmployeTest
{
	public static void main(String[] args)
	{
		Employe employe = new Employe("toto",27,7,1990);
		Date dateNaissance = employe.getDateNaissance();
		System.out.println(employe.getNom() + " " + dateNaissance);
		dateNaissance.setYear(100);
		dateNaissance = employe.getDateNaissance();
		System.out.println(employe.getNom() + " " + dateNaissance);
	}
}
