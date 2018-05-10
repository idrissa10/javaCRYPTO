
public class DroitAccesA extends DroitAcces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void affiche(){
			System.out.println("Coordonnees : " + getX() + " " + getY());
		}
		
		DroitAcces p =new DroitAcces();
		p.initialise(2, 5);
		System.out.println("Coordonnees : " + p.getX() + " " + p.getY());
		DroitAccesA pa=new DroitAccesA();
		pa.initialise(1, 8);
		pa.affiche();

	}

}
