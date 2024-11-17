package banque;

import banque.Compte;

public class ListeCompte {
	public int nbCompte = 0;
	private static final int LONG_MAX = 1000;
	Compte tabCompte[] = new Compte[0];

	public ListeCompte() {
		Compte tabCompte[] = new Compte[LONG_MAX];
		for (int i = 0; i < 4; i++) {
			tabCompte[i] = new Compte();
			tabCompte[i].lireCompte();
			nbCompte++;
		}

	}

	public boolean estVide() {
		return (nbCompte == 0);
	}

	public boolean estPlein() {

		return (nbCompte == tabCompte.length);

	}

	public boolean ajouter(Compte compte) {
	boolean ajout=false;
		if (!estPlein()) {
			tabCompte[nbCompte] = compte;
			nbCompte++;
			ajout= true;
		} 
			return ajout;
	}

	public boolean supprimer(int numCompte) {
	boolean suppressionNum=false;
		if (estPlein()) {
			for (int i = 0; i < nbCompte; i++) {
				if (numCompte == tabCompte[i].getNumero()) {
					tabCompte[i] = new Compte("", -1, -1);
				}
			}
			return true;
		} else {
			return false;
		}

	}

	public void afficherCompte() {
		for (int i = 0; i < nbCompte; i++) {
			tabCompte[i].afficherCompte();
		}
	}

	public void retirer(int numero, int montant) {
		for (int i = 0; i < nbCompte; i++) {
			if (numero == tabCompte[i].getNumero()) {
				tabCompte[i].retirer(montant);
			}
		}
	}

	public void tri() {
		int posMin;
		//[] temp=new Compte;
		int tempString;
		
		for (int i = 0; i < nbCompte; ++i) {
			posMin = i;
			for (int j = i + 1; j < nbCompte; ++j) {
				if (tabCompte[j].getMontant() < tabCompte[posMin].getMontant()) {
					posMin = j;
				}
			}
			if (posMin != i) {
				//temp =tabCompte[posmin];
			}

		}
	}

	public void deposerGain(double taux) {
		if (taux >= 0 || taux <= 1) {
		//	tabCompte[].deposer(tabCompte[i].getMontant);
		} else {
			System.out.println("ne se situe pas dans l'interval");
		}
	}

	public void virement(Compte ce, Compte cr, double m) {
		ce.retirer(m);
		cr.deposer(m);
	}

	public Compte getCompte(int numero) {
		int i = 0;
		while (tabCompte[i].getNumero() != numero && i < nbCompte) {
			if (tabCompte[i].getNumero() == numero) {
				tabCompte[i].afficherCompte();
			}
			i++;
		}
		return tabCompte[i];

	}
}
