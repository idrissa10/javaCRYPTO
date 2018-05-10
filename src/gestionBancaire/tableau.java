package gestionBancaire;
import java.util.Scanner;
public class tableau {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tab[]=new int[6];
		for(int i=0 ; i<=tab.length ;i++){
			System.out.println("Donner l'entier"+i);
			for(i=0;i<=tab.length;i++){
				tab[i]=sc.nextInt();
			}
			
		}
		int max =tab[0];
		for(int i=0 ;i<=tab.length;i++){
			if(max<tab[i]){
				max =tab[i];
			}
			
		}
		System.out.println(max);

	}

}
