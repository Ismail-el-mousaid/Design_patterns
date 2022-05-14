
public class FabriqueNouveau extends FabriqueTech{
	
	private static FabriqueNouveau instance=new FabriqueNouveau();

	public Ordinateur creerOrdinateur() {
		return new OrdinateurNouveau();
		}

	public Telephone creerTelephone() {
		return new TelephoneNouveau();
	}
	
	
	public static FabriqueNouveau getInstenace() {
		return instance;
	}


}
