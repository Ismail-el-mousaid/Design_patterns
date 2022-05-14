
public class Test {
	public static void main(String[] args) {
		
		
		FabriqueTech  x = FabriqueAncienne.getInstenace();
		Ordinateur j = x.creerOrdinateur();
		Telephone g = x.creerTelephone();
		System.out.println(j);
		System.out.println(g);
		
		FabriqueTech  y = FabriqueNouveau.getInstenace();
		Ordinateur m = y.creerOrdinateur();
		Telephone n = y.creerTelephone();
		System.out.println(m);
		System.out.println(n);
		
	}

}
