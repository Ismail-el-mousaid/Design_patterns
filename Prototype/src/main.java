import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Ingenieur ing = Ingenieur.getInstance();
		ing.display();
		System.out.println("Listes des ingénieurs: "+ing.getIng());
		Ingenieur newIng = (Ingenieur) ing.clone();
		ArrayList<String> list = newIng.getIng();
		list.add("ismail");
		System.out.println("Mise à jour de liste: "+list);
		
	}
	

}