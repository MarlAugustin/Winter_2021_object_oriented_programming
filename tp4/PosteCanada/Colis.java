package PosteCanada;

public class Colis extends Lettre {
	private double largeur, hauteur;
	private static final double tarifBase = 5.47, tarifUnitaire = 0.25;
	private static final int extra = 50;

	public Colis(int poids, int optionEnvoie, String adrDestinataire, String adrExpediteur, double largeur,
			double hauteur) {
		super(poids, optionEnvoie, adrDestinataire, adrExpediteur);
		setLargeur(largeur);
		setHauteur(hauteur);
	}
	//Ligne 15 à 41 setter et getter
	public double setPoids(double poids) {
		double reponse = 0;
		if (poids > 500 && poids <= 50000) {
			reponse = poids;
		} else if (reponse == 0) {
			System.out.print("");
		} else {
			System.out.print("poids invalide");
		}
		return reponse;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	@Override
	public void afficher() {
		 String txtEnvoie=""  ;
			if(getOptionEnvoie()==0) {
				txtEnvoie="Envoie regulier";
			}else if(getOptionEnvoie()==1) {
				txtEnvoie="Envoie rapide";
			}
		System.out.println("Poids :" + getPoids() + " Option d'envoie : " + txtEnvoie + " tarif : " + getTarif()
				+ " Adresse destinataire : " + getAdrDestinataire()+" Adresse expediteur :"+getAdrDestinataire() + " Largeur: " + largeur + " Hauteur : " + hauteur);
	}

	@Override
	public double calculerTarif() {
		double dimensiontot = dimensionCumule(largeur , hauteur);
		if (super.getOptionEnvoie() == ENVOIE_REGULIER) {
			if (dimensiontot < 200) {
				super.setTarif(tarifBase + tarifUnitaire * super.getPoids());
			} else {
				super.setTarif(tarifBase + tarifUnitaire * super.getPoids() + 50);
			}
		}
		if (super.getOptionEnvoie() == ENVOIE_Rapide) {
			if (dimensiontot < 200) {
				super.setTarif(tarifBase + tarifUnitaire * super.getPoids() * 2);
			} else {
				super.setTarif((tarifBase + tarifUnitaire * super.getPoids() + 50) * 2);
			}
		}
		return super.getTarif();
	}

	public double dimensionCumule(double nb1,double nb2) {
		return (nb1 + nb2);
	}
}
