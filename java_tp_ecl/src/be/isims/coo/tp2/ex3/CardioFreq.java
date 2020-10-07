package be.isims.coo.tp2.ex3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class CardioFreq
{
	private String nom;
	private String prenom;
	private int jour;
	private int mois;
	private int annee;

	public String getNom() { return nom; }
	public void setNom(String nom) { this.nom = nom; }

	public String getPrenom() { return prenom; }
	public void setPrenom(String prenom) { this.prenom = prenom; }

	public int getJour() { return jour; }
	public void setJour(int jour) { this.jour = jour; }

	public int getMois() { return mois; }
	public void setMois(int mois) { this.mois = mois; }

	public int getAnnee() { return annee; }
	public void setAnnee(int annee) { this.annee = annee; }

	public CardioFreq(String nom, String prenom, int jour, int mois, int annee) {
		this.nom = nom;
		this.prenom = prenom;
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public int getAge()
	{
		LocalDateTime currentTime = LocalDateTime.now();
		LocalDateTime anniversary = currentTime.withDayOfMonth(this.jour).withYear(this.annee).withMonth(this.mois);

		Period p = Period.between(anniversary.toLocalDate(), currentTime.toLocalDate());

		return p.getYears();
	}

	public int getFCM()
	{
		int fcm = 220 - this.getAge();

		return fcm;
	}

	public String frequenceCible()
	{
		int fcm = this.getFCM();
		double cible60 = fcm * 0.6;
		double cible80 = fcm * 0.8;

		return cible60 + " - " + cible80;
	}
}
