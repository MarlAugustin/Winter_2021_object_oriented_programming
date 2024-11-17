package Lab7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Test de la méthode toString dans la classe Secretaire

        Secretaire secretaire1 = new Secretaire(14.23,10,"Lise", "3455 Ave Queen"); 
		secretaire1.calculerSalaire();
		System.out.println(secretaire1.toString());
		
		Secretaire secretaire2 = new Secretaire(14.23, 10,"Aline", "3455 Ave Queen"); 
		secretaire2.calculerSalaire();
		System.out.println(secretaire2.toString());	
		
		
		Secretaire secretaire3 = new Secretaire(14.23,10,"Lise", "3455 Ave Queen"); 
		secretaire3.calculerSalaire();
		System.out.println(secretaire3.toString());
	    // Test de la méthode toString dans la classe Manager
		Manager manager1 = new Manager("Eric", "1200 rue palard", 3800, 500);
		manager1.calculerSalaire();
		System.out.println(manager1.toString());
		
		Manager manager2 = new Manager("Lina", "1200 rue palard", 3800, 500);
		manager2.calculerSalaire();
		System.out.println(manager1.toString());

		// Test de la méthode equals dans la classe Secretaire
	      testEquals(secretaire1,secretaire3);
	      testEquals(secretaire1,secretaire2);
             //test de la méthode equals dans la classe Manager
	      testEquals(manager1, manager2);
	      testEquals(manager1, secretaire1);
			if (manager1.compareTo(manager2) == 0) {
				System.out.println("Les deux managers ont le même salaire");
			}
			if (secretaire1.compareTo(secretaire2) == -1) {
				System.out.println("La secretaire " + secretaire1.getNom() + " est payé moins que la secretaire "
						+ secretaire2.getNom());
			}

	}
	public static void testEquals(Employe emp1, Employe emp2) {
        //tester si la classe de emp1 est la même que emp2
        //utilisez la méthode getClass()
		if (emp1.getClass()==(emp2).getClass()) {
               //verifies si emp1 est égale à emp2 
			if (emp1.equals(emp2)) {
				System.out.println("Les deux "+ emp1.getClass()+ " sont les mêmes");
			} else {
				System.out.println("Les deux "+ emp1.getClass()+ " ne sont pas les mêmes");
			}
		
		} else {
			System.out.println("Les deux objets ont une classe différente : " + emp1.getClass() + ", " + emp2.getClass());
		}
	}


}
