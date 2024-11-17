package aeroport;

import java.util.Scanner;

public class Vol {
	private int numeroVol;
	private String villeDepart;
	private String destination;
	private int nbReservation;
	Scanner clavier = new Scanner(System.in);
	
	/**
	 * J'ai essayé d'initialiser les données pour les mettres dans le tableau d'objet mais ça ne marchait pas
	public Vol() {
		
		setNumeroVol(1000);
		setVilleDepart("inconnu");
		setDestination("inconnu");
		setNbReservation(0);
		
	}
		 */
	// permet de mettre des données 
	public Vol(int numVol,String villeDep, String desti, int nbReserv) {
	setNumeroVol(numVol);
	setVilleDepart(villeDep);
	setDestination(desti);
	setNbReservation(nbReserv);

	}
	//affiche les différentes les données
	public void afficher() {
		System.out.println("numero de vol : " +numeroVol + " ville de départ: "+ villeDepart+ " destination : "+ destination + " nombre de réservation :" +nbReservation);
	}

	// modificateur du numero du vol
	public void setNumeroVol(int numeroVol) {
		if(numeroVol>999 && numeroVol<10000) {
			this.numeroVol = numeroVol;
		}else {
			System.out.println("votre numero de vol est incorrect, ça possede 4 digit. Réessayer");
			numeroVol=clavier.nextInt();
		}
		
	}

	// accesseur du numero du vol
	public int getNumeroVol() {
		return numeroVol;
	}

	// modificateur de la ville Depart
	public void setVilleDepart(String villeDepart) {
		if(villeDepart.length()>0 && villeDepart.length()<25) {
			this.villeDepart = villeDepart;
		}else {
			System.out.println("votre ville de départ dépasse une longueur de 25 caractère");
			villeDepart=clavier.next();
		}
		
	}

	// accesseur de la ville Depart
	public String getVilleDepart() {
		return villeDepart;
	}

	// modificateur de la destination
	public void setDestination(String destination) {	
		if(destination.length()>0 && destination.length()<25) {
		this.destination = destination;
	}else {
		System.out.println("votre destination dépasse une longueur de 25 caractère");
		destination=clavier.next();
	}

	}

	// accesseur de la destination
	public String getDestinationt() {
		return destination;
	}

	// modificateur du nombre de réservation
	public void setNbReservation(int nbReservation) {
		this.nbReservation = nbReservation;
	}

	// accesseur du nombre de réservation
	public int getNbReservation() {
		return nbReservation;
	}

}
