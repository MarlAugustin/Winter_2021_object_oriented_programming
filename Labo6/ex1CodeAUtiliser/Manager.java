package ex1CodeAUtiliser;

public class Manager extends Employe {
	private double bonus = 0;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Manager(String unNom, String uneAdresse, double unSalaire, double bonus) {
		//appel du constructeur � 3 param�tres de classe Employ�,
				//il faut que l'appel du constructeur soit tjrs dans la premi�re ligne
				//Si vous n'appelez pas le constructeur de la superclasse explicitement, le compilateur
				//java le fera implicitement et il appelera le constructeur par d�faut - sans param�tres-
		super(unNom, uneAdresse, unSalaire);
		setBonus(bonus);
	}
	
	public Manager() {
		//appel du constructeur par d�faut de la superclasse Employ�, on a pu omettre cette instruction et java le fera pour nous
		super();
	}
	//red�finition de la m�thode calculerSalaire d�finie dans la classe Employ�
	@Override
	public void calculerSalaire() {
		//appel de la m�thode setSalaire d�finie dans la superclasse Employe
		super.setSalaire(super.getsalaire()+bonus); 
	}
	
	//red�finition de la m�thode afficher d�finie dans la classe Employ�
	@Override
	public String afficher() {
		//appel de la m�thode afficher de la superclasse Employe pour afficher les attributs d�clar�s dans Employe
		return "Manager [bonus=" + bonus +  super.afficher() + "]";
	}
	
	

	
}
