
public class DroitAcces {
	public void initialise(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void deplace(int dx,int dy){
		x+=dx;
		y+=dy;
	}
	public static int getX(){return x;
	
	}
	public static int getY(){
		return y;
	}
	static int x,y;
	public void affiche(){
		System.out.println("Coordonnees : " + getX() + " " + getY());
	}

}
