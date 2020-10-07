package be.isims.ihm.tp4s.ex1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Fenetre est la class montant la fenètre
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Fenetre extends JFrame
{
    private JTextField eurT;
    private JLabel eurL;
    private JRadioButton montant;
    private JRadioButton taxe;
    private JTextField usdT;
    private JLabel usdL;
    private JTextField tva;

    public JTextField getEurT() { return this.eurT; }
    public JLabel getEurL() { return this.eurL; }
    public JRadioButton getMontant() { return this.montant; }
    public JTextField getUsdT() { return this.usdT; }
    public JLabel getUsdL() { return this.usdL;}
    public JTextField getTva() { return this.tva; }

    private Action action;

    /**
     * Constructeur de la fenètre initiant tous les composants
     */
    public Fenetre()
    {
        super("Convertisseur de devises");
        this.setSize(400,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        action = new Action();

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        eurT = new JTextField();
        eurT.setHorizontalAlignment(JTextField.RIGHT);
        eurT.setPreferredSize(new Dimension(150,20));
        eurT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                action.actionEurKey(e,Fenetre.this);
            }
        });
        eurL = new JLabel("EUR");
        ButtonGroup group = new ButtonGroup();
        montant = new JRadioButton("Montant");
        montant.setSelected(true);
        montant.addActionListener(actionEvent -> action.actionChangeMode(actionEvent, this));
        taxe = new JRadioButton("Taxe");
        taxe.addActionListener(actionEvent -> action.actionChangeMode(actionEvent, this));
        group.add(montant);
        group.add(taxe);
        panel1.add(eurT);
        panel1.add(eurL);
        panel1.add(montant);
        panel1.add(taxe);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        usdT = new JTextField();
        usdT.setHorizontalAlignment(JTextField.RIGHT);
        usdT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                action.actionUsdKey(e,Fenetre.this);
            }
        });
        usdT.setPreferredSize(new Dimension(150,20));
        usdL = new JLabel("USD");
        tva = new JTextField("21");
        tva.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                action.actionTvaKey(e,Fenetre.this);
            }
        });
        tva.setPreferredSize(new Dimension(50,20));
        tva.setEnabled(false);
        JLabel tvaL = new JLabel("%");
        panel2.add(usdT);
        panel2.add(usdL);
        panel2.add(tva);
        panel2.add(tvaL);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.PAGE_AXIS));
        panel3.add(panel1);
        panel3.add(panel2);

        this.getContentPane().add(panel3);
    }

    /**
     * Point d'entré du programme
     *
     * @param args
     *          Paramettre passer en argument lors du lancement
     */
    public static void main(String[] args)
    {
        JFrame app = new Fenetre();
        app.setVisible(true);
    }
}
