package Lab5;

public abstract class Animal {
private int pattes;
private boolean pelage;

public Animal(int pattes, boolean pelage) {
	setPattes(pattes);
	setPelage(pelage);
}
public int getPattes() {
	return pattes;
}
public void setPattes(int pattes) {
	this.pattes = pattes;
}
public boolean isPelage() {
	return pelage;
}
public void setPelage(boolean pelage) {
	this.pelage = pelage;
}
public void respirer() {
	System.out.println("Mammifère qui respire");
}
public void manger() {
	System.out.println("Mammifère qui mange");
}
public abstract void deplacer() ;
}
