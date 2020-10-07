package be.isims.coo.tp3.ex4;

public class Class1
{
	Class2 class2;


	public Class1()
	{
		System.out.println("Un nouvel objet de type class 1 a etait creer");
		this.class2 = new Class2();
	}

	protected void finalize()
	{
		System.out.println("un objet de type class1 se meurt");
	}
}
