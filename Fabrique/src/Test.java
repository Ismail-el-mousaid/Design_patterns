
public class Test {
	public static void main(String[] args) {
		Gagnant x = new GagnantPre();
		Medaille v = x.creerMedaille();
		System.out.println(v);
		
		Gagnant y = new GagnantDeu();
		Medaille m = y.creerMedaille();
		System.out.println(m);
	}

}
