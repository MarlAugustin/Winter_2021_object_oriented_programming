package ex1CodeAUtiliser;

public abstract class Employe implements IPersonne {
	private String nom;
	private String adresse;
	private double salaire;
	

	// Un Constructeur sans paramètres.
	public Employe() {
		
	}

	// Un Constructeur à trois paramètres.
	public Employe(String unNom, String uneAdresse, double unSalaire) {		
		setNom(unNom);
		setAdresse(uneAdresse);
		setSalaire(unSalaire);
	}

	// Un Constructeur à deux paramètres
	public Employe(String unNom, String uneAdresse) {
		setNom(unNom);
		setAdresse(uneAdresse);
	}
	
	
	public void  augmenterSalaire(double taux) {
		salaire = salaire+(salaire*taux/100);
	}
	
	public abstract void calculerSalaire();
	
	public String afficher() {
		return "Employe [nom=" + nom + ", adresse=" + adresse + ", salaire=" + salaire + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adr) {
		adresse = adr;
	}

	public double getsalaire() {
		return salaire;
	}

	public void setSalaire(double sal) {
		salaire = sal;
	}

	

}
