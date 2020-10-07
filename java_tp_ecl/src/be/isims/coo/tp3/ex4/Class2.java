package be.isims.coo.tp3.ex4;

public class Class2
{
	public Class2()
	{
		System.out.println("Un nouvel objet de type class 2 a etait creer");
	}

	protected void finalize()
	{
		System.out.println("un objet de type class2 se meurt");
	}
}
