package exercice1;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmFacture extends JFrame {

	private JButton btnCalculer = new JButton("Calculer");
	private JButton btnEffacer = new JButton("Effacer");

	private JLabel lblNom = new JLabel("Nom du client:      ");
	private JTextField txtNom = new JTextField(10);

	private JLabel lblPrixUnitaire = new JLabel("Prix unitaire:         ");
	private JTextField txtPrixUnitaire = new JTextField(10);

	private JLabel lblNbItems = new JLabel("Nombre d'items:   ");
	private JTextField txtNbItems = new JTextField(10);

	private JLabel lblMontant = new JLabel("Montant après tx:");
	private JTextField txtMontant = new JTextField(10);

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();

	public FrmFacture() {
		super("Facture - Ordinateurs en gros");
		setLayout(new FlowLayout());
		setSize(300, 250);
		txtMontant.setEditable(false);
		btnCalculer.setMnemonic(KeyEvent.VK_C);
		btnEffacer.setMnemonic(KeyEvent.VK_E);

		panel1.add(lblNom);
		panel1.add(txtNom);
		panel2.add(lblPrixUnitaire);
		panel2.add(txtPrixUnitaire);
		panel3.add(lblNbItems);
		panel3.add(txtNbItems);
		panel4.add(lblMontant);
		panel4.add(txtMontant);
		panel5.add(btnCalculer);
		panel5.add(btnEffacer);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
