package GestionEtudiant;

public class Gestion {
	public static void main(String[] args) {
		Enseignant enseignant1= new Enseignant("Emir Alami", "234567");
		Etudiant etudiant1= new Etudiant("Anas"," Bouclair", 'M', "6646 rue Queen", "670557", 56,enseignant1);
		Etudiant etudiant2= new Etudiant("Alma ","Tremblan",'F', "", "118910", 0,enseignant1);
		Etudiant etudiant3= new Etudiant(" Ilyane"," Beauchamp",'F', "78 rue du reines", " 670558", 80,enseignant1);
		etudiant1. reussir() ;
		etudiant2.reussir();
		etudiant3.reussir();

		}

}
