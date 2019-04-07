package memory;

import java.util.Scanner;


public class TestCarte {


	public TestCarte() {
		
	}

	public static void main(String[] args) {
		// Declaration de variables
		
		System.out.println("Choisisez le nombre de paires d�sir�es : " );
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 int nbPairesTotal = sc.nextInt();
			 
		
	
		ListeCartes tirage = new ListeCartes(nbPairesTotal);
		
		// Initialisation de la liste
		
		tirage.randomListe();

		 tirage.repetition_du_jeu();
		 
		 System.out.println("Jeu termin� ! ");

	}
	
	
}
