package question2;

public class Employe {
	
	public static String matricule;
	private String nom;
	private String prenom;
	private int age;
	private String departement;
	private double salaire;
	private int nbHeure;
	private double chAffaire = 0;
	public static int nbEmploye = 0;
	private static final int ageRetraite = 60;
	private static final String DEPARTEMENT_VENTE = "Vente";
	private static final String DEPARTEMENT_PRODUCTION = "Production";
	private static final String DEPARTEMENT_FINANCE = "Finance";

	public Employe(String matricule, String nom, String prenom, int age, String departement, double salaire,
			int nbHeure, double chAffaire) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.departement = departement;
		this.salaire = salaire;
		this.nbHeure = nbHeure;
		this.chAffaire = chAffaire;
		nbEmploye++;
	}

	public void modifierSalaire() {
		salaire = Salaire.calculer(nbHeure, chAffaire, departement);
	}

	public void affichage() {
		System.out.println(" matricule: " + matricule + " nom : " + nom + " prenom :" + prenom + " age: " + age
				+ " departement :" + departement + " salaire: " + salaire + " nb heure: " + nbHeure
				+ " chiffre affaire: " + chAffaire);
	}
	public boolean estRetraite() {
		boolean reponse;
		if(age==ageRetraite) {
			reponse=true;
		}else {
			reponse=false;
		}
		return reponse;
	}

	// Modificateur de nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	// Accesseur du nom
	public String getNom() {
		return nom;
	}

	// Modificateur de prenom
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// Accesseur du prenom
	public String getPrenom() {
		return prenom;
	}

	// Modificateur d'age
	public void setAge(int age) {
		this.age = age;
	}

	// Accesseur d'age
	public int getAge() {
		return age;
	}

	// Modificateur de departement
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	// Accesseur du departement
	public String getDepartement() {
		return departement;
	}

	// Modificateur de departement
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	// Accesseur du salaire
	public double getSalaire() {
		return salaire;
	}

	// Modificateur d'heure
	public void setNbHeure(int nbHeure) {
		if (nbHeure >= 0 || nbHeure <= 200) {
			this.nbHeure = nbHeure;
		} else {
			System.out.println("hors de la plage d'heure");
		}

	}

	// Accesseur du salaire
	public double getNbHeure() {
		return nbHeure;
	}

	// Modificateur d'heure
	public void setChAffaire(double chAffaire) {
		this.chAffaire = chAffaire;
	}

	// Accesseur du salaire
	public double getChAffaire() {
		return chAffaire;
	}

}
