package question1;


public class Etudiant {


		private String nom;
		private String prenom;
		private char sexe;
		private String adresse;
		private String matricule;
		public static int nbEtudiant=0;
		private double note;
		private double seuil;
		private Enseignant enseignant;

		public Etudiant(String nom, String prenom, char sexe, String adresse, String matricule, double note,
				Enseignant enseignant) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.matricule = matricule;
			this.note = note;
			this.enseignant = enseignant;
			nbEtudiant++;
		}


		public void reussir() {
				seuil=note;
				if (seuil>=60) {
					System.out.println(nom+ " "+prenom+ " "+", vous avez réussi");
			}else {
				System.out.println("");
			}
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
			public void setPrenom(String prénom) {
				this.prenom = prénom;
			}
			
			// Accesseur du prenom
			public String getPrenom() {
				return prenom;
			}
			// Modificateur de sexe
			public void setSexe(char sexe) {
				this.sexe = sexe;
			}
			// acesseur du sexe

			public char getSexe() {
				return sexe;
			}
			// Modificateur d'adresse

			public void setAdresse(String adresse) {
				this.adresse = adresse;
			}
			// accesseur d'adresse

			public String getAdresse() {
				return adresse;
			}

			// Modificateur de matricule
			public void setMatricule(String matricule) {
				if (matricule.length() == 6) {
					this.matricule = matricule;
				} else {
					System.out.println("la matricule n'est pas valide");
				}
			}
			// accesseur matricule
			public String getMatricule() {
				return matricule;
			}	
				
			// Modificateur de enseignant
			public void setEnseignant(Enseignant enseignant) {
				this.enseignant = enseignant;
				
			}
			// accesseur Enseignant

			public Enseignant getEnseignant() {
				return enseignant;
			}
			// Modificateur de note

			public void setNote(double note) {
				if (note>=0 || note<=100) {
					this.note = note;
				} else {
					System.out.println("la note n'est pas valide");
				}
				
				
			}
			// accesseur de note

			public double getNote() {
				return note;
			

			}
			//modificateur du seuil
			public static void setSeuil(int seuil) {
				if (seuil>=0 && seuil<=100) {
				System.out.println(" ");
				} else {
					System.out.println("le seuil n'est pas valide");
				}
				
			}
			// accesseur du seuil

			public double getSeuil() {
				return seuil;
			}
	}


	
