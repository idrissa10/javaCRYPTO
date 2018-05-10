package gestionBancaire;

public class ComptesBancaire {
	double solde ;
	
	public ComptesBancaire (double solde){
		this.solde = solde;
		
	}
	void deposer (double montant){
		solde += montant;
	}
	void retirer (double montant){
		if(solde >= montant)
			solde -= montant;
	}


}
