package be.isims.ihm.tp4s.ex2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;

/**
 * Action est la classe gérant les évènements
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Action
{
    JTextField color;
    UbdateColor[] ubdateColor;

    /**
     * Constructeur de Action
     *
     * @param color Objet du label avec la couleur total
     * @param ubdateColor tableau de UbtateColor
     * @see UbdateColor
     */
    public Action(JTextField color, UbdateColor[] ubdateColor)
    {
        this.color = color;
        this.ubdateColor = ubdateColor;
    }

    /**
     * Evènement de changement sur slider
     *
     * @param e
     * @param index index du tableau ubtateColor
     */
    public void actionSlider(ChangeEvent e, int index)
    {
        ubdateColor[index].ubdateWithSlider();
        actionChangeColor();
    }

    /**
     * Evènement de changement sur spinner
     *
     * @param e
     * @param index index du tableau ubtateColor
     */
    public void actionSpinner(ChangeEvent e, int index)
    {
        ubdateColor[index].ubdateWithSpinner();
        actionChangeColor();
    }

    /**
     * Met à jour le label avec la couleur total
     */
    public void actionChangeColor()
    {
        String sr;
        String sg;
        String sb;
        int r = ubdateColor[0].getValue();
        int g = ubdateColor[1].getValue();
        int b = ubdateColor[2].getValue();
        color.setBackground(new Color(r,g,b));
        if(r <= 15) {  sr = "0" + Integer.toHexString(r); }
        else {  sr = Integer.toHexString(r); }
        if(g <= 15) {  sg = "0" + Integer.toHexString(g); }
        else {  sg = Integer.toHexString(g); }
        if(b <= 15) {  sb = "0" + Integer.toHexString(b); }
        else {  sb = Integer.toHexString(b); }
        color.setText("0x" + sr + sg + sb);
        if((r + g + b) > 254)
        {
            color.setForeground(Color.BLACK);
        }
        else
        {
            color.setForeground(Color.WHITE);
        }
    }
}
