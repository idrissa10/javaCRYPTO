package gestionBancaire;
import java.util.Scanner;
public class Entier {

	public static void main(String[] args) {
		System.out.println("Entrer un entier que vous voulez");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int tabentier[] =new int[n];
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			tabentier[i]=i;
			System.out.println(tabentier[i]);
		}

	}

}
