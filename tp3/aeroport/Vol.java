package aeroport;

import java.util.Scanner;

public class Vol {
	private int numeroVol;
	private String villeDepart;
	private String destination;
	private int nbReservation;
	Scanner clavier = new Scanner(System.in);
	
	/**
	 * J'ai essay� d'initialiser les donn�es pour les mettres dans le tableau d'objet mais �a ne marchait pas
	public Vol() {
		
		setNumeroVol(1000);
		setVilleDepart("inconnu");
		setDestination("inconnu");
		setNbReservation(0);
		
	}
		 */
	// permet de mettre des donn�es 
	public Vol(int numVol,String villeDep, String desti, int nbReserv) {
	setNumeroVol(numVol);
	setVilleDepart(villeDep);
	setDestination(desti);
	setNbReservation(nbReserv);

	}
	//affiche les diff�rentes les donn�es
	public void afficher() {
		System.out.println("numero de vol : " +numeroVol + " ville de d�part: "+ villeDepart+ " destination : "+ destination + " nombre de r�servation :" +nbReservation);
	}

	// modificateur du numero du vol
	public void setNumeroVol(int numeroVol) {
		if(numeroVol>999 && numeroVol<10000) {
			this.numeroVol = numeroVol;
		}else {
			System.out.println("votre numero de vol est incorrect, �a possede 4 digit. R�essayer");
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
			System.out.println("votre ville de d�part d�passe une longueur de 25 caract�re");
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
		System.out.println("votre destination d�passe une longueur de 25 caract�re");
		destination=clavier.next();
	}

	}

	// accesseur de la destination
	public String getDestinationt() {
		return destination;
	}

	// modificateur du nombre de r�servation
	public void setNbReservation(int nbReservation) {
		this.nbReservation = nbReservation;
	}

	// accesseur du nombre de r�servation
	public int getNbReservation() {
		return nbReservation;
	}

}
