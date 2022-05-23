
public class Quiz extends Decorateur{

	@Override
	public void afficher() {
		System.out.println("Quiz affiché");
		
	}
	public Quiz(ComposantVisuel C) {
		this.C=C;
	}

}
