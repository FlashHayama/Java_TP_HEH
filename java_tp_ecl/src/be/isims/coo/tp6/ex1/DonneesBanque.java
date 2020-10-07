package be.isims.coo.tp6.ex1;

public class DonneesBanque implements CollectionDonnees
{
	double somme = 0;
	int count = 0;
	CompteEnBanque maximum = null;

	public DonneesBanque(){}

	public DonneesBanque(Object compteEnBanque)
	{
		if(compteEnBanque instanceof CompteEnBanque)
		{
			this.maximum = ((CompteEnBanque)compteEnBanque);
			this.count ++;
			this.somme = ((CompteEnBanque) compteEnBanque).getSolde();
		}
		else
		{
			System.out.println("L'objet envoyé n'est pas un compte en banque");
		}
	}

	@Override
	public void add(Object compteEnBanque)
	{
		if(compteEnBanque instanceof CompteEnBanque)
		{
			if(((CompteEnBanque) compteEnBanque).getSolde() > this.maximum.getSolde())
				this.maximum = ((CompteEnBanque)compteEnBanque);
			this.count ++;
			this.somme += ((CompteEnBanque) compteEnBanque).getSolde();
		}
		else
		{
			System.out.println("L'objet envoyé n'est pas un compte en banque");
		}
	}

	@Override
	public Object getMaximum() {
		return maximum;
	}

	@Override
	public double getMoyenne()
	{
		if(this.count > 0)
			return this.somme / this.count;
		else
		{
			System.out.println("Aucun compte n'est enregistré");
			return 0;
		}
	}
}
