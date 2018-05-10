package applicationheritage;

public class TestException {
	public static void main(String[] args) {
		int a=2 ;
		int b =0;
		int tab[]={1,2,3};
		try{
		System.out.println("resultat = "+ (a/b));
		}catch(Exception e){
			System.out.println("Attention revoyer la saisie");
			System.out.println(e.getMessage());
			try{
			System.out.println(tab[10]);
			}catch(Exception d){
				System.out.println("Attention revoyer la saisie");
				System.out.println(d.getLocalizedMessage());
			}
		}
	}

}
