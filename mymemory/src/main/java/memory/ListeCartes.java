package memory;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;


public class ListeCartes extends Thread{

	public ListeCartes() {
	}
	public class ConsoleColors {
		// Reset
		public static final String RESET = "\033[0m"; // Text Reset

		// Regular Colors
		public static final String BLACK = "\033[0;30m"; // BLACK
		public static final String RED = "\033[0;31m"; // RED
		public static final String GREEN = "\033[0;32m"; // GREEN
		public static final String YELLOW = "\033[0;33m"; // YELLOW
		public static final String BLUE = "\033[0;34m"; // BLUE
		public static final String PURPLE = "\033[0;35m"; // PURPLE
		public static final String CYAN = "\033[0;36m"; // CYAN
		public static final String WHITE = "\033[0;37m"; // WHITE

		// Bold
		public static final String BLACK_BOLD = "\033[1;30m"; // BLACK
		public static final String RED_BOLD = "\033[1;31m"; // RED
		public static final String GREEN_BOLD = "\033[1;32m"; // GREEN
		public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
		public static final String BLUE_BOLD = "\033[1;34m"; // BLUE
		public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
		public static final String CYAN_BOLD = "\033[1;36m"; // CYAN
		public static final String WHITE_BOLD = "\033[1;37m"; // WHITE

		// Underline
		public static final String BLACK_UNDERLINED = "\033[4;30m"; // BLACK
		public static final String RED_UNDERLINED = "\033[4;31m"; // RED
		public static final String GREEN_UNDERLINED = "\033[4;32m"; // GREEN
		public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
		public static final String BLUE_UNDERLINED = "\033[4;34m"; // BLUE
		public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
		public static final String CYAN_UNDERLINED = "\033[4;36m"; // CYAN
		public static final String WHITE_UNDERLINED = "\033[4;37m"; // WHITE

		// Background
		public static final String BLACK_BACKGROUND = "\033[40m"; // BLACK
		public static final String RED_BACKGROUND = "\033[41m"; // RED
		public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
		public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
		public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
		public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
		public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
		public static final String WHITE_BACKGROUND = "\033[47m"; // WHITE

		// High Intensity
		public static final String BLACK_BRIGHT = "\033[0;90m"; // BLACK
		public static final String RED_BRIGHT = "\033[0;91m"; // RED
		public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
		public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
		public static final String BLUE_BRIGHT = "\033[0;94m"; // BLUE
		public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
		public static final String CYAN_BRIGHT = "\033[0;96m"; // CYAN
		public static final String WHITE_BRIGHT = "\033[0;97m"; // WHITE

		// Bold High Intensity
		public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
		public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
		public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
		public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
		public static final String BLUE_BOLD_BRIGHT = "\033[1;94m"; // BLUE
		public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
		public static final String CYAN_BOLD_BRIGHT = "\033[1;96m"; // CYAN
		public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

		// High Intensity backgrounds
		public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
		public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
		public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
		public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
		public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
		public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
		public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
		public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE
	}
	
	//Declaration des variables
	private int tailleTotale ;
	private int compteur_paire=0;
    private List<Carte> listeCarte;

	
	

	public int getM() {
		return tailleTotale;
	}

	public void setM(int tailleTotale) {
		this.tailleTotale = tailleTotale;
	}

	
	
	// Constructeur
	public ListeCartes(int i) {
		tailleTotale = 2 * i;
		this.listeCarte = new ArrayList<Carte>();
		// TODO Auto-generated constructor stub
		for(int j=0;j< tailleTotale;j++){
		this.listeCarte.add(new Carte());}
		
		
	}
	
	
	
	public void randomListe(){	
		
		
		for (int i=0;i<tailleTotale;i++) {
			
			this.listeCarte.get(i).setVal(1 + i / 2);
		}

		Collections.shuffle(this.listeCarte); 
		//return listeCarte;
	}

		// Verification des cartes
		public boolean verifCarte(Carte a, Carte b){
		
			if (a.getVal() == b.getVal()){
				compteur_paire++;
				System.out.println(ConsoleColors.BLUE_BACKGROUND+"Les cartes sont identiques" + ConsoleColors.RESET);
				System.out.println("Vous avez trouv� " + compteur_paire + " paires");				
				return true;
			}
			else {
				System.out.println(ConsoleColors.GREEN_BACKGROUND + "Les cartes sont diff�rentes" + ConsoleColors.RESET);
				System.out.println("Vous avez trouv� " + compteur_paire + " paires");
				return false;
			}
		}
		

		public void affichage()

		{
			System.out.print("| ");
			 for(int i=0;i<tailleTotale;i++){
			
				 
				 System.out.print(i+" |");
				// System.out.println("Info de "+ i +" : "+listeCarte.elementAt(i).getInfo());
			//	 System.out.print(afficher +" |");
			 }
			 System.out.println();	
			 	System.out.print("| ");
		for (int i = 0; i < tailleTotale; i++) {

			System.out.print(listeCarte.get(i).reveleCarte() + " |");
			// System.out.println("Info de "+ i +" : "+listeCarte.elementAt(i).getInfo());
			// System.out.print(afficher +" |");
		}
		System.out.println();
	 
		}
		
	// Retourner toutes les cartes sans paire
	public void retourneCarte() {
		for (int i = 0; i < tailleTotale; i++) {
			if (listeCarte.get(i).getInfo() == 1) {
				listeCarte.get(i).setInfo(0);

			}
		}
	}

	public boolean gagner() {
		if (compteur_paire == tailleTotale / 2) {
			System.out.println("f�licitation !! Vous avez gagn� !");
			return true;
		} else {
			return false;
		}
	}
		public void repetition_du_jeu(){
			 int temps1=0;
int temps2=0;
			int continuer = 1;
			while(continuer == 1){
				Scanner sc = new Scanner(System.in);
				System.out.println("Choix de la premiere carte : ");
				 
				 temps1 = sc.nextInt();

			System.out.println("Choix de la deuxieme carte : ");

			temps2 = sc.nextInt();

			if (temps1 == temps2) {
					 System.out.println("Erreur Vous avez choisi la m�me carte.");

				 }
				 else{
					
					 System.out.println("Valeur de la premi�re carte : " + this.listeCarte.get(temps1).getVal());
					 System.out.println("Valeur de la deuxi�me carte : " + this.listeCarte.get(temps2).getVal());
					 
					 if (verifCarte(this.listeCarte.get(temps1), this.listeCarte.get(temps2))){
						 this.listeCarte.get(temps1).setInfo(1);
						 this.listeCarte.get(temps2).setInfo(1);
					 };
				affichage();
					 
					 
					 try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 	for(int i = 0; i<50; i++){
					 		System.out.println(" ");
					 	}
					 	
					 if (gagner()){
						 System.out.println("Voulez vous rejouer?");
						 System.out.println("Taper 0 pour stopper le jeu");
						 if (sc.nextInt() == 0){					 
							 continuer = 0;
						 }
						 compteur_paire = 0;
					 }
				 }
				
			}
		}
		
		
	
		
}
