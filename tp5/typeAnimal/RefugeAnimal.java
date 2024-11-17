package typeAnimal;

public class RefugeAnimal {
	public static final int NB_MAX_ANIMAUX = 100;
	public int nbAnimal = 0;
	Animal[] tabAnimaux;

	public int getNB_MAX_ANIMAUX() {
		return NB_MAX_ANIMAUX;
	}

	public RefugeAnimal() {
		tabAnimaux = new Animal[NB_MAX_ANIMAUX];
	}

	public boolean estPlein() {
		return nbAnimal == NB_MAX_ANIMAUX;
	}

	public boolean estVide() {
		return nbAnimal == 0;
	}

	public void afficher() {
		System.out.println("\nTous les Animaux:");
		for (int i = 0; i < nbAnimal; i++) {
		System.out.println(tabAnimaux[i].toString());
		}
	}

	public boolean existeDeja(Animal animal) {
		boolean reponse = false;
		for (int i = 0; i < nbAnimal; i++) {
			if (tabAnimaux[i].equals(animal)) {
					reponse = true;
			}
		}
		return reponse;
	}

	public void ajouter(Animal animal) {
		if (!estPlein() && !existeDeja(animal)) {
			tabAnimaux[nbAnimal] = animal;
			nbAnimal++;
		} else {
			System.out.println("l'animal " + animal.getId() + " ne peut être ajouté");
		}
	}

	public void supprimer(Animal animal) {
		if (!estVide()) {
			for (int i = 0; i < nbAnimal; i++) {
				if (tabAnimaux[i].equals(animal)) {
					for (int j = i + 1; j < nbAnimal; j++) {
						tabAnimaux[j - 1] = tabAnimaux[j];
					}
					nbAnimal--;
				}
			}
		} else {
			System.out.println("Il n'y a aucun animal");
	}
	}

	
	public int chercherTerrestre(ITerrestre[] tabTerrestre) {
		int nbAnimauxTerrestre = 0;
		for (int i = 0; i < tabAnimaux.length; i++) {
			if (tabAnimaux[i] instanceof ReptileTerrestre && !(tabAnimaux[i] instanceof ReptileTerrestreAquatique)) {
				tabTerrestre[nbAnimauxTerrestre]=(ITerrestre)tabAnimaux[i] ;
				nbAnimauxTerrestre++;
			}
		}
		return nbAnimauxTerrestre;
	}

	public static void trier(Crocodile[] tab, int nb) {
		int posmin = 0;
		Crocodile posTemp;
		for (int i = 0; i < nb; i++) {
			posmin = i;
			for (int j = i + 1; j < nb; j++) {
				if (tab[j].compareTo(tab[posmin]) == -1) {
					posmin = j;
				}
			}
			if (posmin != i) {
				posTemp = tab[i];
				tab[i] = tab[posmin];
				tab[posmin] = posTemp;
			}
		}
	}

	public int chercheEtTriCrocodile(Crocodile[] tabCroco) {
		int nbCroco = 0;
		for (int i = 0; i < tabAnimaux.length; i++) {
			if (tabAnimaux[i] instanceof Crocodile) {
				tabCroco[nbCroco]=(Crocodile)tabAnimaux[i];
				nbCroco++;
			}
		}
		trier(tabCroco, nbCroco);
		return nbCroco;
	}

	public static void main(String[] arg) {
		RefugeAnimal refuge = new RefugeAnimal();
		ITerrestre[] tabTerrestre = new ITerrestre[refuge.getNB_MAX_ANIMAUX()];
		Crocodile[] tabCrocod = new Crocodile[refuge.getNB_MAX_ANIMAUX()];
		int nbTerrestre = 0;
		int nbCroco = 0;
		System.out.println("*******les animaux du refuge animal:*****");
		SerpentMarin sm1 = new SerpentMarin("sm1", "Sipi", 0, 1, 'f', true);
		SerpentMarin sm2 = new SerpentMarin("sm2", "Tipi", 0, 1.5, 'm', true);
		LezardQueueDeFouet lqf1 = new LezardQueueDeFouet("lqf3", "leza", 4, 2, 'f', false);
		LezardQueueDeFouet lqf2 = new LezardQueueDeFouet("lqf4", "lezo", 4, 2.5, 'm', false);
		Crocodile croc1 = new Crocodile("cr5", "croca", 4, 500, 'f', false);
		Crocodile croc2 = new Crocodile("cr6", "croco", 4, 350, 'm', false);
		Crocodile croc3 = new Crocodile("cr7", "crocu", 4, 550, 'm', false);
		Crocodile croc4 = new Crocodile("cr7", "crocuuu", 4, 560, 'm', false);

		refuge.ajouter(sm1);
		refuge.ajouter(sm2);
		refuge.ajouter(lqf1);
		refuge.ajouter(lqf2);
		refuge.ajouter(croc1);
		refuge.ajouter(croc2);
		refuge.ajouter(croc3);
		refuge.ajouter(croc4);

		refuge.afficher();
		nbTerrestre = refuge.chercherTerrestre(tabTerrestre);
		System.out.println("*****les animaux qui peuvent vivre sur terre: ****");
		for (int i = 0; i < nbTerrestre; i++) {
			System.out.println(((Animal) tabTerrestre[i]).toString());
		}

		System.out.println("****Les crocodiles triés par ordre croissant de leurs poids******");
		nbCroco = refuge.chercheEtTriCrocodile(tabCrocod);
		;
		for (int i = 0; i < nbCroco; i++) {
			System.out.println(tabCrocod[i].toString());
		}

	}

}
