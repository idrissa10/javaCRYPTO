package gestionBancaire;

public class CompteEpargne extends ComptesBancaire{
	private double taux;
	public CompteEpargne(double solde,double taux){
		super (solde);
		this.taux = taux;
	}

}
