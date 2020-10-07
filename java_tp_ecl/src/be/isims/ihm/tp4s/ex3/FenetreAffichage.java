package be.isims.ihm.tp4s.ex3;

import javax.swing.*;
import java.awt.*;

/**
 * FenetreAffichage est la class affichant la température sélectioné
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class FenetreAffichage extends JFrame
{
    private JPanel panelGlobal = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JLabel labelT = new JLabel();

    /**
     *Constructeur de FenetreAffichage initialisant les composant
     *
     * @param temp Température à afficher
     */
    public FenetreAffichage(int temp)
    {
        super("Thermo - Affichage");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        labelT.setFont(new Font("Serif",Font.BOLD,70));
        labelT.setPreferredSize(new Dimension(150,150));
        labelT.setText(temp + "°C");
        panelGlobal.add(labelT);
        this.getContentPane().add(panelGlobal);
        this.setResizable(false);
    }

    /**
     * Change la température à afficher
     *
     * @param temp Température à afficher
     */
    public void setTemp(int temp)
    {
        labelT.setText(temp + "°C");
    }
}
