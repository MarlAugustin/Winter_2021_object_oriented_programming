package Laboratoire1;

public class École {
	public static void main(String[] args) {
Instructeur instructeur1=new Instructeur("Dupré","Marc","4221 vimont-Laval","321");
instructeur1.affichage();
Etudiant1 etudiant1=new Etudiant1("Lil","boy","A7Z",instructeur1);
etudiant1.affichage();
etudiant1.prendreLeçon(60);
etudiant1.prendreLeçon(60);
etudiant1.passerExamen();


}
}