package Laboratoire1;

public class taxe {
	private static  double	TAUX_TPS = 0.05;
	private static  double	TAUX_TVQ = 0.09;
	
	public static double calculerTaxeTPS (double montant) {
		return (montant*TAUX_TPS );
	}
	public static double calculerTaxeTVQ  (double montant) {
		return (montant*TAUX_TVQ );
	}
	public static double calculerTaxe   (double montant) {
		return (calculerTaxeTPS(montant)+(calculerTaxeTVQ(montant )));
	}
	public static void setTaxeTPS (double tauxTps) {
		TAUX_TPS=tauxTps;
	}
	public static double getTaxeTPS() {
		return TAUX_TPS;
	}
	public static void setTaxeTVQ (double tauxTvq) {
		TAUX_TVQ=tauxTvq;
	}
	public static double getTaxeTVQ() {
		return TAUX_TVQ;
	}
}
