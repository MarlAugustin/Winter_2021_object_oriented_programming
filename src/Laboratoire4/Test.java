package Laboratoire4;

public class Test {
 public static void main(String args[]) {
	 Employe emp=new Employe();
	 Secretaire secr =new Secretaire();
	 Manager mang = new Manager();
	 
	 emp.lire();
	 secr.lire();
	 mang.lire();
	 
	 emp.afficher();
	 System.out.println();
	 secr.afficher();
	 System.out.println();
	 mang.afficher();
	 System.out.println();

 }
 
}
