package be.isims.ihm.tp4.ex2;

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
    private BanqueFrm frm;
    private JTextField tMontant;
    private JComboBox cbCompte;
    private JRadioButton depot;
    private JRadioButton retrait;
    private JButton btVal;
    private JButton btCI;
    private JTextArea jTextArea;

    /**
     * Ajoute un élément dans la comboBox lorsque l'on ajoute un compte
     *
     * @param compte Nom du compte
     */
    public void addComboCompte(String compte)
    {
        cbCompte.addItem(compte);
    }

    /**
     * Comstructeur de Fenetre qui implémente tous les composants
     */
    public Fenetre()
    {
        super("Self banking");
        this.setSize(350, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel montant = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 10));
        JLabel lMontant = new JLabel("Montant");
        tMontant = new JTextField();
        tMontant.setPreferredSize(new Dimension(100, 20));
        montant.add(lMontant);
        montant.add(tMontant);

        JPanel compte = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 10));
        JLabel lCompte = new JLabel("Compte");
        cbCompte = new JComboBox<String>();
        cbCompte.setPreferredSize(new Dimension(150, 20));
        compte.add(lCompte);
        compte.add(cbCompte);

        JPanel transaction = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 10));
        depot = new JRadioButton("Dépôt");
        retrait = new JRadioButton("Retrait");
        ButtonGroup group = new ButtonGroup();
        group.add(depot);
        group.add(retrait);
        depot.setSelected(true);
        transaction.add(new JLabel("Transaction"));
        transaction.add(depot);
        transaction.add(retrait);

        JPanel validations = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 10));
        btVal = new JButton("Valider");
        btCI = new JButton("Calculer les intérêts");
        eventClickVal();
        eventClickCI();
        validations.add(btVal);
        validations.add(btCI);

        JPanel console = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 10));
        jTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(jTextArea);
        scrollPane.setPreferredSize(new Dimension(300,100));
        jTextArea.setEditable(false);
        console.add(scrollPane);

        JPanel fenetre = new JPanel();
        fenetre.setLayout(new BoxLayout(fenetre, BoxLayout.PAGE_AXIS));
        fenetre.add(montant);
        fenetre.add(compte);
        fenetre.add(transaction);
        fenetre.add(validations);
        fenetre.add(console);

        this.getContentPane().add(fenetre);
        this.setResizable(true);
        frm = new BanqueFrm(this);
    }

    /**
     * Crée l'évènement du clique valider
     */
    private void eventClickVal()
    {
        btVal.addActionListener(actionEvent -> {
            String contenu = tMontant.getText();

            try
            {
                double value = Double.parseDouble(contenu);
                double dValue = (value * 100);
                int iValue = (int) dValue;
                value =  (double) iValue / 100;
                if(depot.isSelected())
                {
                    String cons = frm.depot(cbCompte.getSelectedIndex(),value);
                    jTextArea.append(cons + "\n");
                }
                else
                {
                    String cons = frm.retrait(cbCompte.getSelectedIndex(),value);
                    jTextArea.append(cons + "\n");
                }
                tMontant.setText("");
            }
            catch ( NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this,"Montant invalide");
                tMontant.setText("");
            }
        });
    }

    /**
     * Crée l'évènement du clique Calculer les intérêts
     */
    private void eventClickCI()
    {
        btCI.addActionListener(actionEvent -> {
            String cons = frm.majInteret(cbCompte.getSelectedIndex());
            jTextArea.append(cons + "\n");
        });
    }

    /**
     * Point d'entrée du programme
     *
     * @param args
     *          Argument passer en paramètre lors de l'exécution du programme
     */
    public static void main(String[] args)
    {
        JFrame app = new Fenetre();

        app.setVisible(true);
        app.setResizable(false);
    }
}
