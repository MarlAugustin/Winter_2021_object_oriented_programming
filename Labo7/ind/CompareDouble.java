package ind;

//https://howtodoinjava.com/java-examples/correctly-compare-float-double/

public class CompareDouble {
	public static void main(String[] arg) {
		double seuil = 0.0001;

		// on veut mettre la valeur 1.1 dans f1
		// Methode 1
		double f1 = .0;
		for (int i = 1; i <= 11; i++) {
			f1 += .1;
		}

		// on veut mettre la valeur 1.1 dans f2
		// Method2 2
		double f2 = .1 * 11;

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);

		// Attention: code � �viter!
		if (f1 == f2)
			System.out.println("f1 et f2 sont egaux selon == \n");
		else
			System.out.println("f1 et f2 ne sont pas egaux selon == \n");

		// code � mettre
		if (Math.abs(f1 - f2) < seuil)
			System.out.println("f1 et f2 sont egaux selon le seuil  \n");
		else
			System.out.println("f1 et f2 ne sont pas egaux selon le seuil \n");

	}
}
