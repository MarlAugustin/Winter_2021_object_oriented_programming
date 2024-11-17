package typeAnimal;

public abstract class Reptile extends Animal{
private boolean venimeux;
private static final String POND = "POND";
private static final int SANGFROID=1;
private static final int ECAILLE=1;
public Reptile() {}
public Reptile(boolean venimeux) {
	setVenimeux(venimeux);
}
public boolean estVenimeux() {
	return this.venimeux;
}
@Override
public String toString() {
	return super.toString()+", venimeux= "+this.estVenimeux();
}
public String accouchePond() {
	return POND;
}
public boolean isVenimeux() {
	return venimeux;
}
public void setVenimeux(boolean venimeux) {
	this.venimeux = venimeux;
}
public boolean getVenimeux() {
	return venimeux;
}

}
