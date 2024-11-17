package InterfaceGraphique;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;

 

import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JTextField;

 

public class FrmConversion extends JFrame {

       private static final double TAUX = 0.68;

 

       // Création des composants

       private JLabel lblMontant = new JLabel("Montant à convertir: ");

       private JTextField txtMontant = new JTextField(10);

 

       // Question a

            private JButton btnConvertir  = new JButton("Convertir");

	       private JButton btnEffacer = new JButton("Effacer");



 

       // Question b

 private JLabel lblDevise= new JLabel("Devise de départ ");

	       private JRadioButton radioCAD = new JRadioButton("CAD");

	       private JRadioButton radioEuro = new JRadioButton("Euro");

private ButtonGroup groupe = new ButtonGroup();

 

       private JPanel panel1 = new JPanel();

       private JPanel panel2 = new JPanel();

       private JPanel panel3 = new JPanel();

 

       // Constructeur

       public FrmConversion() {

             super("Conversion");

             setSize(300, 180);

             setLayout(new FlowLayout());

 

             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

             // Ajout des composants au panneau

             panel1.add(lblMontant);

             panel1.add(txtMontant);

 

             // Question c

              panel2.add(lblDevise);

	            panel2.add(radioCAD);

	            panel2.add(radioEuro);

	            

	            panel3.add(btnConvertir);

	            panel3.add(btnEffacer);

// Ajouter les boutons radio au groupe

             groupe.add(radioCAD);

             groupe.add(radioEuro);

 

// Selectionner CAD par défaut

             // Question d

 	     		 radioCAD.setSelected(true);



             // Les mnémoniques - raccourcis clavier

 

// Question e

 btnConvertir.setMnemonic(KeyEvent.VK_C);

	    		btnEffacer.setMnemonic(KeyEvent.VK_E);

	 

 

 

             // Ajout des panneaux à la fenêtre

             add(panel1);

             add(panel2);

             add(panel3);

 

             // Mettre les boutons sur écoute

 

             // Question f

 ActionListener ecouteur = new ConversionListener();

	     		btnConvertir.addActionListener(ecouteur);

	     		btnEffacer.addActionListener(ecouteur);

       }

 

       // Question g

       class ConversionListener implements ActionListener  {

             @Override

             public void actionPerformed(ActionEvent e) {

 

              // Question h

  if(e.getSource()==btnConvertir) {

	            		try {

	            	 double montant=0, montantEnEuro=0,montantEnCAD;

	            	 String tailleText=txtMontant.getText();

						montant= Double.parseDouble(tailleText);

	            	 if(radioCAD.isSelected()) {

	            		 montantEnEuro=montant*TAUX;

	 					JOptionPane.showMessageDialog(FrmConversion.this,montant+"Dollars canadiens sont égaux à "+montantEnEuro +" Euros");

	            	 }else {

	            		 montantEnCAD=montant/TAUX;

		 JOptionPane.showMessageDialog(FrmConversion.this,montant+"Euros sont équivalents à "+montantEnCAD +" Dollars canadiens");



	            	 }

	            	 }catch(NumberFormatException erreur2) {

	 		JOptionPane.showMessageDialog(FrmConversion.this,"Valeur invalide ce n'est pas un chiffre");

	            	 }

	            	 }

	            	 else {

	            		 txtMontant.setText("");

	            	 }

 

       }

	             /**
	       public Static  void main(String[] args) {

	             FrmConversion fenetrePrincipale = new FrmConversion();

	             fenetrePrincipale.setVisible(true);

	             fenetrePrincipale.setResizable(false);

	       }*/

	}
	}
