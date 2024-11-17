package Question3;

public abstract class Flotte {
private String marque;
private int nombreJour;

public  Flotte(String marque, int nombreJour) {
	this.marque=marque;
	this.nombreJour=nombreJour;
}
public abstract double calcTarif();
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public int getNombreJour() {
	return nombreJour;
}
public void setNombreJour(int nombreJour) {
	this.nombreJour = nombreJour;
}
}
