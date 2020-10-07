package be.isims.ihm.tp2.ex2;

/**
 *  ApplicationValidation est la classe Principale permettant de tester le programme
 *
 *  @author Marchand Valentin
 *  @version 1.0
 */
public class ApplicationValidation
{
    /**
     * Point d'entrée de l'application
     *
     * @param args
     * 			Argument passer au lancement de l'application
     */
    public static void main(String[] args)
    {
        String txt = "15";
        Validateur validateur = new Validateur(new FormatEntier(),txt);
        System.out.println("La chaine de caractère : " + txt);
        System.out.println("Est ce que \"" + txt + "\" est un entier? " + validateur.isValid());
        validateur.setFormat(new FormatMail(),txt);
        System.out.println("Est ce que \"" + txt + "\" est une adresse mail? " + validateur.isValid());

        txt = "marchandvalentin7@outlook.fr";
        validateur.setFormat(new FormatEntier(),txt);
        System.out.println("La chaine de caractère : " + txt);
        System.out.println("Est ce que \"" + txt + "\" est un entier? " + validateur.isValid());
        validateur.setFormat(new FormatMail(),txt);
        System.out.println("Est ce que \"" + txt + "\" est une adresse mail? " + validateur.isValid());
    }
}
