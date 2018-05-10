import java.util.Scanner;

public class Comptage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
		char []tab={'a','o','e','i','u','y'};
		int ntab[]=new int[tab.length];
		for(int i=0;i<ntab.length;i++)
			ntab[i]=0;
		System.out.println("entrer un mot");
		String mot= clavier.nextLine();
		for(int i=0;i<mot.length();i++){
			for(int j=0;j<tab.length;j++){
				
			
				if(mot.charAt(i)==tab[j]){
					ntab[j]++;
				}
			}
		}			
		for(int i=0;i<tab.length;i++)
					System.out.println("il comporte: " +ntab[i]+ "fois la valeur de "+tab[i]);
					
			
				

	}

}
