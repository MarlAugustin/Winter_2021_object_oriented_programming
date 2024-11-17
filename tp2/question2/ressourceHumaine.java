package question2;


public class ressourceHumaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciation des employés
		Employe Employe1= new Employe("1234", "Elie", "Toubel", 25, "Vente", 0, 150,4000);
		Employe Employe2= new Employe("4567", "Rémy", "Belvue",55, "Production", 0, 160,0);
		Employe Employe3= new Employe("3245", "Inés", "Moussa",60, "Production", 0, 100,0);
		Employe Employe4= new Employe("3246", "Yassine", "Saber",45, "Finance", 0, 120,0);
		
		//affichage des informations
		Employe1.affichage();
		Employe2.affichage();
		Employe3.affichage();
		Employe4.affichage();
		System.out.println(" ");
		//appel de la méthode modifierSalaire et l'affichage
		Employe1.modifierSalaire();
		Employe2.modifierSalaire();
		Employe3.modifierSalaire();
		Employe4.modifierSalaire();
		System.out.println(Employe1.getNom()+" "+Employe1.getPrenom()+" "+Employe1.getSalaire());
		System.out.println(Employe2.getNom()+" "+Employe2.getPrenom()+" "+Employe2.getSalaire());
		System.out.println(Employe3.getNom()+" "+Employe3.getPrenom()+" "+Employe3.getSalaire());
		System.out.println(Employe4.getNom()+" "+Employe4.getPrenom()+" "+Employe4.getSalaire());
		System.out.println(" ");
		
		//appel de la méthode retraite
		System.out.println(Employe1.estRetraite());
		System.out.println(Employe2.estRetraite());
		System.out.println(Employe3.estRetraite());
		System.out.println(Employe4.estRetraite());
	}

}
