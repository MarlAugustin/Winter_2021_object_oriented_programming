package Question3;

public class Voiture extends Flotte {
private final static int TARIF_JOURNALIER=15;
public Voiture(String marque, int nbJour) {
	super(marque, nbJour);
}
@Override
public double calcTarif() {
	// TODO Auto-generated method stub
	return this.getNombreJour()*TARIF_JOURNALIER;
}
}
