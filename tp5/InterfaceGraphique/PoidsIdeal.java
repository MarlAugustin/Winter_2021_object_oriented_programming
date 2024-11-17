package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import exercice2.FrmFacture;

public class PoidsIdeal extends JFrame {

private JButton btnCalculer = new JButton("Calculer");
private JButton btnEffacer = new JButton("Effacer");

private JLabel lblTaille = new JLabel(" Votre taille en cm:");
private JTextField txtTaille= new JTextField(14);
private JLabel lblAge= new JLabel(" Votre Âge:             ");
private JTextField txtAge = new JTextField(14);
private JLabel lblUser= new JLabel(" Vous Êtes  ");

private JRadioButton radioMince = new JRadioButton("Mince");
private JRadioButton radioMoyen = new JRadioButton("Moyen");
private JRadioButton radioLarge = new JRadioButton("Large");

	private ButtonGroup groupe = new ButtonGroup();

	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();


	public PoidsIdeal() {
		super("Poids idéal");
		setLayout(new FlowLayout());
		setSize(400, 250);


		btnCalculer.setMnemonic(KeyEvent.VK_C);
		btnEffacer.setMnemonic(KeyEvent.VK_E);

		ActionListener ecouteur = new FactureListener();
		btnCalculer.addActionListener(ecouteur);
		btnEffacer.addActionListener(ecouteur);
		
		// Boutons radio
	
		// Selectionner le bouton radioAuto
		radioMince.setSelected(true);

		// ajouter les boutons au groupe
		groupe.add(radioMince);
		groupe.add(radioMoyen);
		groupe.add(radioLarge);

		// ajouter les boutons radio au panneau
		

		panel1.add(lblTaille);
		panel1.add(txtTaille,BorderLayout.WEST);
		panel2.add(lblAge);
		panel2.add(txtAge,BorderLayout.WEST);

	    panel3.add(lblUser,BorderLayout.WEST);
		panel3.add(radioMince);
		panel3.add(radioMoyen);
		panel3.add(radioLarge);

		panel4.add(btnCalculer);
		panel4.add(btnEffacer);

		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 class FactureListener implements ActionListener {
		 @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			 double rabais=0,age=0,taille;
			 int maxAge=125, minAge=0;
			 
			 if(e.getSource()==btnCalculer) {
				try {
					String tailleText=txtTaille.getText();
					taille= Double.parseDouble(tailleText);
					String ageText=txtAge.getText();
					age= Integer.parseInt(ageText);
					double inShape=0;
					if(radioMince.isSelected()) {
						 inShape= (taille- 100 + age/ 10 ) * 0.9* 0.9;
					}else if(radioMoyen.isSelected()) {
						 inShape= (taille- 100 + age/ 10 ) * 0.9;
					}else {
						 inShape= (taille- 100 + age/ 10 ) * 0.9 * 1.1;
					}
					JOptionPane.showMessageDialog(PoidsIdeal.this,"Votre poids idéal est: "+inShape +" kg");
				
				}catch(NumberFormatException erreur2) {
					if(age <=maxAge && age>=minAge) {
						JOptionPane.showMessageDialog(PoidsIdeal.this,"La valeur de votre âge n'est pas un entier");
						}
					JOptionPane.showMessageDialog(PoidsIdeal.this,"Valeur invalide ce n'est pas un chiffre");
				}
				}
			 	txtTaille.setText("");
				txtAge.setText("");
				
			}
		 }
				
}
