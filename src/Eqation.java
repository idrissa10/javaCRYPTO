import java.util.Scanner;

public class Eqation {

	public static void main(String[] args) {
		double c=1;
		double a=-2;
		double b=1;
		double delta=(b*b-(4*a*c));
		double x1=(-b- Math.sqrt(delta))/(2*a);
		double x2=(-b+ Math.sqrt(delta))/(2*a);
		double x0=-b/2*a;
	
		
		System.out.print ("entrer un nombre a : ") ;
		Scanner clavier =new Scanner(System.in);
		a = clavier.nextDouble() ;
		 System.out.print ("entrer un nombre b : ") ;
		b = clavier.nextDouble() ;
		 System.out.print ("entrer un nombre c : ") ;
		c = clavier.nextDouble() ;
		if (delta == 0) { System.out.println (" la solution est de x0" + x0) ;
		} else if(delta<0){
			System.out.println("pas de solutions");
		}
		else{
			
		System.out.println (" Sa racine est " + Math.sqrt(delta)) ;
		System.out.println(" les solutions sont x1 " + x1 + "et x2 " + x2);
		}
		

	}

}
