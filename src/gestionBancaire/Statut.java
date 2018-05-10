package gestionBancaire;
import java.util.Scanner;
public class Statut {
	private static String nom;
	private static String prenom;
	static int anneeDeNaissance;
	static int anneeEnCours;
	static int age;
	static int b = anneeEnCours-anneeDeNaissance;
	
	public int age(int b){
		return b;
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Entrer votre nom \n");
		System.out.println("Entrer votre prenom \n");
		System.out.println("Entrer votre age \n");
		///String nom = sc.nextLine();
		String prenom = sc.nextLine();
		Integer age = sc.nextInt();
		System.out.println("Bonjour " + nom + prenom +"votre age est"+b);
		sc.close();
		
	
	}

}
