package PosteCanada;

public class ListeCourrier {
	private int nbCourrier = 0, MAX_COURRIER = 0;
	private Courrier[] tabCourrier;

	public ListeCourrier(int MAX_Courrier) {
		// Initialisation du tableau
	    tabCourrier = new Courrier[MAX_Courrier];
		MAX_COURRIER=MAX_Courrier;

	}
	public void ajouterCourrier(Courrier courrier) {
		//Si le tableau n'est pas plein ajouter le courrier dans la position du
		//Nombre de courrier ensuite on incrémente le nombre de courrier
		if (!estPlein()) {
			tabCourrier[nbCourrier] = courrier;
			nbCourrier++;
		}
	}

	public void calculerTarifCourriers() {
		//on appel la méthode calculerTarif
		for (int i = 0; i < MAX_COURRIER; i++) {
			tabCourrier[i].calculerTarif();
		}
	}

	public void afficherCourriers() {
		//on appel la méthode afficher dans le but d'afficher tous les courriers
		System.out.println("\nTous les courrier:");
		for (int i = 0; i < MAX_COURRIER; i++) {
			tabCourrier[i].afficher();
		}
	}

	public void afficherLettre() {
		//On affiche toute les lettres en utilisant instanceof et afficher
		System.out.println("\nTous les lettres:");
		for (int i = 0; i < MAX_COURRIER; i++) {
			if (tabCourrier[i] instanceof Lettre && ! (tabCourrier[i] instanceof Colis)) {
				tabCourrier[i].afficher();
			}
		}
	}

	public void afficherColis() {
		//On affiche tous les colis en utilisant instanceof et afficher
		System.out.println("\nTous les colis:");
		for (int i = 0; i < MAX_COURRIER; i++) {
			if (tabCourrier[i] instanceof Colis) {
				tabCourrier[i].afficher();
			}
		}
	}

	public void afficherCirculaire() {
		//On affiche tous les circulaires en utilisant instanceof et afficher
		System.out.println("\nTous les circulaires:");
		for (int i = 0; i < MAX_COURRIER; i++) {
			if (tabCourrier[i] instanceof Circulaire) {
				tabCourrier[i].afficher();
			}
		}
	}

	public boolean estVide() {
		//Si le nombre de courrier est 0 il est vide sinon il y a aux moins une donnée
		return nbCourrier == 0;
	}

	public boolean estPlein() {
		//Si le nombre de courrier est égal à MAX_COURRIER  il est plein sinon il y a aux moins une donnée de libre
		return nbCourrier == MAX_COURRIER;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeCourrier tabCourrier= new ListeCourrier(7);
		Lettre Lettre1=new Lettre(25,0, "60 rue de l'espagne H7L4J4", "12 rue miron H7L4KL");
		tabCourrier.ajouterCourrier(Lettre1);
		Lettre Lettre2=new Lettre(45,1,  "41 rue Isman H2L3K4", "38 rue méri  T4S3TY");
		tabCourrier.ajouterCourrier(Lettre2);
		Lettre Lettre3=new Lettre(76 , 0 ,"12 rue Dagenais K2S7L5" ,  "9 rue Delhi  H7L4KL");
		tabCourrier.ajouterCourrier(Lettre3);
		
		Colis Colis1=new Colis(150,1,  "24 rue drapeau K7L5J2",  "45 rue renaissance T7L3ZY" ,50.0, 100.0);
		tabCourrier.ajouterCourrier(Colis1);
		Colis Colis2=new Colis(300,0 , "8 rue didier H7L3T1" , "13 rue rosaire L8K4TY", 90.0, 150.0);
		tabCourrier.ajouterCourrier(Colis2);

		
		Circulaire Circulaire1=new Circulaire(40,0,"11 Rue sainte catherine H8N 3T4");
		tabCourrier.ajouterCourrier(Circulaire1);
		Circulaire Circulaire2=new Circulaire(60,1,"60 Rue saint hubert B3T 6J4");
		tabCourrier.ajouterCourrier(Circulaire2);
		
		tabCourrier.afficherCourriers();
		tabCourrier.calculerTarifCourriers();
		tabCourrier.afficherLettre();
		tabCourrier.afficherColis();
		tabCourrier.afficherCirculaire();
	}

}
