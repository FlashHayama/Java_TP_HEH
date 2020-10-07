package be.isims.coo.tp4.ex1;

public class CahierNotes
{
	private float[] notes;
	private String cour;

	public CahierNotes(float[] notes, String cour)
	{
		this.notes = notes;
		this.cour = cour;
	}

	public void traitementNotes()
	{
		afficherNotes();
		System.out.println("La moyenne de la classe : " + getMoyenne());
		System.out.println("La note la plus basse : " + getMinimum());
		System.out.println("La note la plus haute : " + getMaximum());
		sortieHistogramme();
	}

	private void afficherNotes()
	{
		System.out.println("Voici les notes sur 100 obtenus par les etudiants");
		for (int i = 0; i < notes.length; i++)
		{
			System.out.println("Etudiant " + (i + 1) + " : " + notes[i]);
		}
	}

	private float getMoyenne()
	{
		float moyenne = 0;
		for(float i : notes)
		{
			moyenne += i;
		}
		moyenne /= notes.length;
		return moyenne;
	}

	private float getMinimum()
	{
		float valMin = 100;
		for(float i : notes)
		{
			if(i < valMin)
			{
				valMin = i;
			}
		}
		return valMin;
	}

	private float getMaximum()
	{
		float valMax = 0;
		for(float i : notes)
		{
			if(i > valMax)
			{
				valMax = i;
			}
		}
		return valMax;
	}

	private void sortieHistogramme()
	{
		int[] histogram = new int[11];
		System.out.println("Repartition des notes");
		for(float i : notes)
		{
			if(i == 100)
			{
				histogram[10] ++;
			}
			else if(i > 90)
			{
				histogram[9] ++;
			}
			else if(i > 80)
			{
				histogram[8] ++;
			}
			else if(i > 70)
			{
				histogram[7] ++;
			}
			else if(i > 60)
			{
				histogram[6] ++;
			}
			else if(i > 50)
			{
				histogram[5] ++;
			}
			else if(i > 40)
			{
				histogram[4] ++;
			}
			else if(i > 30)
			{
				histogram[3] ++;
			}
			else if(i > 20)
			{
				histogram[2] ++;
			}
			else if(i > 10)
			{
				histogram[1] ++;
			}
			else
			{
				histogram[0] ++;
			}
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.print((i * 10) + " - " + ((i * 10) + 9) + ": ");
			if(i == 0) System.out.print("\t ");
			for(int j = 0 ; j < histogram[i] ; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.print("100:\t ");
		for(int i = 0; i < histogram[10]; i++)
		{
			System.out.print("*");
		}

	}
}
