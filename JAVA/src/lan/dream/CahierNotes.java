package lan.dream;

public class CahierNotes
{
	private String nomCour = "Informatique";
	public String getNomCour()
	{
		return nomCour;
	}

	public void setNomCour(String nomCour)
	{
		this.nomCour = nomCour;
	}


	public void AfficheMessage()
	{
		System.out.println("Bonjour le nom de votre cour est maintenant:");
		System.out.println(nomCour);
	}

}
