package typeAnimal ;

public abstract class ReptileAquatique extends Reptile  implements IAquatique {
	public ReptileAquatique() {}
	public ReptileAquatique (String id, String nom, int nbPatte,double poids, char genre,boolean venimeux) {
			super.setId(id);;
			super.setNom(nom);
			super.setNbPatte(nbPatte);
			super.setPoids(poids);
			super.setGenre(genre);
			super.setVenimeux(venimeux);
		}
	public String vitDansEau() {
		return "je vis dans l'eau";
	}
	@Override
	public String toString() {
		return super.toString()+" , millieu de vie: "+vitDansEau();
		
	}
}
