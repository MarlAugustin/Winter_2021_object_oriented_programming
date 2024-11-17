package GestionEtudiant;

import java.util.Scanner;

public class Etudiant {

	private String nom;
	private String prenom;
	private char sexe;
	private String adresse;
	private String matricule;
	private double note;
	private Enseignant enseignant;
	public static int nbEtudiant=0;
	
	public Etudiant(String nom, String prenom, char sexe, String adresse, String matricule, double note,
			Enseignant enseignant) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.matricule = matricule;
		this.note = note;
		this.enseignant = enseignant;
		nbEtudiant++;
	}

	Etudiant() {
	}

	public void reussir() {
			if (note>=60) {
				System.out.println("Vous avez réussi");
		}else {
			System.out.println("vous n'avez pas réussi");
		}
	}
		// Modificateur de nom
		public void setNom(String nom) {
			this.nom = nom;
		}

		// Accesseur du nom
		public String getNom() {
			return nom;
		}
		
		// Modificateur de prenom
		public void setPrenom(String prénom) {
			this.prenom = prénom;
		}
		
		// Accesseur du prenom
		public String getPrenom() {
			return prenom;
		}
		// Modificateur de sexe
		public void setSexe(char sexe) {
			this.sexe = sexe;
		}
		// acesseur du sexe

		public char getSexe() {
			return sexe;
		}
		// Modificateur d'adresse

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		// accesseur d'adresse

		public String getAdresse() {
			return adresse;
		}

		// Modificateur de matricule
		public void setMatricule(String matricule) {
			if (matricule.length() == 6) {
				this.matricule = matricule;
			} else {
				System.out.println("la matricule n'est pas valide");
			}
		}
		// accesseur matricule
		public String getMatricule() {
			return matricule;
		}	
			
		// Modificateur de enseignant
		public void setEnseignant(Enseignant enseignant) {
			this.enseignant = enseignant;
			
		}
		// accesseur Enseignant

		public Enseignant getEnseignant() {
			return enseignant;
		}
		// Modificateur de note

		public void setNote(double note) {
			if (note>=0 || note<=100) {
				this.note = note;
			} else {
				System.out.println("la note n'est pas valide");
			}
			
			
		}
		// accesseur de note

		public double getNote() {
			return note;
		

		}

}
