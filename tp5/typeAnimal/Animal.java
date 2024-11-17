package typeAnimal;

public abstract class Animal implements Comparable {
	private String id, nom;
	private int nbPatte;
	private double poids;
	private char genre;
	private static final String SEXUE = "sexuée";
	private static final String ASEXUE = "asexuée";
	private static final String NAGE = "nage";
	private static final String MARCHE = "marche";

//constructeur par défaut
	public Animal() {
	}

//constructeur paramétré
	public Animal(String id, String nom, int nbPatte,double poids, char genre) {
		this.id = id;
		this.nom = nom;
		this.nbPatte = nbPatte;
		this.setPoids(poids);
		this.genre = genre;
	}

//méthode abstraites
	public abstract String seReproduire();

	public abstract String seDeplace();

	public abstract String accouchePond();

//méthode
	@Override
	public String toString() {
		return this.getClass().getName() + " :" + " id =" + id + ", nom =" + nom + ", nbPatte =" + nbPatte + ", poids"+", genre ="
				+ genre + ", reproduction= " + seReproduire() + ", deplacement = " + seDeplace()
				+ ",	Accouche ou pond = " + accouchePond();

	}

	@Override
	public boolean equals(Object autre) {
		if (this == autre) {
			return true;
		}
		if (!(autre instanceof Animal))
			return false;
		Animal autreAnimal = (Animal) autre;
		return (id == autreAnimal.id);
	}

	@Override
	public int compareTo(Object o) {
		int compare;
		if (this.poids == ((Animal) o).poids) {
			compare = 0;
		} else if (this.poids < ((Animal) o).poids) {
			compare = -1;
		} else {
			compare = 1;
		}
		return compare;
	}

//setter et getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPatte() {
		return nbPatte;
	}

	public void setNbPatte(int nbPatte) {
		this.nbPatte = nbPatte;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}

}
