
package GestionEtudiant;

public class Enseignant {
		private String nom;
		private String matricule;
		
		public Enseignant(String nom, String matricule) {
			this.nom=nom;
			this.matricule=matricule;
		}
		// Modificateur de nom
				public void setNom(String nom) {
					this.nom = nom;
				}

				// Accesseur du nom
				public String getNom() {
					return nom;
				}
		
		// Modificateur de matricule
				public void setMatricule(String matricule) {
					if (matricule.length() == 6) {
						this.matricule = matricule;
					} else {
						System.out.println("le code n'est pas valide");
					}
				}
				// accesseur matricule
				public String getMatricule() {
					return matricule;

	}

}
