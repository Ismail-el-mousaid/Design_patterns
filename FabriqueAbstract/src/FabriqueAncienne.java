
public class FabriqueAncienne extends FabriqueTech{
	
	private static FabriqueAncienne instance=new FabriqueAncienne();

	public Ordinateur creerOrdinateur() {
		return new OrdinateurAncienne();
	}

	public Telephone creerTelephone() {
		return new TelephoneAncienne();
	}
	
	public static FabriqueAncienne getInstenace() {
		return instance;
	}

}
