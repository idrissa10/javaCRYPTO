package gestionBancaire;

import java.util.Scanner;

public class Examen {
	public void afficheMessage(String matiere){
		 System.out.printf("Bienvenue a cet examen de la matiere %s",matiere);
		 System.out.println("Entrer la matiere concernee");
		 Scanner sc = new Scanner(System.in);
		 String matiere1 = sc.nextLine();
		 Examen examen =new Examen();
		 examen.afficheMessage(matiere1);
		 
		 }
	public static void main(String[] args) {
		
	}	
			
	 }
