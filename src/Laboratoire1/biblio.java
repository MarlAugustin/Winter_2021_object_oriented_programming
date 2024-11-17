package Laboratoire1;

public class biblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livre l1= new Livre(" Annick Fron",":  Architectures réparties en Java", "eni", 560);
		Livre l2= new Livre(" Claude DELANNOY",":  Programmer en Java", "eni", 300);
		Livre l3= new Livre(" Nicolas de Loof",": Apache Maven", "eni", 245);
		
		System.out.println(l3.nbLivre);
		
		System.out.println("Titre"+l2.getTitre() +", auteur:"+l2.getAuteur()+ ", edition :"+l2.getEditeur()+ ", nombre de page :"+ l2.getNbPage());
		System.out.println("Titre"+l3.getTitre() +", auteur:"+l3.getAuteur()+ ", edition :"+l3.getEditeur()+ ", nombre de page :"+ l3.getNbPage());
/**
		Livre l4= new Livre(" Annick Fron",":  Architectures réparties en Java", "eni", 500,Livre.SCIENTIFIQUE,20);
		Livre l5= new Livre(" Claude DELANNOY",":  Programmer en Java", "eni", 300,Livre.LITTERATURE,15);
		Livre l6= new Livre(" Nicolas de Loof",": Apache Maven", "eni", 245,Livre.SCIENTIFIQUE,25);
	
		System.out.println("prix du livre "+l4.getTitre() + " est :"+l4.calculerPrix());
		System.out.println("prix du livre "+l5.getTitre() + " est :" +l5.calculerPrix());
		System.out.println("prix du livre "+l6.getTitre() + " est :" +l6.calculerPrix());
	
		taxe.setTaxeTVQ(0.1);
		System.out.println("prix du livre "+l4.getTitre() + " est :"+l4.calculerPrix());
		System.out.println("prix du livre "+l5.getTitre() + " est :" +l5.calculerPrix());
		System.out.println("prix du livre "+l6.getTitre() + " est :" +l6.calculerPrix());
	*/
	}

}
