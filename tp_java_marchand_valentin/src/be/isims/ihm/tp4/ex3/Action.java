package be.isims.ihm.tp4.ex3;

import javax.swing.*;

/**
 * Action est la classe qui gère les évènements des boutons
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Action
{
    Fenetre fenetre;
    Calcul calcul;

    /**
     * Constructeur de action
     *
     * @param fenetre Fenètre où sont les boutons
     */
    public Action(Fenetre fenetre)
    {
        this.fenetre = fenetre;
        calcul = new Calcul();
    }

    /**
     * Action des boutons avec les chiffres
     *
     * @param btn bouton atribuer
     */
    public void actionNumber(JButton btn)
    {
        btn.addActionListener(actionEvent -> {
            try
            {
                String num = fenetre.getNum();
                if(calcul.getOperation().equals(""))
                {
                    if(actionEvent.getActionCommand() != ",")
                    {
                        num += actionEvent.getActionCommand();
                    }
                    else
                    {
                        num += ".";
                    }
                    calcul.setA(Double.parseDouble(num));
                }
                else {
                    if (actionEvent.getActionCommand() != ",")
                    {
                        num += actionEvent.getActionCommand();
                    } else {
                        num += ".";
                    }
                    calcul.setB(Double.parseDouble(num));
                }
                fenetre.setNum(num);

            }
            catch ( NumberFormatException e)
            {
                JOptionPane.showMessageDialog(fenetre,"Entée incorecte");
            }
        });
    }

    /**
     * Action des boutons avec les symboles
     *
     * @param btn bouton atribuer
     */
    public void actionSymbole(JButton btn)
    {
        btn.addActionListener(actionEvent -> {
            if(fenetre.getNum().equals(""))
            {
                if(actionEvent.getActionCommand().equals("-"))
                {
                    fenetre.setNum("-");
                }
                else
                {
                    JOptionPane.showMessageDialog(fenetre,"Opération imposible");
                }
            }
            else if(actionEvent.getActionCommand() != "=")
            {
                if(calcul.getOperation().equals("")) fenetre.setNum("");
                fenetre.setSymb(actionEvent.getActionCommand());
                calcul.setOperation(actionEvent.getActionCommand());
            }
            else
            {
                if(!calcul.getOperation().equals(""))
                {
                    fenetre.setNum(calcul.getCalcul());
                    fenetre.setSymb("");
                }
                else
                {
                    JOptionPane.showMessageDialog(fenetre,"Opération imposible");
                }
            }
        });
    }
}
