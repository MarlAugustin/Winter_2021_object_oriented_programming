package Laboratoire8;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class FrmFacture extends JFrame {
	
	private JLabel lblPrix = new JLabel ("Prix unitaire:");
	private JLabel lblNom = new JLabel ("Nom du client:");
	private JLabel lblNbre= new JLabel ("Nombre d'items:");
	private JLabel lblTaxe = new JLabel ("Montant après txt:");
	
	private JTextField txtNom = new JTextField (10);// largeur 10
	private JTextField txtPrix = new JTextField (10);// largeur 10
	private JTextField txtNbre = new JTextField (10);// largeur 10
	private JTextField txtTaxe= new JTextField (10);// largeur 10
	
	JButton btnCalculer = new JButton("Calculer");
	JButton btnEffacer = new JButton("Effacer");

	JPanel panel1 = new JPanel ();
	JPanel panel2 = new JPanel ();
	JPanel panel3 = new JPanel ();
	JPanel panel4 = new JPanel ();
	JPanel panel5 = new JPanel ();
	
	public FrmFacture(){
		super("Facture");
		setLayout(new FlowLayout());
		setSize(300,250);
		txtTaxe.setEditable(false);
		btnCalculer.setMnemonic(KeyEvent.VK_C);
		btnEffacer.setMnemonic(KeyEvent.VK_E);
		
		panel1.add(lblNom);
		panel1.add(txtNom);
		
		panel2.add(lblPrix);
		panel2.add(txtPrix);
		
		panel3.add(lblNbre);
		panel3.add(txtNbre);
		
		panel4.add(lblTaxe);
		panel4.add(txtTaxe);
		
		panel5.add(btnCalculer);
		panel5.add(btnEffacer);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);

	}
}
	/*public static void main(String[] args) {
	JFrame fenetre = new JFrame("Facture");
	fenetre.setSize(400,200);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setVisible(true);
		
	}*/

