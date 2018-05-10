package applicationheritage;
import java.util.Scanner;
public class InterUsers {
	public static void main(String[] args){
	int essai=0;
	Scanner sc =new Scanner(System.in);
	
	System.out.println("entrer un entier a");
	int a=sc.nextInt();
	System.out.println("entrer un entier b");
	int b=sc.nextInt();
	if(a==b){
		System.out.println("vous avez gagne");
	}
	/*else if(b<a){
		System.out.println("la valeur que vous avez entree est inferieure a ma valeur");
	}
	else{
		System.out.println("la valeur que vous avez entree est superieure a ma valeur");
	}*/
	
		do{
			System.out.println("entre un entier b");
			essai;
		}while(a!=b);
	
	}
}


