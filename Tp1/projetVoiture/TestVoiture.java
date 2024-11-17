package projetVoiture;
public class TestVoiture {
	public static void main(String[] args) {
		voiture voiture1= new voiture ("3229512", "Ferari", "rouge",1000);
		voiture1.setModele("sport");
		voiture1.obtenirModele(("sport"));
		voiture1.setVitesse("250 kmh");
		voiture1.afficher();
		/*
		voiture1.obtenirModele("sport");
		voiture1.setVitesse("250 kmh");
		voiture1.afficher();
		*/
	}
}
