package PosteCanada;

public class Circulaire extends Courrier{

	Circulaire(int poids, int optionEnvoie, String adrDestinataire) {
		super(poids, optionEnvoie, adrDestinataire);
		// TODO Auto-generated constructor stub
	}
	public double setPoids(double poids) {
		double reponse=0;
		if(poids<200) {
			reponse=poids;
		}else if(reponse==0){
			System.out.print("");
		}else {
			System.out.print("poids invalide");
		}
		return reponse;

	}
	@Override
	//on calcul le tarif selon son poids et si c'est un envoie rapide on double le tarif
	public double calculerTarif() {
		if(super.getOptionEnvoie()==ENVOIE_REGULIER) {
		if( super.getPoids()<=50 ) {
			super.setTarif(0.25);
			}
		if(super.getPoids()>50 && super.getPoids()<=200 ) {
			super.setTarif(0.50);
			}
		}	if(super.getOptionEnvoie()==ENVOIE_Rapide) {
			if( super.getPoids()<=50 ) {
				super.setTarif(0.50);
				}
			if(super.getPoids()>50 && super.getPoids()<=200 ) {
				super.setTarif(1);
				}
		}
		return super.getTarif();
		
	}
	@Override
	public void afficher(){
		//On utiliser la méthode afficher de la classe Courrier
		super.afficher();
	}

}
