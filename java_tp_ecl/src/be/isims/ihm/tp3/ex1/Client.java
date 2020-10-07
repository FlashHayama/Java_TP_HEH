package be.isims.ihm.tp3.ex1;

import java.util.Scanner;

/**
 *  Client est la classe Principale permettant de tester le programme
 *
 *  @author Marchand Valentin
 *  @version 1.0
 */
public class Client
{
    /**
     * Point d'entrée de l'application
     *
     * @param args
     * 			Argument passer au lancement de l'application
     */
    public static void main(String[] args)
    {
        Saisie saisie = new Saisie();
        ConvBin convBin = new ConvBin();
        ConvHex convHex = new ConvHex();
        ConvOctal convOctal = new ConvOctal();

        saisie.add(convBin);
        saisie.add(convHex);
        saisie.add(convOctal);

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Saisir un entier :");
            saisie.setNombre(scanner.nextInt());
        }
    }
}
