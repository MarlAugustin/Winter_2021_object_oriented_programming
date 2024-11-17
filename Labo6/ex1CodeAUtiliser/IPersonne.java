package ex1CodeAUtiliser;

public interface IPersonne extends Affichable {

//on peut aussi l'écrire de cette façon : public abstract String afficher(); 

public void calculerSalaire();

public void augmenterSalaire(double taux);

}
