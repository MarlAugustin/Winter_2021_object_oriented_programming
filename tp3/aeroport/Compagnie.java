package aeroport;
import java.util.Scanner;


public class Compagnie {
	private String nomCompagnie;
	private static final int NB_PLACES_MAX= 210;
	private static final int NB_MAXIMUM_VOL = 10;
    private Vol tableauVol[];
	private int nbVols=0;

	//on donne un nom à la compagnie et on initialise le tableau des Vols d'avion
	public Compagnie(String nomCompa) {
		this.nomCompagnie=nomCompa;
		 tableauVol= new Vol [NB_MAXIMUM_VOL];
		/**
		 for(int i=0;i<9;i++) {
			tableauVol[i]=new Vol();
			nbVols++;
		}*/
	}
	//permet de voir si la valeur rechercher est déjà inscrite dans le tableau
	private int rechercher (int rechercheNumVol) {
		boolean trouve=false;
		int i=0;
		while (!trouve &&  i< nbVols) {
		if(rechercheNumVol==tableauVol[i].getNumeroVol()) {
			trouve=true;
		}else {
			i++;
		}
		
		}if (trouve) {
			return i;
		}else {
			System.out.println("Le compte n'existe pas!");
		return -1;
		}
		
	}
	//ça permet d'inserer un nouveau numero de vol dans le tableau si elle n'a pas déjà utiliser
	public void inserer () {
		Scanner clavier = new Scanner(System.in);
		if(nbVols<NB_MAXIMUM_VOL) {
			int numeroInserer=clavier.nextInt();
			int reponse=rechercher(numeroInserer);
			if(reponse==-1){
				System.out.println("Quelle est votre destination");
				String destination=clavier.next();
				System.out.println("Quelle est votre ville de départ?");
				String villeDepart=clavier.next();
				Vol vol= new Vol(numeroInserer,destination,villeDepart,0);
				tableauVol[nbVols]=vol;
				nbVols++;
			}else {
				System.out.println("Le numéro de vol existe déjà");
			}
 		}else {
			System.out.println("Le nombre de vol limite est rempli");
		}
		}
	//cette méthode permet de retirer le nombre inscrit par l'usager
	public void retirer (int numVolARetirer) {
		int resultat=rechercher(numVolARetirer);
		if(resultat!=-1) {
			for(int j=resultat; j<nbVols-1;j++) {
				tableauVol[j]=tableauVol[j+1];
			}
				nbVols--;
				tableauVol[nbVols]= null;
			}else {
				System.out.println("Ce numéro n'existe pas");
			}
		}
	//permet de reserver une place
	public void reserver (int rechercheNumVol) {
		int reservationTot;
		int resultat=rechercher(rechercheNumVol);
		reservationTot=tableauVol[resultat].getNbReservation();
		if(resultat!=-1) {
		if(reservationTot!= NB_PLACES_MAX);{
			tableauVol[resultat].setNbReservation(reservationTot++);
		} if(reservationTot>= NB_PLACES_MAX) {
			System.out.println("Il n'y a plus de place disponible pour réserver.");
		}
		}else {
			System.out.println("Ce numero n'existe pas");	
		}
		
	}
	//affiche les informations obtenus 
	public void afficher (){
		for (int i=0; i<NB_MAXIMUM_VOL; i++) {
		System.out.println(" nom de compagnie " + nomCompagnie);
		tableauVol[i].afficher();
		}
	}
	

}
