package be.isims.ihm.tp4.ex3;

import javax.swing.*;
import java.awt.*;

/**
 * Fenetre est la classe qui crée la fenètre
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Fenetre extends JFrame
{
    private JPanel btn;
    private Action action;
    private JTextField num;
    private JTextField symb;

    public void setNum(String num){ this.num.setText(num);}
    public void setSymb(String symb){ this.symb.setText(symb);}
    public String getNum(){ return this.num.getText();}

    /**
     * Comstructeur de Fenetre qui implémente tous les composants
     */
    public Fenetre()
    {
        super("Calculatrice");
        this.setSize(350, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        action = new Action(this);


        btn = new JPanel();
        btn.setLayout(new GridLayout(4,4,10,10));
        createBtn();

        JPanel tf = new JPanel(new BorderLayout());
        num = new JTextField();
        symb = new JTextField();
        num.setEditable(false);
        symb.setEditable(false);

        symb.setPreferredSize(new Dimension(50,0));
        tf.add(num,BorderLayout.CENTER);
        tf.add(symb,BorderLayout.EAST);
        tf.setPreferredSize(new Dimension(0,50));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(btn, BorderLayout.CENTER);
        panel.add(tf, BorderLayout.NORTH);

        this.getContentPane().add(panel);

    }

    /**
     * Crée les boutons de la fenêtre
     */
    public void createBtn()
    {
        int num = 1;
        JButton symBtn;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                JButton numBtn = new JButton(String.valueOf(num));
                btn.add(numBtn);
                action.actionNumber(numBtn);
                num++;
            }
            switch(i)
            {
                case 0:
                    symBtn = new JButton("-");
                    action.actionSymbole(symBtn);
                    btn.add(symBtn);
                    break;
                case 1:
                    symBtn = new JButton("+");
                    action.actionSymbole(symBtn);
                    btn.add(symBtn);
                    break;
                case 2:
                    symBtn = new JButton("/");
                    action.actionSymbole(symBtn);
                    btn.add(symBtn);
                    break;
            }
        }

        symBtn = new JButton(",");
        action.actionNumber(symBtn);
        btn.add(symBtn);

        symBtn = new JButton("0");
        action.actionNumber(symBtn);
        btn.add(symBtn);

        symBtn = new JButton("*");
        action.actionSymbole(symBtn);
        btn.add(symBtn);

        symBtn = new JButton("=");
        action.actionSymbole(symBtn);
        btn.add(symBtn);

    }

    /**
     * Point d'entrée du programme
     *
     * @param args
     *          Argument passer en paramètre lors de l'exécution du programme
     */
    public static void main(String[] args)
    {
        JFrame calculette = new Fenetre();
        calculette.setVisible(true);
    }
}
