import java.util.Scanner;

public class Trie {
	static Scanner  clavier= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier= new Scanner(System.in);
		System.out.println("entrer le nombre de mots");
		int nMot=clavier.nextInt();
		String tab[]=new String[nMot];
		System.out.println("donnez vos mots");
		for(int i=0;i<nMot;i++)
			tab[i]=clavier.nextLine();
		
		String motMin[]=new String [nMot];
		for(int i =0; i<nMot;i++)
			motMin[i]=tab[i].toLowerCase();
		
		String temp;
		for(int i=0;i<nMot-1;i++)
			for(int j =i+1;j<nMot;j++)
				if((motMin[i]).compareTo(motMin[j])>=0){
					temp=motMin[i];motMin[i]=motMin[j];motMin[j]=temp;
					temp=tab[i];tab[i]=tab[j];tab[j]=temp;
					System.out.println("le mot s'y trouve");
					
					
				}else{
					System.out.println("le mot ne s'y trouve pas");
				}
	}
}
				//System.out.println("Liste par ordre alphabetique :");
				//for(int i =0;i<nMot;i++){
					//System.out.println(tab[i]);
				
				
			
			


	/*public static void main (String args[])
	{ // lecture des donnees
	System.out.print ("Combien de mots ? ") ;
	int nMots = clavier.nextInt() ;
	String [] mots = new String[nMots] ;
	System.out.println ("donnez vos mots") ;
	for (int i=0 ; i<nMots ; i++)
	mots[i] = clavier.nextLine() ;
	// conversion de chaque mot en minuscules
	String [] motsMin = new String[nMots] ;
	for (int i=0 ; i<nMots ; i++)
	motsMin[i] = mots[i].toLowerCase() ;
	// tri par reorganisation des references (mots d'origine et en minuscules)
	// (on compare chaque mot (minuscule) a tous ses suivants)
	String temp ;
	for (int i=0 ; i<nMots-1 ; i++)
	for (int j=i+1 ; j<nMots ; j++)
	if (motsMin[i].compareTo(motsMin[j]) >= 0)
	{ temp = motsMin[i] ; motsMin[i] = motsMin[j] ; motsMin[j] = temp ;
	temp = mots[i] ; mots[i] = mots[j] ; mots[j] = temp ;
	}
	// affichage des chaines triees
	System.out.println ("Liste par ordre alphabetique :") ;
	for (int i=0 ; i<nMots ; i++) // ou (depuis JDK 5.0) :
	System.out.println (mots[i]) ; // for (String mot : mots)
	} // System.out.println (mot) ;
	}*/
