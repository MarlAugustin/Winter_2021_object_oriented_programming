package Laboratoire4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lecture {
	Scanner clavier = new Scanner(System.in);

	/**
	 * La m�thode afficherQuestion permet d'afficher une question a l'utilisateur
	 * 
	 * @param question
	 *            La question a afficher
	 */
	public static void afficherQuestion(String question) {
		System.out.println(question);
	}

	/**
	 * La m�thode lireString permet d'afficher une question a l'utilisateur et de
	 * lire une chaine de caract�re
	 * 
	 * @param question
	 *            La question a afficher
	 * @return la chaine de caract�re lue
	 */
	public static String lireString(String question) {
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		afficherQuestion(question);
		String entree = "";
		try {
			entree = clavier.readLine();
		} catch (IOException errIO) {
			System.out.println("\nUne erreur d'entr�e sortie");
		} catch (Exception err) {
			System.out.println("\nUne erreur de lecture");
		}

		return entree;
	}

	/**
	 * La m�thode lireString permet d'afficher une question a l'utilisateur et de
	 * lire une chaine de caract�re que sa longueur est dans un intervalle
	 * 
	 * @param question
	 *            La question a afficher
	 * @param min
	 *            La longueur minimum de la chaine de caract�re
	 * @param max
	 *            Le nombre maximum de la chaine de caract�re
	 * @return la chaine de caract�re lu
	 */
	public static String lireString(String question, int min, int max) {
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		String entree = "";
		while (entree.length() <= min || entree.length() >= max) {
			afficherQuestion(question);
			try {
				entree = clavier.readLine();

			} catch (NumberFormatException errFormat) {
				System.out.println("\nUne erreur de Format");
			} catch (IOException errIO) {
				System.out.println("\nUne erreur d'entr�e sortie");
			} catch (Exception err) {
				System.out.println("\nUne erreur de lecture");
			}
		}
		return entree;
	}

	/**
	 * La m�thode lireInt permet d'afficher une question a l'utilisateur et de lire
	 * un entier
	 * 
	 * @param question
	 *            La question a afficher
	 * @return le nombre entier lu
	 */
	public static int lireInt(String question) {
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		afficherQuestion(question);
		int entree = 0;
		try {
			entree = Integer.parseInt(clavier.readLine());
		} catch (NumberFormatException errFormat) {
			System.out.println("\nUne erreur de Format");
		} catch (IOException errIO) {
			System.out.println("\nUne erreur d'entr�e sortie");
		} catch (Exception err) {
			System.out.println("\nUne erreur de lecture");
		}
		return entree;

	}

	/**
	 * La m�thode lireInt permet d'afficher une question a l'utilisateur et de lire
	 * un entier qui fait partie d'un intervalle
	 * 
	 * @param question
	 *            La question a afficher
	 * @param min
	 *            Le nombre minimum
	 * @param max
	 *            Le nombre maximum
	 * @return le nombre entier lu
	 */
	public static int lireInt(String question, int min, int max) {
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		int entree = 0;
		while (entree <= min || entree >= max) {
			afficherQuestion(question);
			try {
				entree = Integer.parseInt(clavier.readLine());

			} catch (NumberFormatException errFormat) {
				System.out.println("\nUne erreur de Format");
			} catch (IOException errIO) {
				System.out.println("\nUne erreur d'entr�e sortie");
			} catch (Exception err) {
				System.out.println("\nUne erreur de lecture");
			}
		}
		return entree;
	}

	/**
	 * La m�thode lireDouble permet d'afficher une question a l'utilisateur et de
	 * lire un nombre de type Double
	 * 
	 * @param question
	 *            La question a afficher
	 * @return le nombre Double lu
	 */
	public static double lireDouble(String question) {

		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		afficherQuestion(question);
		double entree = 0;
		try {
			entree = Double.parseDouble(clavier.readLine());
		} catch (NumberFormatException errFormat) {
			System.out.println("\nUne erreur de Format");
		} catch (IOException errIO) {
			System.out.println("\nUne erreur d'entr�e sortie");
		} catch (Exception err) {
			System.out.println("\nUne erreur de lecture");
		}
		return entree;
	}

	/**
	 * La m�thode lireDouble permet d'afficher une question a l'utilisateur et de
	 * lire un nombre de type Double qui fait partie d'un intervalle
	 * 
	 * @param question
	 *            La question a afficher
	 * @param min
	 *            Le nombre minimum
	 * @param max
	 *            Le nombre maximum
	 * @return le nombre Double lu
	 */
	public static double lireDouble(String question, double min, double max) {
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		double entree = 0;
		while (entree <= min || entree >= max) {
			try {
				afficherQuestion(question);
				entree = Double.parseDouble(clavier.readLine());
			} catch (NumberFormatException errFormat) {
				System.out.println("\nUne erreur de Format");
			} catch (IOException errIO) {
				System.out.println("\nUne erreur d'entr�e sortie");
			} catch (Exception err) {
				System.out.println("\nUne erreur de lecture");
			}
		}
		return entree;
	}

	/**
	 * La m�thode lireChar permet d'afficher une question a l'utilisateur et de lire
	 * un charact�re
	 * 
	 * @param question
	 *            La question a afficher
	 * @return le charact�re lu
	 */
	public static char lireChar(String question) {
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		afficherQuestion(question);
		char entree = ' ';
		try {
			entree = (char) clavier.read();
		} catch (IOException errIO) {
			System.out.println("\nUne erreur d'entr�e sortie");
		} catch (Exception err) {
			System.out.println("\nUne erreur de lecture");
		}
		return entree;

	}
}