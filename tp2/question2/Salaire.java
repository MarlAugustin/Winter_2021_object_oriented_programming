package question2;

import question2.Employe;

public class Salaire {
	private static int salaireProduction = 23;
	private static int salaireFinance = 28;
	private static int prime = 300;

	public static double calculer(int nbHeure, double chAffaire, String departement) {
		double salaire = 0;
		
		if (departement==("Vente")) {
			 salaire=(chAffaire * 0.20)+ 500 ;
		}else if (departement==("Production")) {
			salaire = nbHeure * salaireProduction;
			
		}else if (departement==("Finance")) {
			salaire=nbHeure*salaireFinance+300;
		}
		
		return salaire;
	}
}