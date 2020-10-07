package be.isims.coo.tp6.ex3;

import java.util.Arrays;

public class Application
{
	public static void main(String[] args)
	{
		Employe[] employees = new Employe[5];
		employees[0] = new Employe("marchand","valentin","485498468", 5000);
		employees[1] = new Employe("marchand","louis","485498468", 23);
		employees[2] = new Employe("marchand","guillaume","485498468", 1000);
		employees[3] = new Employe("marchand","justine","485498468", 1500);
		employees[4] = new Employe("marchand","charlotte","485498468", 500);

		for(Employe obj : employees)
		{
			System.out.println(obj.toString());
			System.out.println("----------------------------");
		}
		System.out.println("-------------------------");

		Arrays.sort(employees);

		for(Employe obj : employees)
		{
			System.out.println(obj.toString());
			System.out.println("----------------------------");
		}
	}
}
