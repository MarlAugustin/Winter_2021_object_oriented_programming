package Laboratoire1;

import java.util.Scanner;

public class Etudiant1 {

		private String nom;
		private String prenom;
		//private String adresse;
		private int nombreMinutesAccumulees;
		private String codeEtudiant;
		private Instructeur  inst;
		
		public Etudiant1(String nom, String prenom,String codeEtudiant,  Instructeur inst) {
			this.nom = nom;
			this.prenom = prenom;
			//this.adresse = adresse;
			this.inst=inst;
			setCodeEtudiant(codeEtudiant);
			//this.nombreMinutesAccumulees = 0;
			
		}
		Etudiant1() {
			
			
		}
			public void prendreLeçon(int durée) {
			  nombreMinutesAccumulees+=durée;
		}

		
		// Modificateur de nom
		public void setNom(String nom) {
			this.nom = nom;
		}

		// Accesseur du nom
		public String getNom() {
			return nom;
		}

		public void setPrenom(String prénom) {
			this.prenom = prénom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setNombreMinutesAccumulees(int nombreMinutesAccumulees) {

			this.nombreMinutesAccumulees = nombreMinutesAccumulees;

		}

		public int getNombreMinutesAccumulees() {
			return nombreMinutesAccumulees;
		}

		public void setCodeEtudiant(String codeEtudiant) {
			if (codeEtudiant.length() == 3) {
				this.codeEtudiant = codeEtudiant;
			} else {
				System.out.println("le code n'est pas valide");
			}
		}

		
		public void setInst(Instructeur setInst) {
			this.inst = inst;
			
		}

		public Instructeur getInst() {
			return inst;
		}
		

		

	

		public void affichage() {
			System.out.println("nom : " + nom + " prenom :" + prenom + " Instructeur: "+inst.getNom() + " " + inst.getPrénom() + " code Étudiant: "
					+ codeEtudiant);
		}

		public void passerExamen() {
			if (nombreMinutesAccumulees >= 1200) {
				System.out.print("L'étudiant peut passer l’examen de conduite");
			} else {
				nombreMinutesAccumulees+=nombreMinutesAccumulees;
				System.out.print("L'étudiant ne peut pas passer l’examen de conduite");

			}

		}

}
