import java.util.Scanner;

public class Flottantes {
	public static void main(String[] args) {
		final int N =5;
		double val[] =new double[N];
		int i ;
		@SuppressWarnings("resource")
		Scanner clavier =new Scanner(System.in);
		System.out.println("Entrer " + N + " valeurs flottantes");
		for(i=0;i<N;i++)
		val[i]=clavier.nextDouble();
		double valMax=val[0],valMin=val[0],somme=0;
		for(i=0;i<N;i++){
			if(val[i]>valMax) valMax=val[i];
			if(val[i]<valMin) valMin=val[i];
			somme+= val[i];
		}
		System.out.println("valeur maximale = " +valMax);
		System.out.println("valeur minimale = " +valMin);
		double valMoyenne=somme/N;
		System.out.println("moyenne "+valMoyenne);
	}

}
