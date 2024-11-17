package PosteCanada;

public class Lettre extends Courrier{
private String adrExpediteur;

public Lettre(int poids, int optionEnvoie,String adrDestinataire , String adrExpediteur) {
	super(poids,optionEnvoie,adrDestinataire );
	setAdrExpediteur(adrExpediteur);
}
public double setPoids(double poids) {
	double reponse=0;
	if(poids<500) {
		reponse=poids;
	}else if(reponse==0){
		System.out.print("");
	}else {
		System.out.print("poids invalide");
	}
	return reponse;
	
}
public void setAdrExpediteur(String adrExpediteur) {
	this.adrExpediteur=adrExpediteur;
}public String getAdrExpediteur(){
	return adrExpediteur;
	
}@Override
public void afficher() {
	 String txtEnvoie=""  ;
		if(getOptionEnvoie()==0) {
			txtEnvoie="Envoie regulier";
		}else if(getOptionEnvoie()==1) {
			txtEnvoie="Envoie rapide";
		}
	System.out.println("Poids :"+getPoids()+" Option d'envoie : "+txtEnvoie+" tarif : "+getTarif()+" Adresse destinataire : "+getAdrDestinataire()
+" Adresse expediteur :"+adrExpediteur);
	
}@Override
public double calculerTarif() {
	if(super.getOptionEnvoie()==ENVOIE_REGULIER) {
	if(super.getPoids()<=30) {
		super.setTarif(1.07);
		}
		if(super.getPoids()>30 && super.getPoids()<=50 ) {
			super.setTarif(1.30);
			}
		if(super.getPoids()>50 && super.getPoids()<=500 ) {
			super.setTarif(1.30);
			}
}	if(super.getOptionEnvoie()==ENVOIE_Rapide) {
	if(super.getPoids()<=30) {
		super.setTarif(1.07*2);
		}
		if(super.getPoids()>30 && super.getPoids()<=50 ) {
			super.setTarif(1.30*2);
			}
		if(super.getPoids()>50 && super.getPoids()<=500 ) {
			super.setTarif(1.30*2);
			}
}
		return super.getTarif();
}
}
