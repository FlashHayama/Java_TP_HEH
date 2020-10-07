package be.isims.coo.tp5.ex4;

public class Application
{
	public static void main(String[] args)
	{
		System.setProperty("file.encoding","UTF-8");
		Employe[] employees = new Employe[4];
		Salarie salarie = new Salarie("mire","jhon","852639", 2000);
		SalarieHoraire salarieHoraire = new SalarieHoraire("vanerique","helene", "48521796", 15, 32);
		Vendeur vendeur = new Vendeur("marchand", "louis", "74852196", 0.2f , 3000);
		VendeurPlusBase vendeurPlusBase = new VendeurPlusBase("marchand", "justine", "4569632548", 0.4f, 2500, 100);

		employees[0] = salarie;
		employees[1] = salarieHoraire;
		employees[2] = vendeur;
		employees[3] = vendeurPlusBase;

		for(Employe obj : employees)
		{
			System.out.println(obj.toString());
			System.out.println("------------------------------------");
			if(obj instanceof VendeurPlusBase)
			{
				((VendeurPlusBase) obj).setSalaryBase(((VendeurPlusBase) obj).getSalaryBase() * 1.1f);
			}
		}
		System.out.println("------------------------------------");
		for(Employe obj : employees)
		{
			System.out.println(obj.toString());
			System.out.println("------------------------------------");
		}

	}
}
