package gestionBancaire;

 abstract class Forme {
	 public abstract double perimetre();
	 
	 class circle extends Forme {
		 private double r ;
		 public double perimetre() { return 2*Math.PI*r;}
		 
	 }

}
