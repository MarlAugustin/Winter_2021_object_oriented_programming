package typeAnimal;

public class LezardQueueDeFouet extends ReptileTerrestre  {
	public LezardQueueDeFouet() {
	}
	public LezardQueueDeFouet(String id, String nom, int nbPatte,double poids, char genre,boolean venimeux) {
		super.setId(id);;
		super.setNom(nom);
		super.setNbPatte(nbPatte);
		super.setPoids(poids);
		super.setGenre(genre);
		super.setVenimeux(venimeux);
	}
	public String seReproduire() {
		return "asexuée";
	}
	public String seDeplace() {
		return "marche avec ses "+ super.getNbPatte() +" de pattes";
	}
}
