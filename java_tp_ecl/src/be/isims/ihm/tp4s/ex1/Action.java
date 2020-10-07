package be.isims.ihm.tp4s.ex1;

import javafx.scene.input.KeyCode;

import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Action est la classe gérant les évènements
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Action
{
    private Calcul calcul;
    private boolean isConvert = true;

    /**
     * Constructeur de Action
     */
    public Action()
    {
        calcul = new ConversionDollar();
    }

    /**
     * Methode configurant le mode de calcul
     *
     * @param calcul Mode de calcul
     */
    public void setCalcul(Calcul calcul)
    {
        this.calcul = calcul;
    }

    /**
     * Evènement d'une touche entrée sur le JTextField eurT
     *
     * @param e Touche entrée
     * @param fenetre Fenètre principal
     */
    public void actionEurKey(KeyEvent e, Fenetre fenetre)
    {
        try
        {
            double value = Double.parseDouble(fenetre.getEurT().getText());
            value = calcul.convertToDown(value);
            value *= 100;
            int intValue = (int)value;
            value = (double)intValue / 100;
            fenetre.getUsdT().setText(String.valueOf(value));
        } catch (NumberFormatException except)
        {
            if(fenetre.getEurT().getText().equals(""))
            {
                fenetre.getUsdT().setText(String.valueOf(""));
            }
            else
            {
                fenetre.getUsdT().setText(String.valueOf("ERROR"));
            }
        }
    }

    /**
     * Evènement d'une touche entrée sur le JTextField usdT
     *
     * @param e Touche entrée
     * @param fenetre Fenètre principal
     */
    public void actionUsdKey(KeyEvent e, Fenetre fenetre)
    {
        try
        {
            double value = Double.parseDouble(fenetre.getUsdT().getText());
            value = calcul.convertToUp(value);
            value *= 100;
            int intValue = (int)value;
            value = (double)intValue / 100;
            fenetre.getEurT().setText(String.valueOf(value));
        } catch (NumberFormatException except)
        {
            if(fenetre.getUsdT().getText().equals(""))
            {
                fenetre.getEurT().setText(String.valueOf(""));
            }
            else
            {
                fenetre.getEurT().setText(String.valueOf("ERROR"));
            }
        }
    }
    /**
     * Evènement d'une touche entrée sur le JTextField tva
     *
     * @param e Touche entrée
     * @param fenetre Fenètre principal
     */
    public void actionTvaKey(KeyEvent e, Fenetre fenetre)
    {
        try
        {
            double value = Double.parseDouble(fenetre.getTva().getText());
            calcul.setTva((value / 100) + 1);
        }
        catch ( NumberFormatException except)
        {
            if(!fenetre.getTva().getText().equals(""))
                fenetre.getTva().setText("21");
        }
        finally
        {
            try
            {
                if(!(fenetre.getEurT().getText().equals("")) && !(fenetre.getTva().getText().equals("")))
                {
                    System.out.println("coucou");
                    double value = Double.parseDouble(fenetre.getEurT().getText());
                    value = calcul.convertToDown(value);
                    value *= 100;
                    int intValue = (int)value;
                    value = (double)intValue / 100;
                    fenetre.getUsdT().setText(String.valueOf(value));
                }
                else
                {
                    fenetre.getUsdT().setText("");
                }
            }
            catch (NumberFormatException except)
            {
                System.out.println("Erreur format ttc");
            }
        }
    }

    /**
     * Evènement de l'appuis sur un radio bouton
     *
     * @param actionEvent Objet lier à l'évènement
     * @param fenetre Fenètre principale
     */
    public void actionChangeMode(ActionEvent actionEvent, Fenetre fenetre)
    {
        fenetre.getEurT().setText(String.valueOf(""));
        fenetre.getUsdT().setText(String.valueOf(""));
        if(actionEvent.getSource().equals(fenetre.getMontant()))
        {
            setCalcul(new ConversionDollar());
            fenetre.getTva().setEnabled(false);
            fenetre.getUsdL().setText("USD");
            fenetre.getEurL().setText("EUR");
        }
        else
        {
            setCalcul(new Taxe(1.21));
            fenetre.getTva().setEnabled(true);
            fenetre.getUsdL().setText("TTC");
            fenetre.getEurL().setText("HT");
            if(fenetre.getTva().getText().equals(""))
                fenetre.getTva().setText("21");
        }
    }
}
