package gestionBancaire;

public class TestTabUtil {

	public static void main(String[] args) {
		TabUtil tableau= new TabUtil();
		int[] tab=new int[7];
		tab =tableau.genere(7);
		tableau.affiche(tab);
		int[] tabA = new int[9];
		int[] tabB = new int[9];
		tabA = tableau.genere(9);
		tabB = tableau.genere(9);
		tableau.affiche(tableau.somme(tabA, tabB));
		tableau.affiche(tableau.incremente(tabA));
		

	}

}
