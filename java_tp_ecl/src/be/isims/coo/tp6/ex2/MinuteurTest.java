package be.isims.coo.tp6.ex2;

import javax.swing.Timer;

public class MinuteurTest
{
	public static void main(String[] args)
	{
		AffichageMinute affichageMinute = new AffichageMinute();
		Timer timer = new Timer( 10000, affichageMinute);
		timer.start();
		while(true){}
	}
}
