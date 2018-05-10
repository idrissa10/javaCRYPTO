import java.util.Scanner;

public class SerieHarmoniaue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nt;
		float som=0;
		int i ;
	
		Scanner clavier =new Scanner(System.in);
		
	 		System.out.println("Combien de termes");
			nt = clavier.nextInt();
			if(nt<1){
				System.out.println("Entrer un nombre superieur a 1");
				System.out.println("Combien de termes");
				nt = clavier.nextInt();
			}if(nt>100){
				System.out.println("Entrer un nombre inferieur a 100");
				System.out.println("Combien de termes");
				nt = clavier.nextInt();
			}
		
			else{
				for(int compteur=0;compteur<5;compteur++)
				for (i =1,som = 0;i<=nt;i++) som+=(float)1/i;
				System.out.println("Somme des " + nt + " premiers termes =" +som);
			}
		
	
		
		}
	}


