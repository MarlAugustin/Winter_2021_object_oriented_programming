package PosteCanada;

public class Courrier {
	private int poids, optionEnvoie;
	private double tarif;
	private String adrDestinataire;
	protected final static int ENVOIE_REGULIER=1;
	protected final static int ENVOIE_Rapide=0;
	Courrier(int poids,int optionEnvoie, String adrDestinataire){
		setPoids(poids);
		setOptionEnvoie(optionEnvoie);
		setAdrDestinataire(adrDestinataire);
	} 
	// ligne 15 à 42 setter et getter
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
		
	}
	public int getOptionEnvoie() {
		return optionEnvoie;
	}
	public void setOptionEnvoie(int optionEnvoie) {
		this.optionEnvoie = optionEnvoie;
	}
	public double getTarif() {
		return tarif;
	}
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	public String getAdrDestinataire() {
		return adrDestinataire;
	}
	public void setAdrDestinataire(String adrDestinataire) {
		this.adrDestinataire = adrDestinataire;
	}
	public double calculerTarif() {
		return tarif;	
	}
	public void afficher() {
		//On affiche les différentes variables
		 String txtEnvoie=""  ;
		if(optionEnvoie==0) {
			txtEnvoie="Envoie regulier";
		}else if(optionEnvoie==1) {
			txtEnvoie="Envoie rapide";
		}
		System.out.println("Poids :"+poids+" Option d'envoie : "+txtEnvoie+" tarif : "+getTarif()+" Adresse destinataire : "+adrDestinataire);
	}
}
