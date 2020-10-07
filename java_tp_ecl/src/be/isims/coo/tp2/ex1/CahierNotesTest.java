package be.isims.coo.tp2.ex1;

import java.util.Scanner;
public class CahierNotesTest
{
	public static void main(String[] args)
	{
		String message;
		CahierNotes cahierNotes = new CahierNotes("Informatique");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Votre ancien cour est :");
		System.out.println(cahierNotes.getNomCour());
		System.out.println("Donner votre nouveau cour :");
		message = scanner.next();
		cahierNotes.setNomCour(message);
		cahierNotes.afficheMessage();
	}
}
