package gestionBancaire;

 class Point {

	public Point(char c, double x) 
	{
	 nom = c;
	 abs = x;
	
		
	}
	public void affiche()
	{
		System.out.println("Point de nom " + nom + " d'abscisse " + abs);
	}
	public void translate(double dx)
	{
		abs += dx ;
	}
	private char nom ;
	private double abs ;

}

