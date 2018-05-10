package gestionBancaire;

public class TabUtil {

	
		public int[] genere(int n){
			int[] tab = new int[n];
			for(int i=0,j=1;i<tab.length;i++,j+=2){
				tab[i]=j;
			}
			return tab;
		}
		public int[] somme(int[] tab1, int[] tab2){
			int[] tab3 = new int[tab1.length];
			for(int i=0;i<tab3.length;i++){
				tab3[i] = tab1[i]+ tab2[i];
			}
			return tab3;
		}
		public void affiche(int[] tab){
			for(int i=0;i<tab.length;i++){
				System.out.println(tab[i]);
			}
		public int[] incremente(int[] tab){
			for(int i=0;i<tab.length;i++){
				if(i%2==1){
					tab[i]+=tab[i];
				}
				return tab;
			}
		}
		
			
			
		

	}

}
