package ex1CodeAUtiliser;

public class Secretaire extends Employe{
	private double tauxHoraire;
	private int nbHeure;

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
