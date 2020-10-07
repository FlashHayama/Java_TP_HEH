package be.isims.coo.tp3.ex3;

public class RationnelTest
{
	public static void main(String[] args)
	{
		Rationnel rationnel1 = new Rationnel(5, 9);
		Rationnel rationnel2 = new Rationnel(10, 12);

		System.out.println(rationnel1.toString());
		System.out.println(rationnel2.toString());

		Rationnel rationnel3 = rationnel1.plus(rationnel2);

		System.out.println(rationnel3.toString());
	}
}
