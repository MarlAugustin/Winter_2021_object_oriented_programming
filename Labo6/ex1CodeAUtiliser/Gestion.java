package ex1CodeAUtiliser;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretaire secretaire1 = new Secretaire(14.23,"Lise", "3455 Ave Queen"); 
		System.out.println(secretaire1.afficher());
		
		Secretaire secretaire2 = new Secretaire(14.23, 10,"Aline", "3455 Ave Queen"); 
		System.out.println(secretaire2.afficher());
		secretaire2.calculerSalaire();
		System.out.println(secretaire2.afficher());
	
		Manager manager1 = new Manager("Eric", "1200 rue palard", 3800, 500);
		System.out.println(manager1.afficher());
		manager1.calculerSalaire();
		System.out.println(manager1.afficher());

	}

}
