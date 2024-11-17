package Examen;

public class Commande {
	 // Attributs

    private String client;

    private int nbPots500ml;

    private int nbPots750ml;

    private int nbPots1l;

   

    // Constructeur

    public Commande(String unClient, int nb500ml, int nb750ml, int nb1l) {

            client = unClient;

            nbPots500ml = nb500ml;

            nbPots750ml = nb750ml;

            nbPots1l = nb1l;

    }      

    // Méthodes

    public void afficher() {

            System.out.println("Client: "+ client+ "\nNb de pots de 500ml: "+ nbPots500ml+ "\nNb de pots de 750ml: "+ nbPots750ml+ "\nNb de pots de 1 litre: "+ nbPots1l);

    }


}
