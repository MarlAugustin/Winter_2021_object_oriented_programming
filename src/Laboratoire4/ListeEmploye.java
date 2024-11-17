package Laboratoire4;

import java.util.Scanner;

public class ListeEmploye {
	public static final int MAX_EMPLOYES = 5; // la taille maximale du tableau tabEmploye
	public static final char EMPLOYE = 'E';
	public static final char SECRETAIRE = 'S';
	public static final char MANAGER = 'M';
	private Employe tabEmploye[]; //tableau d'employé
	private static int nbEmploye=0; // nombre d'employé dans le tableau tabEmploye
	
	char reponseUsager=' ';
    public ListeEmploye() {
    		tabEmploye=new Employe [MAX_EMPLOYES];    	
    }
	public void ajouterEmploye () {
		Scanner clavier = new Scanner(System.in);
		char continuer='o';
		System.out.println("Ajoutez un employé ");
		System.out.println("Entrez le code employé ");
		System.out.println("	M pour Manager ");
		System.out.println("	S pour Secretaire ");
		System.out.println("	E pour Employé ");
		char reponseUsager=clavier.next().charAt(0);
		while(!estPlein() && continuer=='o') {
			switch (reponseUsager) {
		case 'S':
			Employe secretaire= new Secretaire();
			secretaire.lire();
			ajouterEmplTab(secretaire);
			break;
		case 'M':
			Employe manager= new Manager();
			manager.lire();
			ajouterEmplTab(manager);
			break;
		case 'E':
			Employe empl= new Employe();
			empl.lire();
			ajouterEmplTab(empl);
			break;
		default:
			System.out.println("le caractère saisi est invalide");
			break;
		}
			System.out.println("Voulez-vous créer un autre employe 0/n ");
			continuer=clavier.next().charAt(0);
		}
		clavier.close();
	}
	public void afficherEmploye() {
		for(int i=0 ; i<nbEmploye;i++) {
			tabEmploye[i].afficher();
			System.out.println();
		}
		
	}
	public void ajouterEmplTab(Employe empl) {
		if(!estPlein()) {
			tabEmploye[nbEmploye]=empl;
			nbEmploye++;
		}
	}	private void modifierSalaireHoraireSecretaire(double nouveauTaux) {
		for(int i=0 ; i<nbEmploye;i++) {
			if(tabEmploye[i] instanceof Secretaire) {
				((Secretaire)tabEmploye[i]).setTauxHoraire(nouveauTaux);
			}
		}
	}
	
	private boolean estPlein() {
		 if (nbEmploye==MAX_EMPLOYES) {
			return true;
		}else {
			return false;
		}
    	  }
    	   // retourne vrai si tabEmploye est pleine
       private boolean estVide() {
       return nbEmploye==0;
       }
    	   
// retourne vrai si tabEmploye est vide
       private int taille() {
	return nbEmploye;
       } //retourne la taille du tableau qui nbEmploye

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeEmploye liste= new ListeEmploye();
		liste.ajouterEmploye();
		liste.afficherEmploye();
		liste.modifierSalaireHoraireSecretaire(35);
		liste.afficherEmploye();
	}


}
