package typeAnimal;

public class Crocodile extends ReptileTerrestreAquatique {
	public Crocodile() {}
	public Crocodile(String id, String nom, int nbPatte,double poids, char genre,boolean venimeux) {
		super.setId(id);;
		super.setNom(nom);
		super.setNbPatte(nbPatte);
		super.setPoids(poids);
		super.setGenre(genre);
		super.setVenimeux(venimeux);
	}
	public String seReproduire() {
		return "sexuée";
	}
	public String seDeplace() {
		return "marche avec ses "+ super.getNbPatte() +" de pattes";
	}
}
