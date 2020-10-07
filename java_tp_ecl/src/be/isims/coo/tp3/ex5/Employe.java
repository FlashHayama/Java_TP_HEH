package be.isims.coo.tp3.ex5;

import java.util.Date;
import java.util.GregorianCalendar ;

public class Employe
{
	private String nom;
	private Date dateNaissance ;

	public String getNom() { return nom; }

	public Employe(String nom,int jour,int mois,int annee)
	{
		this.nom = nom;
		GregorianCalendar calendar = new GregorianCalendar(annee,mois - 1,jour);
		dateNaissance = calendar.getTime();
	}
	public Date getDateNaissance()
	{
		Date dateNaissanceCopy = (Date) dateNaissance.clone();
		return dateNaissanceCopy;
	}

}
