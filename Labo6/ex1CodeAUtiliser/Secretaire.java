package ex1CodeAUtiliser;

public class Secretaire extends Employe{
	private double tauxHoraire;
	private int nbHeure;

	public Secretaire(double tauxHoraire, String nom, String adresse) {
		 //appel du constructeur à 2 paramètres de classe Employé,
		//il faut que l'appel du constructeur soit tjrs dans la première ligne
		//Si vous n'appelez pas le constructeur de la superclasse, le compilateur
		//java le fera implicitement et il appelera le constructeur par défaut - sans paramètres-
		super(nom, adresse);
		setTauxHoraire(tauxHoraire); // rajouter l'initialisation des attributs declarés dans la sous classe Secreataire : tauxHoraire
	}

	public Secretaire(double tauxHoraire, int nbHeure, String nom, String adresse) {
		this(tauxHoraire, nom, adresse);
		setNbHeure (nbHeure);
	}
	
	public Secretaire() {
		//appel du constructeur par défaut de la superclasse Employé, on a pu omettre cette instruction et java le fera pour nous
		super();
	}
	//redéfinition de la méthode calculerSalaire définie dans la classe Employé
	@Override
	public void calculerSalaire() {
		//appel de la méthode setSalaire définie dans la superclasse Employe
		super.setSalaire(tauxHoraire*nbHeure);  
	}

	//redéfinition de la méthode afficher définie dans la classe Employé
	@Override
	public String afficher() {
		//appel de la méthode afficher de la superclasse Employe pour afficher les attributs déclarés dans Employe
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
