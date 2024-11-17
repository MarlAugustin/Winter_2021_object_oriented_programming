package InterfaceGraphique;



public class Etudiant implements Comparable {



	private String numeroAdmission;



	private String nom;



	private String prenom;



	private int age;



	public Etudiant(String numeroAdmission, String nom, String prenom, int age) {



		this.numeroAdmission = numeroAdmission;



		this.nom = nom;



		this.prenom = prenom;



		this.age = age;



	}



	public String getNumeroAdmission() {



		return numeroAdmission;



	}



	public String getNom() {



		return nom;



	}



	public String getPrenom() {



		return prenom;



	}



	public int getAge() {



		return age;



	}



	// Question1.1.2

	@Override

	public int compareTo(Object o) {

		int compare;

		if (age == ((Etudiant) o).getAge()) {

			compare = 0;

		} else if (age < ((Etudiant) o).getAge()) {

			compare = -1;

		} else {

			compare = 1;

		}

		return compare;

	}



	// Question1.2

	@Override

	public boolean equals(Object autre) {

		

		if (this == autre) {

			return true;

		}

		if (!(autre instanceof Etudiant))

			return false;

		Etudiant autreEtudiant = (Etudiant) autre;

		return (nom == autreEtudiant.nom);

	}



	// Question1.3

	public String toString() {

		return " Admission: " + numeroAdmission + " Nom: " + nom + " Prenom: " + prenom + " Age: " + age;

	}



	public static void main(String[] args) {



		Etudiant etudiant1 = new Etudiant("202010222", "Rivard", "Julie", 63);



		Etudiant etudiant2 = new Etudiant("201903555", "Audette", "Alain", 18);



		Etudiant etudiant3 = new Etudiant("202010222", "", "", 0);



		// Question 2.1

		int resultat = etudiant1.compareTo(etudiant2);

		if (resultat == 1) {

			System.out.println(etudiant1.getNom() + " est plus age que " + etudiant2.getNom());

		} else if (resultat == -1) {

			System.out.println(etudiant1.getNom() + " est moins age que " + etudiant2.getNom());

		}



		// Question 2.2

		boolean reponse = etudiant1.equals(etudiant3);

		if (reponse == false) {

			System.out.println(etudiant1.getNom() + " et l'inconnu sont différents");



		} else {

			System.out.println(etudiant1.getNom() + " et l'inconnu sont identiques");

		}



		// Question2.3

		System.out.println(etudiant1.toString());



	}

	

}

