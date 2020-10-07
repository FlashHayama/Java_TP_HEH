package be.isims.coo.tp5.ex3;

import java.util.ArrayList;
import java.awt.Rectangle;

public class Application
{
	public static void main(String[] args)
	{
		ArrayList<Object> objects = new ArrayList<Object>();
		objects.add(new De());
		objects.add(new Carte("Roi","trefle"));
		objects.add(new Rectangle(10, 12));
		objects.add(new String("Chaine de caractere"));

		for (Object obj : objects)
		{
			System.out.println(obj.toString());
		}
	}
}
