package Laboratoire4;

	public class Secretaire extends Employe {
		private double tauxHoraire;
		private int nbHeure;

		public Secretaire() {
		 super();
		}
		public Secretaire(double tauxHoraire, int nbHeure, String nom, String adresse) {
			this(tauxHoraire, nom, adresse);
			this.nbHeure = nbHeure;

		}

		public Secretaire(double tauxHoraire, String nom, String adresse) {
			super(nom, adresse);
			setTauxHoraire(tauxHoraire);
		}

		public double getTauxHoraire() {
			return tauxHoraire;
		}

		public void setTauxHoraire(double tauxHoraire) {
			this.tauxHoraire = tauxHoraire;
		}

		public int getNbHeure() {
			return nbHeure;
		}

		public void setNbHeure(int nbHeure) {
			this.nbHeure = nbHeure;
		}

		@Override
		public void afficher() {
			System.out.print("Secretaire : ");
			super.afficher();
			System.out.print(" [tauxHoraire=" + tauxHoraire + ", nbHeure=" + nbHeure + "]");
		}@Override
		public void lire() {
		super.lire();
		setTauxHoraire(lireTauxHoraire());
		setNbHeure(lireNbHeure());
		}private double lireTauxHoraire() {
			return Lecture.lireDouble("Donnez votre taux horaire:");
		}private int lireNbHeure() {
			return Lecture.lireInt("Donnez votre nombre heure travaillées:");
		}

		@Override
		public void calculerSalaire() {
			super.setSalaire(tauxHoraire * nbHeure);
			// l’attribut salaire est privé, il faut utiliser le setter pour le modifier
		}
	

}
