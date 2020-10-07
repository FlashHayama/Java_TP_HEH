package be.isims.coo.tp4.ex3;

public class Carre
{
	private int[][] carre = new int[3][3];
	private int[] valeurs;

	public Carre(int[] valeurs)
	{
		this.valeurs = valeurs;
		lectureCarre();
		isCarre();
	}

	public void lectureCarre()
	{
		int index = 0;
		for(int i = 0; i < 3; i++)
		{
			System.out.print("|");
			for (int j = 0; j < 3; j++)
			{
				carre[i][j] = valeurs[index];
				System.out.print(carre[i][j] + "|");
				index++;
			}
			System.out.println("");
		}
	}

	public void isCarre()
	{
		int [] verif = new int[7];
		int k = 0;
		boolean isMagical = true;
		for(int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				verif[k] += carre[i][j];
				verif[k + 1] += carre[j][i];
			}
			k += 2;
		}
		verif[6] = carre[0][0] + carre[1][1] + carre[2][2];
		for (int i = 0; i <6; i++)
		{
			if(verif[i] == verif[i+1] && isMagical)
			{
				isMagical = true;
			}
			else
			{
				isMagical = false;
				break;
			}
		}
		if(isMagical)
		{
			System.out.println("Le carre est magique");
		}
		else
		{
			System.out.println("Le carre n'est pas magique");
		}
	}
}
