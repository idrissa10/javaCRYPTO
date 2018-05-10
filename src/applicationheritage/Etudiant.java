package applicationheritage;

public class Etudiant {
public String nom;
public String prenom;
public int age ;
public Etudiant(String nom, String prenom, int age){
	this.nom=nom;
	this.prenom=prenom;
	this.age=age;
}
public void affiche(){
	
	System.out.println("votre nom est "+nom);
	
	System.out.println("votre prenom est "+prenom);
	
	System.out.println("votre age est "+age);
}
public static void main(String[] args) {
	Etudiant etudiant1 =new Etudiant("Seck","Idrissa",26);
	Etudiant etudianta=new EtudiantEtranger("Kabore","Marc",30,"malien");
	EtudiantSportif etudiantm=new EtudiantSportif("Kante","Ngolo",27,"footballeur");
	System.out.println("je suis etudiant simple");
	etudiant1.affiche();
	System.out.println("je suis etranger");
	etudianta.affiche();
	System.out.println("je fais du sport");
	etudiantm.affiche();
}

}
