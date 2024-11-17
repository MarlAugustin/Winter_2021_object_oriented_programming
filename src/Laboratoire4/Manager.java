package Laboratoire4;

	public class Manager extends Employe {
		private double bonus;

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		public Manager() {
			//super();
		}

		public Manager(String unNom, String uneAdresse, double unSalaire, double bonus) {
			super(unNom, uneAdresse, unSalaire);
			setBonus(bonus);

		}

		@Override
		public void calculerSalaire() {
			super.setSalaire(super.getsalaire() + bonus);
		}

		@Override
		public void afficher() {
			System.out.print("Manager: ");
			super.afficher();
			System.out.print("[bonus=" + bonus + "]");
		}
		@Override
		public void lire() {
			super.lire();
			setBonus(lireBonus());
	
		}private double lireBonus() {
			return Lecture.lireDouble("Donnez votre Bonus:");
		}
	
}
