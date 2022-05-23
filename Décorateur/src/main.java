
public class main {
	public static void main(String[] args) {
		ComposantVisuel v1 = new Cours();
		v1.afficher();
		ComposantVisuel v2 = new Exemple(v1);
		v2.afficher();
		ComposantVisuel v3 = new Quiz(v2);
		v3.afficher();
		
	}

}
