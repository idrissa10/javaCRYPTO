package gestionBancaire;

public class Livre {
	private String titre ;
	private String auteur ;
	private double prix ;
	public Livre (String titre , String auteur ,double prix)
{
	
	titre =this.titre ;
	auteur =this.auteur ;
	prix =this.prix ;
}
public String getAuteur()
{
	return this.auteur ;
	
}
public double getPrix(){
	return this.prix ;
}
public void setTitre(String titre){
	auteur = this.titre;
}
public void setAuteur(String auteur){
	auteur =this.auteur;
}
public void setPrix(double prix){
	prix =this.prix ;
}
public void Afficher(){
	System.out.println(this.titre);
	System.out.println(this.auteur);
	System.out.println(this.prix);
}
public static void main(String args[]){
	Livre livre1 = new Livre("tac","tic",20000);
	Livre livre2 = new Livre("sac","pic",30000);
	livre1.Afficher();
	livre2.Afficher();
}
}
