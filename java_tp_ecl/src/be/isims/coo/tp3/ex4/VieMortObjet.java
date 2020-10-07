package be.isims.coo.tp3.ex4;

public class VieMortObjet
{
	public static void main(String[] args)
	{
		Class1 class11 = new Class1();
		class11 = null;
		System.gc();
		System.runFinalization();

		creerObjet();
		System.gc();
		System.runFinalization();

		Class1 class13 = new Class1();
		class13 = new Class1();
		System.gc();
		System.runFinalization();

	}

	private static void creerObjet()
	{
		Class1 class12 = new Class1();
	}
}
