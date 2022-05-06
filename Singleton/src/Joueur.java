
public class Joueur {
	private String nom;
	private int age;
	private static Joueur instance=new Joueur();
	
	private Joueur() {
		super();
	}
	
	public static Joueur getInstance() {
		return instance;
	}
	

}
