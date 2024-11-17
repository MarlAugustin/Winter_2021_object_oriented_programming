package Examen;

public class Entreprise {

    private static final int MIN_NBRE_EMPLOYE = 1;

    private static final int MAX_NBRE_PETITE_ENTREPRISE = 99;

    private  static final int MIN_CARACTERES_ENTREPRISE = 2;

    private String nomEntreprise ;

    private int nbreEmploye;

    //Ajoutez votre réponse ici-bas

    //question a
    public void setNomEntreprise(String nomEntreprise) {
    	if(nomEntreprise.length()>2) {
    	this.nomEntreprise=nomEntreprise;
    	}else {
    		System.out.println("Le nom  de l’entreprise doit être de 2 caractères ou plus");
    	}
    }

    //question b
    public void setNbreEmploye(int nbreEmploye) {
    	if(nbreEmploye>=1) {
    		this.nbreEmploye=nbreEmploye;
    	}else {
    		System.out.println("Le nombre d’employés ne peut pas être plus bas que 1");
    	}
    }

    //question c
    public String getNomEntreprise() {
    	return nomEntreprise;
    }

    //question d
    public int getNbreEmploye() {
    	return nbreEmploye;
    }


    //question e
    public Entreprise(String nomEntreprise, int nombreEmploye) {
    	setNbreEmploye(nombreEmploye);
    	setNomEntreprise(nomEntreprise);
    }

    //question f
    public boolean estPetiteEntreprise() {
    	boolean reponse;
    	if(nbreEmploye>=MAX_NBRE_PETITE_ENTREPRISE && nbreEmploye<=MAX_NBRE_PETITE_ENTREPRISE) {
    		reponse=true;
    	}else {
    		reponse=false;
    	}
    	return reponse;
    }



}