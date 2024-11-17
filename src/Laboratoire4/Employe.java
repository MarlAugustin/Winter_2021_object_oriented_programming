package Laboratoire4;

	public class Employe {
		private String nom;
		private String adresse;
		private double salaire;

		// Un Constructeur sans paramètres.
		public Employe() {
			System.out.println("Classe Employe:Constructeur sans paramètres");
		}

		// Un Constructeur à trois paramètres.
		public Employe(String unNom, String uneAdresse, double unSalaire) {
			System.out.println(
					"Classe Employe:Constructeur avec 3 paramètres: " + unNom + ", " + uneAdresse + ", " + unSalaire);
			nom = unNom;
			adresse = uneAdresse;
			salaire = unSalaire;
		}
		

		// Un Constructeur à deux paramètres
		public Employe(String unNom, String uneAdresse) {
			System.out.println("Classe Employe:Constructeur avec 2 paramètres: " + unNom + ", " + uneAdresse);
			nom = unNom;
			adresse = uneAdresse;
		}

		public void calculerSalaire() {
		}
		public void afficher() {
			System.out.print("Employe [nom=" + nom + ", adresse=" + adresse + ", salaire=" + salaire + "]");
		}
		public void lire() {
			setNom(lireString());
			setAdresse(lireAdresse());
			setSalaire(lireSalaire());
		}private String lireString() {
			return Lecture.lireString("Donnez votre nom:");
		}private String lireAdresse() {
			return Lecture.lireString("Donnez votre adresse:");
		}private double lireSalaire() {
			return Lecture.lireDouble("Donnez votre salaire:");
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

		public void augmenterSalaire(double taux) {
			salaire = salaire + (salaire * taux);
		}

	}

