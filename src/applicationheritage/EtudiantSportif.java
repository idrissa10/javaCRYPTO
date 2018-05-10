package applicationheritage;

public class EtudiantSportif extends Etudiant {
	private String sport;
	public EtudiantSportif(String prenom,String nom,int age,String sport){
		super(prenom,nom,age);
		this.sport=sport;
	}
	public void affiche(){
		System.out.println("votre nom est "+nom);
		System.out.println("votre prenom est "+prenom);
		System.out.println("votre age est "+age);
		System.out.println("votre sport preferer est "+sport);
	}

}
