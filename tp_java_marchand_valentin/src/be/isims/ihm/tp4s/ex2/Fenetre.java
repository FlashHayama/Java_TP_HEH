package be.isims.ihm.tp4s.ex2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.font.NumericShaper;

/**
 * Fenetre est la class montant la fenètre
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Fenetre extends JFrame
{
    Action action;
    UbdateColor[] colors;

    private JPanel panelGlobals = new JPanel();
    private JPanel panelDec = new JPanel();

    private JPanel panelR = new JPanel();
    private JTextField labelR = new JTextField("Rouge");
    private JSlider sliderR = new JSlider();
    private JSpinner spinnerR = new JSpinner();

    private JPanel panelG = new JPanel();
    private JTextField labelG = new JTextField("Vert");
    private JSlider sliderG = new JSlider();
    private JSpinner spinnerG = new JSpinner();

    private JPanel panelB = new JPanel();
    private JTextField labelB = new JTextField("Bleu");
    private JSlider sliderB = new JSlider();
    private JSpinner spinnerB = new JSpinner();

    private JPanel panelRGB = new JPanel();
    private JTextField labelRGB = new JTextField("0x000000");

    /**
     * Constructeur de la fenètre initiant tous les composants
     */
    public Fenetre()
    {
        super("Color creator");
        this.setSize(400,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        colors = new UbdateColor[3];

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20,20,20,20);

        panelGlobals.setLayout(new BoxLayout(panelGlobals, BoxLayout.Y_AXIS));
        //panelDec.setLayout(new BoxLayout(panelDec, BoxLayout.X_AXIS));

        panelR.setLayout(new GridBagLayout());
        labelR.setBackground(Color.RED);
        labelR.setForeground(Color.WHITE);
        labelR.setHorizontalAlignment(JTextField.CENTER);
        labelR.setEditable(false);
        labelR.setPreferredSize(new Dimension(60,20));
        sliderR.setMaximum(255);
        sliderR.setOrientation(JSlider.VERTICAL);
        sliderR.addChangeListener(changeEvent -> action.actionSlider(changeEvent, 0));
        SpinnerModel sm = new SpinnerNumberModel(190,0,255,1);
        spinnerR.setModel(sm);
        spinnerR.addChangeListener(changeEvent -> action.actionSpinner(changeEvent, 0));
        panelR.add(labelR, gbc);
        panelR.add(sliderR, gbc);
        panelR.add(spinnerR, gbc);
        colors[0] = new UbdateColor(spinnerR,sliderR);

        panelG.setLayout(new GridBagLayout());
        labelG.setBackground(Color.GREEN);
        labelG.setForeground(Color.BLACK);
        labelG.setHorizontalAlignment(JTextField.CENTER);
        labelG.setEditable(false);
        labelG.setPreferredSize(new Dimension(60,20));
        sliderG.setMaximum(255);
        sliderG.setOrientation(JSlider.VERTICAL);
        sliderG.addChangeListener(changeEvent -> action.actionSlider(changeEvent, 1));
        SpinnerModel sm2 = new SpinnerNumberModel(127,0,255,1);
        spinnerG.setModel(sm2);
        spinnerG.addChangeListener(changeEvent -> action.actionSpinner(changeEvent, 1));
        panelG.add(labelG, gbc);
        panelG.add(sliderG, gbc);
        panelG.add(spinnerG, gbc);
        colors[1] = new UbdateColor(spinnerG, sliderG);

        panelB.setLayout(new GridBagLayout());
        labelB.setBackground(Color.BLUE);
        labelB.setForeground(Color.WHITE);
        labelB.setHorizontalAlignment(JTextField.CENTER);
        labelB.setEditable(false);
        labelB.setPreferredSize(new Dimension(60,20));
        sliderB.setMaximum(255);
        sliderB.setOrientation(JSlider.VERTICAL);
        sliderB.addChangeListener(changeEvent -> action.actionSlider(changeEvent, 2));
        SpinnerModel sm3 = new SpinnerNumberModel(212,0,255,1);
        spinnerB.setModel(sm3);
        spinnerB.addChangeListener(changeEvent -> action.actionSpinner(changeEvent, 2));
        panelB.add(labelB, gbc);
        panelB.add(sliderB, gbc);
        panelB.add(spinnerB, gbc);
        colors[2] = new UbdateColor(spinnerB, sliderB);

        panelRGB.setLayout(new GridBagLayout());
        labelRGB.setBackground(Color.PINK);
        labelRGB.setEditable(false);
        labelRGB.setPreferredSize(new Dimension(100,40));
        labelRGB.setHorizontalAlignment(JTextField.CENTER);
        panelRGB.add(labelRGB, gbc);

        panelDec.add(panelR);
        panelDec.add(panelG);
        panelDec.add(panelB);
        panelGlobals.add(panelDec);
        panelGlobals.add(panelRGB);

        action = new Action(labelRGB,colors);
        action.actionChangeColor();

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
        JFrame fenetre = new Fenetre();
        fenetre.setVisible(true);
    }
}
