package Lab7;


public class Manager extends Employe {
	private double bonus = 0;

	@Override
	public String toString() {
		return "Manager [bonus=" +bonus +"] "+super.toString();
	}

	@Override
	public boolean equals(Object autre) {
		// vu qu'on a pas plusieurs intructions on ne met pas d'accolade {}
		boolean reponse = false;
		if (this == autre) {
			reponse = true;
		}
		if (!(autre instanceof Manager)) {
			reponse = false;
		}
		if (!(super.equals(autre))) {
			reponse = false;
		}
		if (super.equals(autre) == true) {
			double seuil = 0.0001;
			Manager autreManager = (Manager) autre;
			if (Math.abs(autreManager.bonus - this.bonus) < seuil) {
				reponse = true;
			} else {
				reponse = false;
			}
		}
		return reponse;
	}	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Manager(String unNom, String uneAdresse, double unSalaire, double bonus) {
		//appel du constructeur à 3 paramètres de classe Employé,
				//il faut que l'appel du constructeur soit tjrs dans la première ligne
				//Si vous n'appelez pas le constructeur de la superclasse explicitement, le compilateur
				//java le fera implicitement et il appelera le constructeur par défaut - sans paramètres-
		super(unNom, uneAdresse, unSalaire);
		setBonus(bonus);
	}
	
	public Manager() {
		//appel du constructeur par défaut de la superclasse Employé, on a pu omettre cette instruction et java le fera pour nous
		super();
	}
	//redéfinition de la méthode calculerSalaire définie dans la classe Employé
	@Override
	public void calculerSalaire() {
		//appel de la méthode setSalaire définie dans la superclasse Employe
		super.setSalaire(super.getsalaire()+bonus); 
	}
	
	//redéfinition de la méthode afficher définie dans la classe Employé
	@Override
	public String afficher() {
		//appel de la méthode afficher de la superclasse Employe pour afficher les attributs déclarés dans Employe
		return "Manager [bonus=" + bonus +  super.afficher() + "]";
	}
	
	

	
}
