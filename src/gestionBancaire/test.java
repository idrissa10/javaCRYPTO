package gestionBancaire;

public class test {

	public static void main(String[] args) {
		int t [] ={1,2,3};
		int t1 [] ={1,2,4};
		
		System.out.println(t.equals(t1));
		System.out.println(t == t1);
		
		t1=t;
		System.out.println(t.equals(t1));
		System.out.println(t == t1);
		for(int i=0; i<t1.length; i++)
			System.out.println(t1[i]);
		
		

	}

}
