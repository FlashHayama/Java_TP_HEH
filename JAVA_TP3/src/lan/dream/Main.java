package lan.dream;

import java.util.*;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        char c;
        do 
        {
            c = (char) System.in.read();
            if (c == '\n')
            {
                System.out.println("enter");
            }
        }while (c != 'q');
        System.out.println("Jeu quitter");
    }
}
