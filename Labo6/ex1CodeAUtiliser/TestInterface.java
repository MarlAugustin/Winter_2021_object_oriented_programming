package ex1CodeAUtiliser;

public class TestInterface {
	public static void main(String[]args) {
 Affichable tabaffichable[]=new Affichable[3];
tabaffichable[0]=new Animal("Savane","tigre",4) ;
tabaffichable[1]=new Secretaire(25,40,"Mademoiselle","montréal") ;
tabaffichable[2]= new Manager("Benoit","St-clinclin",10000,23) ;
for(int i=0;i<3;i++) {
System.out.println(tabaffichable[i].afficher()); 
}
}
}
