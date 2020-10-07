package be.isims.coo.tp4.ex1;

public class CahierNotesTest
{
	public static void main(String[] args)
	{
		float[] notes = new float[] {80, 60.2f, 40, 36.5f ,75, 96, 100, 21.3f, 10, 84};

		CahierNotes notes1 = new CahierNotes(notes, "informatique");

		notes1.traitementNotes();
	}
}
