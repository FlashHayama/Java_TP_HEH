package be.isims.ihm.tp4.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * CompteBancaireFrm est la classe qui crée la fenètre et ses composants
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class CompteBancaireFrm extends JFrame
{
    private float solde = 0;
    private JLabel label1;
    private JTextField t1 = null;
    private JButton btn1;
    private JLabel label2;
    private JPanel panneau = new JPanel();
    private JScrollPane jScrollPane;
    public JTextArea jTextArea;

    public void setSolde(float value){this.solde = value;}
    public JTextField getT1() { return t1;}
    public void setTextLabel2(String content) {label2.setText(content);}


    /**
     * Constructeur de la classe implémentant tous les composants
     */
    public CompteBancaireFrm()
    {
        super("Compte bancaire");

        WindowListener l = new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        };

        addWindowListener(l);

        label1 = new JLabel("Montant :");
        t1 = new JTextField(5);
        btn1 = new JButton("Ajouter montant");
        btn1.addActionListener(new AjouteMontantEcouteur(this));

        label2 = new JLabel("Votre solde = " + solde);

        jTextArea = new JTextArea(2,5);
        jScrollPane = new JScrollPane(jTextArea);
        jTextArea.setEditable(false);
        jTextArea.setMargin(new Insets(0, 10, 0,0));
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea.append("Soldes :\n");

        //Ajout des composants dans la fenètre
        panneau = new JPanel();
        panneau.add(label1);
        panneau.add(t1);
        panneau.add(btn1);
        panneau.add(label2);
        panneau.add(jScrollPane);
        setContentPane(panneau);

        //comfiguration de la fenètre
        setSize(500,100);
        setLocation(700,400);
        setResizable(false);
        setLayout(new FlowLayout());



    }

    /**
     * AjouteMontantEcouteur est la classe qui gère l'évènement du bouton
     */
    public class AjouteMontantEcouteur implements ActionListener
    {
        CompteBancaireFrm compteBancaireFrm;

        /**
         * Constructeur de la classe
         *
         * @param compteBancaireFrm Fenètre charger
         */
        public AjouteMontantEcouteur(CompteBancaireFrm compteBancaireFrm)
        {
            this.compteBancaireFrm = compteBancaireFrm;
        }

        /**
         * Gère le clique du bouton
         *
         * @param e évènement(non utilisé)
         */
        public void actionPerformed(ActionEvent e)
        {
            String contenu = compteBancaireFrm.getT1().getText();

            try
            {
                float solde = Float.parseFloat(contenu);
                compteBancaireFrm.setTextLabel2("Votre solde = " + solde);
                compteBancaireFrm.setSolde(solde);
                compteBancaireFrm.jTextArea.append(solde + "\n");
                compteBancaireFrm.getT1().setText("");
            }
            catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(null,"Montant invalide");
                compteBancaireFrm.getT1().setText("");
            }

        }
    }


}
