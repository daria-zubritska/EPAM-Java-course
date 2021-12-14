import java.util.ArrayList;

//Создать immutable object (обязательно должна присутствовать ссылка на mutable часть). Научиться писать его в электронном блокноте безошибочно.
public final class ImmutableObj {
	
	private final String immName;
	private final int immCount;
	private final ArrayList<Double> immarr;
	
	ImmutableObj(String name, int age, ArrayList<Double> arr){
		 immName = name;
		 immCount = age;
		 
		 ArrayList<Double> temparr = new ArrayList<Double>();
		 
		 for(double d : arr) {
			 temparr.add(d);
		 }
		 
		 immarr = temparr;
	}
	
	public String getName() {
		return immName;
	}
	
	public int getCount() {
		return immCount;
	}
	
	public ArrayList<Double> getArr(){
		ArrayList<Double> temparr = new ArrayList<Double>();
		 
		for(double d : immarr) {
			temparr.add(d);
		}
		 
		return temparr;
	}

}
