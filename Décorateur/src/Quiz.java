
public class Quiz extends Decorateur{

	@Override
	public void afficher() {
		System.out.println("Quiz affich�");
		
	}
	public Quiz(ComposantVisuel C) {
		this.C=C;
	}

}
