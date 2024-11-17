package banque;

import java.util.Scanner;

public class Compte {
	private double montant;
	private int numero;
	private String proprietaire;
	private static final int NUM_MIN = 100000;
	private static final int NUM_MAX = 999999;

	public Compte() {
	setMontant(0);
	setNumero(100000);
	setProprietaire("Inconnu");

	}
	public Compte (String proprietaire ,  int numero,double montant ){
		this.proprietaire=proprietaire;
		this.numero=numero;
		this.montant=montant;
	}
	public void lireCompte() {
		

	}
	public int lireNumero(){
	Scanner sc =new Scanner (System.in);
		int entree=0;
		while(entree>NUM_MAX && entree>NUM_MIN) {
			System.out.println("Écrivez votre numero");
			try {
			entree =Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException errFormat) {
			System.out.println("|nUne erreur de format");
		}
		
		
		}
		return entree;
	}
	public double lireMontant() {
		System.out.println("|nUne erreur de format");

		
		return montant;
	}
	public String lireProprietaire() {
		System.out.println("|nUne erreur de format");

		
		return proprietaire;
	}
	
	public void retirer(double somme) {
		if(somme<=montant) {
			montant=somme-montant;
		}else  {
		System.out.println("Le solde est insuffisant");	
		}
		
	}
	public void deposer (double somme) {
		montant=montant+somme;
	}
	public void afficherCompte () {
		System.out.println("Proprietaire :"+proprietaire +" numero :" +numero +" montant"+montant);
	}
	// Modificateur de proprietaire
	public void setProprietaire (String proprietaire) {
		this.proprietaire=proprietaire;
	}
	// Accesseur du proprietaire
	public String getProprietaire(){
		return proprietaire;
	}
	// Modificateur de numero
	public void setNumero (int numero){
		this.numero=numero;
	}
	// accesseur de numero
	public int getNumero(){
		return numero;
	}
	// Modificateur du montant
	public void setMontant(double montant) {
		this.montant=montant;
	}
	// accesseir du montant
	public double getMontant() {
		return montant;
	}
	
}
