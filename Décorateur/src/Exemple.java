
public class Exemple extends Decorateur {

	@Override
	public void afficher() {
		
		System.out.println("Exemple affich�");
		
	}
	public Exemple(ComposantVisuel C) {
		this.C=C;
	}

}
