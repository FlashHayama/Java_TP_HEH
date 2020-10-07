package be.isims.ihm.tp4s.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Action et la class gérant les actions faite par l'utilisateur
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Action
{
    private int temp;
    private JTextField labelTemp;
    private FenetreAffichage affichage = new FenetreAffichage(temp);

    /**
     * Constructeur de Action
     *
     * @param labelTemp JTextField utiliser par l'application
     */
    public Action(JTextField labelTemp)
    {
        this.labelTemp = labelTemp;
        temp = 20;
    }

    /**
     * Gère le changement sur le JTextField
     */
    public void actionChangeTemp(ActionEvent actionEvent)
    {
        try
        {
            int t = Integer.parseInt(labelTemp.getText());
            temp = t;
        }
        catch ( NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Entrée invalid");
            labelTemp.setText(String.valueOf(temp));

        }
    }

    /**
     * Gère la validation de la température
     */
    public void actionButtonVal(ActionEvent actionEvent)
    {
        affichage.setTemp(temp);
        affichage.setVisible(true);
    }

    /**
     * Gère les actions sur les bouton + et -
     *
     * @param actionEvent Information du bouton appuyer
     */
    public void actionButtonAcc(ActionEvent actionEvent)
    {
        if(actionEvent.getActionCommand().equals("+"))
        {
            temp++;
        }
        else
        {
            temp--;
        }
        labelTemp.setText(String.valueOf(temp));
    }

    /**
     * Récupère la température courante
     *
     * @return Température
     */
    public int getTemp() { return temp; }
}
