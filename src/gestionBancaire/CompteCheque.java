package gestionBancaire;

public class CompteCheque extends ComptesBancaire {
	private double decouvert;
	
	public CompteCheque(double solde,double decouvert){
		super (solde);
		this.decouvert = decouvert;
		
	}
	
	void retirer(double montant){
		if(solde + decouvert >= montant)
			solde -= montant;
		
	}

}
