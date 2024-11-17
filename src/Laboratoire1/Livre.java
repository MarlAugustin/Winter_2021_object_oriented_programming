package Laboratoire1;

	public class Livre {
		private String titre;
		private String auteur;
		private String editeur;
		private int nbPage;
		public static int nbLivre=0;
		private int categorie;
		private double prixBase;
		private double prix;
		private static final int LITTERATURE=0;
		private static final int SCIENTIFIQUE=1;
	

		
		// Modificateur de nbPage	
		public Livre(String auteur,String titre) {
			this.auteur = auteur;
			this.titre = titre;
			nbLivre++;
		}

		public Livre(String auteur,String titre, String editeur, int nbPage) {
			this(auteur,titre);			
			this.editeur = editeur;
			this.nbPage = nbPage;
		}
		public Livre(String auteur,String titre, String editeur, int nbPage, int categorie, double prixBase) {
			this(auteur,titre);			
			this.editeur = editeur;
			this.nbPage = nbPage;
			this.categorie=categorie;
			this.prixBase=prixBase;
		}
		
		public void setNbPage(int nbPage) {
			
			if (nbPage<=0) {
				System.out.print("On ne peut pas avoir un nombre de page négatif");
			}else {
				this.nbPage = nbPage;
		}
		}
		public double calculerPrix() {

			if(categorie==LITTERATURE) {
				prix=prixBase+taxe.calculerTaxe(prixBase) +5;
			}else if(categorie==SCIENTIFIQUE) {
				prix=prixBase+taxe.calculerTaxe(prixBase)+7;
			}
			return prix;
		}
		//Accesseur de NbPage
		public int getNbPage() {
			return nbPage;
		}

		// Modificateur de titre	 
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public String getTitre() {
			return titre;
		}
		// Modificateur de titre	 
				public void setAuteur(String auteur) {
					this.auteur = auteur;
				}
				public String getAuteur() {
					return auteur;
				}
				public void setEditeur(String editeur) {
					this.editeur = editeur;
				}
				public String getEditeur() {
					return editeur;
				}
				
		//Accesseur du titre
				public String titre() {
					return titre;
				}
		
		public static void main(String args[]) {
			/**
			Livre l1= new Livre("Architectures réparties en Java",":  Annick Fron");
			//l1.setNbPage(200);
			Livre l2= new Livre("Programmer en Java","Claude DELANNOY");
			Livre l3= new Livre("Apache Maven","Nicolas de Loof");
			System.out.println("Titre"+l1.getTitre() +", auteur:"+l1.getAuteur()); //+", Nb page: "+ l1.getNbPage()
			System.out.println("Titre"+l2.getTitre() +", auteur:"+l2.getAuteur());
			System.out.println("Titre"+l3.getTitre() +", auteur:"+l3.getAuteur());
			*/
			}
	}
	
