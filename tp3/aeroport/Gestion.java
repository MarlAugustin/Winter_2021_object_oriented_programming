package aeroport;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		int choix;
		Scanner clavier = new Scanner(System.in);
		Compagnie compagnie1 =new Compagnie("American Airline") ;
		do {
		// TODO Auto-generated method stub
		System.out.println("GESTION DES VOLS");
		System.out.println("	1. Liste des vols");
		System.out.println("	2. Ajout d'un vol");
		System.out.println("	3. Retrait d'un vol");
		System.out.println("	4. Réservation d'un vol");
		System.out.println("Donnez un choix");
		System.out.println("");
		choix=clavier.nextInt();
		
	
		switch (choix){
			case 1:
				System.out.println("affichage de la liste des vols");
				compagnie1.afficher();
				break;
			case 2:
				System.out.println("ajouter un vol");
				compagnie1.inserer();
				break;
			case 3:
				System.out.println("Retirer un vol");
				int volARetirer;
				volARetirer=clavier.nextInt();
				compagnie1.retirer(volARetirer);;
				break;
			case 4:
				System.out.println("Reservation d'un vol");
				int nbReserve;
				nbReserve=clavier.nextInt();
				compagnie1.reserver(nbReserve);
				break;
		}
		}while(choix!=0);
			System.out.println("Bonne journée");
	}
	
}
