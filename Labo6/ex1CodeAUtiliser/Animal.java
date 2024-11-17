package ex1CodeAUtiliser;

public class Animal implements Affichable{
private int nbpattes;
private String nom;
private String milieu;

public Animal( String nom,String milieu,int pattes) {
	setNbPattes(pattes);
	setNom(nom);
	setMilieu(milieu);
	
}
public int getNbPattes() {
	return nbpattes;
}
public void setNbPattes(int pattes) {
	this.nbpattes = pattes;
}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getMilieu() {
	return milieu;
}
public void setMilieu(String milieu) {
	this.milieu = milieu;
}
public void reproduire() {
	System.out.println("Je me reproduis");
}
public void manger() {
	System.out.println("Je mange");
}
@Override
public String afficher() {
	return "nom="+nom +"milieu="+milieu+" nbPatte="+nbpattes;
}
}

