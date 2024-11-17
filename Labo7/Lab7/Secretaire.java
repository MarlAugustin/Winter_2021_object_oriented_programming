package Lab7;


public class Secretaire extends Employe{
	private double tauxHoraire;
	private int nbHeure;
	
	@Override
	public String toString() {
		return "Secretaire [tauxHoraire=" +tauxHoraire + "nbHeure=" +nbHeure + "] "+super.toString();
	}
	@Override
	public boolean equals(Object autre) {
		//on v�rifie pour voir si les deux objet on la m�me adresse
		boolean reponse=false;
		double seuil = 0.0001;
		//1er cas: m�me objet
		if (this==autre) {
			reponse= true;
		}//2�me cas : le cas o� il n'y a pas d'instance secretaire
		if (!(autre instanceof Secretaire)) {
			reponse=false;
		}
		//3�me cas : tester l'�galit� des attrivurs
		if (!(super.equals(autre))) {
			reponse= false;
		}
		//Ici: nom et adresse sont les m�mes
		if (super.equals(autre)==true) {
			Secretaire autreSecretaire=(Secretaire)autre;
			if((Math.abs(autreSecretaire.tauxHoraire - this.tauxHoraire) < seuil) && autreSecretaire.nbHeure==this.nbHeure) {
				reponse=true;
			}else {
				reponse=false;
			}
		}
		
		return reponse;
	}
	

	public Secretaire(double tauxHoraire, String nom, String adresse) {
		 //appel du constructeur � 2 param�tres de classe Employ�,
		//il faut que l'appel du constructeur soit tjrs dans la premi�re ligne
		//Si vous n'appelez pas le constructeur de la superclasse, le compilateur
		//java le fera implicitement et il appelera le constructeur par d�faut - sans param�tres-
		super(nom, adresse);
		setTauxHoraire(tauxHoraire); // rajouter l'initialisation des attributs declar�s dans la sous classe Secreataire : tauxHoraire
	}

	public Secretaire(double tauxHoraire, int nbHeure, String nom, String adresse) {
		this(tauxHoraire, nom, adresse);
		setNbHeure (nbHeure);
	}
	
	public Secretaire() {
		//appel du constructeur par d�faut de la superclasse Employ�, on a pu omettre cette instruction et java le fera pour nous
		super();
	}
	//red�finition de la m�thode calculerSalaire d�finie dans la classe Employ�
	@Override
	public void calculerSalaire() {
		//appel de la m�thode setSalaire d�finie dans la superclasse Employe
		super.setSalaire(tauxHoraire*nbHeure);  
	}

	//red�finition de la m�thode afficher d�finie dans la classe Employ�
	@Override
	public String afficher() {
		//appel de la m�thode afficher de la superclasse Employe pour afficher les attributs d�clar�s dans Employe
		return "Secretaire [tauxHoraire=" + tauxHoraire + ", nbHeure=" + nbHeure +  super.afficher() + "]";
	}
	


	public double getTauxHoraire() {
		return tauxHoraire;
	}
	public void setTauxHoraire(double tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}
	public int getNbHeure() {
		return nbHeure;
	}
	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}
    
}
