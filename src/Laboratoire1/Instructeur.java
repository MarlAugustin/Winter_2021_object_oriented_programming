package Laboratoire1;

import java.util.Scanner;

public class Instructeur {
	private String nom;
	private String prenom;
	private String adresse;
	private String codeInstructeur;

	

	public Instructeur(String nom, String prenom, String adresse, String codeInstructeur) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		setCodeInstructeur(codeInstructeur);
		
	}
	public Instructeur() {
		nom=" ";
		prenom=" ";
		adresse=" ";
		codeInstructeur=" ";
	}
	// Modificateur de nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	// Accesseur du nom
	public String getNom() {
		return nom;
	}

	public void setPrénom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrénom() {
		return prenom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setCodeInstructeur(String codeInstructeur) {
		if(codeInstructeur.length()==3) {
			this.codeInstructeur=codeInstructeur;
		}else {
			System.out.println("le code n'est pas valide");
		}
	}

	public String getCodeInstructeur() {
		return codeInstructeur;
	}
	public void affichage() {
		System.out.println("nom : "+ nom+ " prenom :"+ prenom + " adresse: "+adresse +  " code instructeur: "+codeInstructeur);	
	}

	

}
