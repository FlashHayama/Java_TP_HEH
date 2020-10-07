package be.isims.ihm.tp1.ex3;

public class Main
{
    public static void main(String[] args)
    {
        RepertoireComposite system = new RepertoireComposite("Système");

        RepertoireComposite dossier1 = new RepertoireComposite("Dossier1");
        RepertoireComposite dossier2 = new RepertoireComposite("Dossier2");
        RepertoireComposite dossier3 = new RepertoireComposite("Dossier3");
        RepertoireComposite dossier4 = new RepertoireComposite("Dossier4");
        RepertoireComposite dossier5 = new RepertoireComposite("Dossier5");

        Fichier fichier1 = new Fichier("Fichier1");
        Fichier fichier2 = new Fichier("Fichier2");
        Fichier fichier3 = new Fichier("Fichier3");
        Fichier fichier4 = new Fichier("Fichier4");
        Fichier fichier5 = new Fichier("Fichier5");
        Fichier fichier6 = new Fichier("Fichier6");

        dossier1.add(fichier1);dossier1.add(fichier2);dossier1.add(fichier3);
        dossier2.add(fichier1);
        dossier3.add(fichier1);dossier3.add(fichier2);
        dossier4.add(fichier1);dossier4.add(fichier2);dossier4.add(fichier3);dossier4.add(fichier4);dossier4.add(fichier5);


        system.add(dossier1);
        system.add(dossier2);
        system.add(dossier3);
        system.add(dossier4);
        system.add(dossier5);

        System.out.println(system.getFichier());

        System.out.println("Recherche Dossier3 :");
        System.out.println(system.getFichierByNom("Dossier3"));
    }
}
