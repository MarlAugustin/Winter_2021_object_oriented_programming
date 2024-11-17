package exercice2;

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

public class FrmFacture extends JFrame {

	private JButton btnCalculer = new JButton("Calculer");
	private JButton btnEffacer = new JButton("Effacer");

	private JLabel lblNom = new JLabel("Nom du client:        ");
	private JTextField txtNom = new JTextField(10);

	private JLabel lblDuree = new JLabel("Durée de location: ");
	private JTextField txtDuree = new JTextField(10);

	private JLabel lblMontant = new JLabel("Montant total:         ");
	private JTextField txtMontant = new JTextField(10);

	private JLabel lblRabais = new JLabel("Montant rabais:     ");
	private JTextField txtRabais = new JTextField(10);

	private JRadioButton radioAuto = new JRadioButton("Automobile");
	private JRadioButton radioCamion = new JRadioButton("Camion");
	private JRadioButton radioFourgon = new JRadioButton("Fourgon");

	private ButtonGroup groupe = new ButtonGroup();

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();

	public FrmFacture() {
		super("LocAutos - Facture");
		setLayout(new FlowLayout());
		setSize(300, 300);

		txtMontant.setEditable(false);
		txtRabais.setEditable(false);

		btnCalculer.setMnemonic(KeyEvent.VK_C);
		btnEffacer.setMnemonic(KeyEvent.VK_E);

		// Boutons radio
		// Ajouter un titre
		panel3.setBorder(BorderFactory.createTitledBorder(" Type de véhicule "));
		// Les mnémonique
		radioAuto.setMnemonic(KeyEvent.VK_A);
		radioCamion.setMnemonic(KeyEvent.VK_M);
		radioFourgon.setMnemonic(KeyEvent.VK_F);

		// Selectionner le bouton radioAuto
		radioAuto.setSelected(true);

		// ajouter les boutons au groupe
		groupe.add(radioAuto);
		groupe.add(radioCamion);
		groupe.add(radioFourgon);

		// ajouter les boutons radio au panneau
		panel3.add(radioAuto);
		panel3.add(radioCamion);
		panel3.add(radioFourgon);

		panel1.add(lblNom);
		panel1.add(txtNom);
		panel2.add(lblDuree);
		panel2.add(txtDuree);

		panel4.add(lblMontant);
		panel4.add(txtMontant);

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
