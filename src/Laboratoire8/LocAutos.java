package Laboratoire8;

import javax.swing.LayoutStyle;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LocAutos extends JFrame {
	private JLabel lblClient = new JLabel ("Nom du client:");
	private JLabel lblLocation = new JLabel ("Durée de location:");
	private JLabel lblTotal = new JLabel ("Montant total:");
	private JLabel lblRabais = new JLabel ("Montant rabais:");
	
	private JTextField txtClient = new JTextField (10);// largeur 10
	private JTextField txtLocation = new JTextField (10);// largeur 10
	private JTextField txtTotal = new JTextField (10);// largeur 10
	private JTextField txtRabais= new JTextField (10);// largeur 10

	private JRadioButton radioAutomobile = new JRadioButton("Automobile ");
	private JRadioButton radioCamion = new JRadioButton("Camion");
	private JRadioButton radioFourgon = new JRadioButton("Fourgon");
	private ButtonGroup groupe= new ButtonGroup();
	
	private JButton btnCalculer= new JButton("Calculer");
	private JButton btnEffacer= new JButton("Effacer");

	
	JPanel panel1 = new JPanel ();
	JPanel panel2 = new JPanel ();
	JPanel panel3 = new JPanel ();
	JPanel panel4 = new JPanel ();
	JPanel panel5 = new JPanel ();
	JPanel panel6 = new JPanel ();

	public LocAutos() {
		super("LocAutos");
		setLayout(new FlowLayout());
		setSize(300,300);
		
		panel3.setBorder(BorderFactory.createTitledBorder("Type de véhicule"));
		radioAutomobile.setMnemonic(KeyEvent.VK_A);
		radioCamion.setMnemonic(KeyEvent.VK_M);
		radioFourgon.setMnemonic(KeyEvent.VK_F);
		btnCalculer.setMnemonic(KeyEvent.VK_C);
		btnEffacer.setMnemonic(KeyEvent.VK_E);

		
		txtTotal.setEditable(false);
		txtRabais.setEditable(false);
		
		groupe.add(radioAutomobile);
		groupe.add(radioCamion);
		groupe.add(radioFourgon);
		
		panel1.add(lblClient);
		panel1.add(txtClient);
		
		panel2.add(lblLocation);
		panel2.add(txtLocation);
		
		panel3.add(radioAutomobile);
		panel3.add(radioCamion);
		panel3.add(radioFourgon);
		
		panel2.add(lblLocation);
		panel2.add(txtLocation);

		panel5.add(lblRabais);
		panel5.add(txtRabais);

		
		panel6.add(btnCalculer);
		panel6.add(btnEffacer);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);

	}
}
