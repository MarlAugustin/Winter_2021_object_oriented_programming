package typeAnimal;

public abstract class ReptileTerrestre  extends Reptile  implements ITerrestre {
public ReptileTerrestre() {}
public String vitSurTerre() {
	return "je vis sur la terre";
}
@Override
public String toString() {
	return super.toString()+" , millieu de vie: "+vitSurTerre();
	
}
}

