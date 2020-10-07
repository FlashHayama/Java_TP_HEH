package be.isims.ihm.tp4s.ex2;

import javax.swing.*;

/**
 * UbdateColor est la class qui gère la synchronisation entre le slider et le spinner associé
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class UbdateColor
{
    JSpinner spinner;
    JSlider slider;

    /**
     * Constructeur de UbdateColor
     *
     * @param spinner
     * @param slider
     */
    public UbdateColor(JSpinner spinner, JSlider slider)
    {
        this.spinner = spinner;
        this.slider = slider;
        this.spinner.setModel(new SpinnerNumberModel(this.slider.getValue(),0,255,1));
    }

    /**
     * met à jour le spinner à partir du slider
     */
    public void ubdateWithSlider()
    {
        this.spinner.setModel(new SpinnerNumberModel(this.slider.getValue(),0,255,1));
    }

    /**
     * met à jour le slider à partir du spinner
     */
    public void ubdateWithSpinner()
    {
        this.slider.setValue((Integer) this.spinner.getValue());
    }

    /**
     * Récupère la valeur du slider
     *
     * @return valeur du slider
     */
    public int getValue()
    {
        return slider.getValue();
    }
}
