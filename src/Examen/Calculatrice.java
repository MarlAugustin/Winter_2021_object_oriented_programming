package Examen;

public class Calculatrice {
	  public static int min( int x,  int y,  int z ) {

	         int minimum = z;

	         if ( x <= y && x <= z ) {

	               minimum = x;

	          } else if ( y <= x && y <= z ) {

	                 minimum = y;

	           }

	          return minimum;

	    }

	  

	   /*

	    * Calcule et retourne le maximum de 2 entiers

	   */

	    public static int max(int x, int y ) {

	           int maximum = y;

	           if (x > y) {

	                maximum =  x;

	           }   


	          return maximum;

	    }   


	    

	  /*

	    * Calcule et retourne la puissance d'un entier 

	   */

	    public static int puissance( int valeur, int p ) {

	        int resultat = 1;       

	        for (int i = 0; i < p; i++) {

	            resultat *= valeur;

	        }   

	        return resultat;

	    }

	  }




