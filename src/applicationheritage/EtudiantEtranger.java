package applicationheritage;

public class EtudiantEtranger extends Etudiant {
	private String origine;

public EtudiantEtranger(String prenom, String nom,int age,String origine){
	super(prenom,nom,age);
	this.origine=origine;
	
}
public void affiche(){
	System.out.println("votre nom est "+nom);
	System.out.println("votre prenom est "+prenom);
	System.out.println("votre age est "+age);
	System.out.println("votre origine est"+origine);
}
}
