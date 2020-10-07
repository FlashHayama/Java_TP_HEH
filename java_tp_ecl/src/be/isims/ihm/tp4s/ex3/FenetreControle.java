package be.isims.ihm.tp4s.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;

/**
 * FenetreControle est la class qui construit la fenetre controlant la temperature
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class FenetreControle extends JFrame
{
    private JPanel panelGlobals = new JPanel();

    private JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
    private JTextField labelTemp = new JTextField();
    private JLabel labelDeg = new JLabel("°C");

    private JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10,0));
    private JButton buttonM = new JButton("-");
    private JButton buttonP = new JButton("+");

    private JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JButton buttonV = new JButton("Valider");

    private Action action;

    /**
     * Constructeur de FenetreControle initialisant les composant
     */
    public FenetreControle()
    {
        super("Thermo - Contrôle");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        action = new Action(labelTemp);

        panelGlobals.setLayout(new BoxLayout(panelGlobals,BoxLayout.PAGE_AXIS));

        labelTemp.setFont(new Font("Serif",Font.BOLD,50));
        labelTemp.setPreferredSize(new Dimension(100,100));
        labelTemp.setHorizontalAlignment(JTextField.CENTER);
        labelTemp.setBackground(new Color(165,208,0));
        labelTemp.addActionListener(action::actionChangeTemp);
        labelTemp.setText(String.valueOf(action.getTemp()));
        labelDeg.setFont(new Font("Serif",Font.BOLD,50));
        labelDeg.setPreferredSize(new Dimension(100,100));
        panel1.add(labelTemp);
        panel1.add(labelDeg);
        panelGlobals.add(panel1);

        buttonM.setPreferredSize(new Dimension(45,45));
        buttonM.setBackground(Color.GRAY);
        buttonM.addActionListener(action::actionButtonAcc);
        buttonP.setPreferredSize(new Dimension(45,45));
        buttonP.setBackground(Color.GRAY);
        buttonP.addActionListener(action::actionButtonAcc);
        panel2.add(buttonM);
        panel2.add(buttonP);
        panelGlobals.add(panel2);

        buttonV.setPreferredSize(new Dimension(150,45));
        buttonV.setBackground(Color.GRAY);
        buttonV.addActionListener(action::actionButtonVal);
        panel3.add(buttonV);
        panelGlobals.add(panel3);

        this.setResizable(false);

        this.getContentPane().add(panelGlobals);
    }

    /**
     * Point d'entré du programme
     *
     * @param args
     *          Paramettre passer en argument lors du lancement
     */
    public static void main(String[] args)
    {
        JFrame fenetre = new FenetreControle();
        fenetre.setVisible(true);
    }
}
