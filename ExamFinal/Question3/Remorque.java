package Question3;

public class Remorque extends Flotte {

public final static int TARIF_JOURNALIER=60;
public int capacite;

public Remorque(String marque, int nombreJour,int capacite) {
		super(marque, nombreJour);
		setCapacite(capacite);
		}
@Override
public double calcTarif() {
	return (this.getNombreJour()*TARIF_JOURNALIER);
}
public String chargeMax() {
	return " Je peux porter "+capacite +" kg";
}
public int getCapacite() {
	return capacite;
}
public void setCapacite(int capacite) {
	this.capacite = capacite;
}
}
