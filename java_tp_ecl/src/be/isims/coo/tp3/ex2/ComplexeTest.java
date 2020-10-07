package be.isims.coo.tp3.ex2;

public class ComplexeTest
{
	public static void main(String[] args)
	{
		Complexe complexe = new Complexe(8,5);
		Complexe complexe2 = new Complexe(4,9);

		complexe.afficher();
		complexe2.afficher();

		complexe.addition(complexe2).afficher();
		complexe.soustraction(complexe2).afficher();
	}
}
