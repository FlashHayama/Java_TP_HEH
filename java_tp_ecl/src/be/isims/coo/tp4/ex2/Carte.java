package be.isims.coo.tp4.ex2;

public class Carte
{
	String nom;
	String couleur;

	public Carte(String nom, String couleur)
	{
		this.nom = nom;
		this.couleur = couleur;
	}

	public String toString()
	{
		return nom + " de " + couleur;
	}
}
