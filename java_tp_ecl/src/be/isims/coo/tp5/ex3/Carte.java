package be.isims.coo.tp5.ex3;

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
