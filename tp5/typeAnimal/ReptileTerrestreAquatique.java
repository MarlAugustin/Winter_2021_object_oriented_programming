package typeAnimal;

public abstract class ReptileTerrestreAquatique extends Reptile  implements IAquatique,ITerrestre  {
	public ReptileTerrestreAquatique() {
	}
	public ReptileTerrestreAquatique (String id, String nom, int nbPatte,double poids, char genre,boolean venimeux) {
		super.setId(id);;
		super.setNom(nom);
		super.setNbPatte(nbPatte);
		super.setPoids(poids);
		super.setGenre(genre);
		super.setVenimeux(venimeux);
	}
	public String vitSurTerre() {
		return "je vis sur la terre";
	}

	public String vitDansEau() {
		return "je vis dans l'eau";
	}

	@Override
	public String toString() {
		return super.toString() + " , millieu de vie: " + vitDansEau() + " et " + vitSurTerre();
	}
}
