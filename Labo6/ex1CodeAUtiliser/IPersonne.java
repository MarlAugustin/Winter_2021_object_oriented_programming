package ex1CodeAUtiliser;

public interface IPersonne extends Affichable {

//on peut aussi l'�crire de cette fa�on : public abstract String afficher(); 

public void calculerSalaire();

public void augmenterSalaire(double taux);

}
