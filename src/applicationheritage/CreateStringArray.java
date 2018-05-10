package applicationheritage;
import java.util.StringTokenizer;
public class CreateStringArray {	
		public static String [] arrayFromString(String s){			
	StringTokenizer st =new StringTokenizer(s," ");
	String[] tab=new String[st.countTokens()];
	int compteur=0 ;
	while(st.hasMoreTokens()){
		tab[compteur]=st.nextToken();
		compteur++;
		
	}return tab;
		}
		public static void afficheString(String [] s){
			for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
}
		public static void main(String[] args) {
			String chaine=arrayFromString();
			

		}
}