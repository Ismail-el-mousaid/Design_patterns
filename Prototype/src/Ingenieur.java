import java.awt.List;
import java.util.ArrayList;

public class Ingenieur implements Cloneable{
	private ArrayList<String> list;
	private static Ingenieur instance=new Ingenieur();
	
	private Ingenieur(){
		list = new ArrayList<String>();
	}
	
	public Ingenieur(ArrayList<String> list){
		this.list=list;
	}
	public void display(){
		list.add("el mousaid");
		list.add("mohamed");
		list.add("yassine");
	}
	
	public ArrayList<String> getIng() {
		return list;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			ArrayList<String> nouv = new ArrayList<String>();
			for(String s : this.getIng()){
				nouv.add(s);
			}
			return new Ingenieur(nouv);
	}
	
	public static Ingenieur getInstance() {
		return instance;
	}

}
