package Question3;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Flotte[] tab = new Flotte[2]; 
        // question 4.1
		tab[0]= new Voiture("Mazda",4);
		   // question 4.2
		 tab[1] =new Remorque("GoRem",10,1000);

	             for (int i = 0; i < tab.length; i++) {

	                  // question 4.3
	            	 System.out.println("Le tarif de location est  : "+tab[i].calcTarif());
	                   // question 4.4

	                  if (tab[i] instanceof Remorque) {
	                	  Remorque tabTmpRemorque=(Remorque) tab[i];
	                	  System.out.println(tabTmpRemorque.chargeMax());
	                  }

	            }
	}

}
