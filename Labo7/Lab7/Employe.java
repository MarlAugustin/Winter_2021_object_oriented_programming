package Lab7;

public abstract class Employe implements Comparable{
		private String nom;
		private String adresse;
		private double salaire;
		
		@Override
		public String toString() {
			return "Employe[nom=" +nom +" adresse="+adresse +"salaire=" +salaire +" ]";
			
		}@Override
		public int compareTo(Object autre) {
			int compare;
			double seuil=0.00001;
			Employe autreEmploye = (Employe) autre;
			if(Math.abs(this.salaire-autreEmploye.salaire)<seuil) {
				compare=0;
			}else if(this.salaire< autreEmploye.salaire) {
				compare=-1;	
			}else {
				compare=1;
			}
			return compare;
		}

		@Override
		public boolean equals(Object autre) {
			boolean compare=false;
			if(this==autre ) 
				compare=true;
			if(!(autre instanceof Employe)) 
				compare=false;
			
			Employe autreEmp=(Employe)autre;
			if(adresse==null ) 
			{
			if(autreEmp.adresse!=null) {
				return false;
			}
			}else if (!adresse.equals(autreEmp.adresse))
				return false;
					
			//les adresses sont les mêmes à se niveau
			if(nom==null) {
				if(autreEmp.nom!=null) {
					return false;
				}
			}else if (!nom.equals(autreEmp.nom)) {
				return false;
			}
			//les noms sont les mêmes à se niveau
			return true;
		}
		

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
		
		
		public void augmenterSalaire(double taux) {
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


