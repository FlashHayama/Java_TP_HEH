package be.isims.coo.tp2.ex1;

public class CahierNotes
{
	private String nomCour;

	public CahierNotes(String nomCour) {
		this.nomCour = nomCour;
	}

	public String getNomCour()
	{
		return nomCour;
	}

	public void setNomCour(String nomCour)
	{
		this.nomCour = nomCour;
	}



	public void afficheMessage()
	{
		System.out.println("Bonjour le nom de votre cour est maintenant:");
		System.out.println(nomCour);
	}

}
