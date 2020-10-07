package be.isims.coo.tp3.ex1;

import java.io.IOException;

public class CrapsTest
{
    public static void main(String[] args) throws IOException
    {
        Craps game = new Craps();

        game.play();

        System.out.println("Jeu quitter");
    }
}
