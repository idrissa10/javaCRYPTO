package gestionBancaire;

public class TabInverse {

	public static void main(String[] args) {
		public static int[] inverseTab(int t[]){
			int tabres[]=new int [t.length];
			for(int i<t.length -1;i>=0;i--)
				tabres[t.length -i -1] = t[i];
			return tabres;
		}
		public static void afficheTab(int t[]){
			for(int i = O;i < t.length ;i++)
				System.out.println(t[i] + " ");
			
		}

	}

}
