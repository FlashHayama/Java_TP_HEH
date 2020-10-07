package be.isims.coo.tp2.ex2;

import java.util.*;

public class CompteBancaireTest
{
	public static void main(String[] args)
	{
		CompteBancaire compte1 = new CompteBancaire(50.0);
		CompteBancaire compte2 = new CompteBancaire(-7.50);

		System.out.println("solde compte 1 = " + compte1.getSolde());
		System.out.println("solde compte 2 = " + compte2.getSolde());

		compte1.depot(78.0);
		compte2.depot(12.30);

		System.out.println("solde compte 1 = " + compte1.getSolde());
		System.out.println("solde compte 2 = " + compte2.getSolde());
	}
}
