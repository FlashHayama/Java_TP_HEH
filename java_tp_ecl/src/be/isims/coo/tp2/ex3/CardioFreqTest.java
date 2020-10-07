package be.isims.coo.tp2.ex3;

import java.util.Scanner;

public class CardioFreqTest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String nom;
		String prenom;
		int jour;
		int mois;
		int annee;
		System.out.println("Indiquez votre nom : ");
		nom = s.next();
		System.out.println("Indiquez votre prenom : ");
		prenom = s.next();
		System.out.println("Indiquez votre jour de naissance : ");
		jour = Integer.parseInt(s.next());
		System.out.println("Indiquez votre mois de naissance : ");
		mois = Integer.parseInt(s.next());
		System.out.println("Indiquez votre année de naissance : ");
		annee = Integer.parseInt(s.next());

		CardioFreq cardioFreq = new CardioFreq(nom,prenom,jour,mois,annee);

		System.out.println("Nom : " + cardioFreq.getNom() + " Prenom : " + cardioFreq.getPrenom() + " Date : " + cardioFreq.getJour() + "/" + cardioFreq.getMois() + "/" + cardioFreq.getAnnee());
		System.out.println("FCM : " + cardioFreq.getFCM());
		System.out.println("Fréquence cible : " + cardioFreq.frequenceCible());

	}
}
