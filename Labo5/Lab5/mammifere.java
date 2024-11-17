package Lab5;

public class mammifere extends Animal {
	private int nbMoisAvantAccouchement;
	
	
	public mammifere(int pattes, boolean pelage, int nbMoisAvantAccouchement) {
		super(pattes,pelage);
		setNbMoisAvantAccouchement(nbMoisAvantAccouchement);
	}
	
	public void setNbMoisAvantAccouchement(int nbMoisAvantAccouchement) {
		this.nbMoisAvantAccouchement=nbMoisAvantAccouchement;
	}public int getNbMoisAvantAccouchement(){
		return nbMoisAvantAccouchement;
	}
	@Override
	public void deplacer() {
		System.out.println("Je me déplace comme un mammifère");
	}


}
