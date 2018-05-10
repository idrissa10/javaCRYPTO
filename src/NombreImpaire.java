import java.util.Scanner;

public class NombreImpaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("entrer un nombre : ");
		int a= clavier.nextInt();
		int []car = new int[a];
		for(int i=0;i<car.length;i++){
			car[i]= (2*i)+1;
			System.out.println((2*i)+1 +" a pour carre "+ car[i]*car[i] );
		}

	}

}
