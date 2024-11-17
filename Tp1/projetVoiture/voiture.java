package projetVoiture;

public class voiture {
	private String id;
	private String modele;
	private String marque;
	private String vitesse;
	private String couleur;
	private double puissance;
	

	public voiture(String id, String marque, String couleur, double puissance) {
		this.id = id;
		this.marque = marque;
		this.couleur = couleur;
		this.puissance = puissance;
	}

	public voiture(String id, String marque, String couleur, double puissance,String modele, String vitesse) {
		this.id = id;
		this.marque = marque;
		this.couleur = couleur;
		this.modele =modele;
		this.puissance = puissance;
		this.vitesse =vitesse;
	}

	public boolean modeleValide(String modele) {
		boolean reponse;
		if (modele.length() <= 10) {
			//this.modele =modele;
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public double calculerTaxeVoiture(double puissance) {
		int taxe;
		if (puissance < 500) {
			taxe = 100;
		} else if (puissance < 1000) {
			taxe = 200;
		} else {
			taxe = 300;
		}
		return taxe;
	}
	public void afficher() {
		System.out.println("Id :" +id + " Marque :" + marque + " Couleur :" +couleur + " Puissance :"+puissance + " modele :" + modele + " Vitesse : " + vitesse +" Taxe :" + calculerTaxeVoiture(puissance));
	}


	public String obtenirModele(String mod) {
		String reponse;
		if (modeleValide(mod)) {
			reponse = mod;
		} else {
			reponse = "modCar1";
		}
		return reponse;
	}

	// Modificateur de leur ID
	public void setId(String id) {
		this.id = id;
	}

	// Accesseur de leur Id
	public String getId() {
		return id;
	}

	// Modificateur de modele
	public void setModele(String modele) {
		this.modele = modele;
	}

	// Accesseur du modele
	public String getModele() {
		return modele;
	}

	// Modificateur de marque
	public void setMarque(String marque) {
		this.marque = marque;
	}

	// Accesseur de marque
	public String getMarque() {
		return marque;
	}

	// Modificateur de vitesse
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}

	// Accesseur de vitesse
	public String getVitesse() {
		return vitesse;
	}

	// Modificateur de couleur
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	// Accesseur de couleur
	public String getCouleur() {
		return couleur;
	}

	// Modificateur de couleur
	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}

	// Accesseur de couleur
	public double getPuissance() {
		return puissance;
	}
}
