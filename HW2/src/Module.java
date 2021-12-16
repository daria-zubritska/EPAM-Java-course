import java.util.ArrayList;

public class Module {
	
	private ArrayList<Person> arr = new ArrayList<>();
	
	class Person{
		private String name;
		private String password;
		
		Person(String name, String pass){
			this.name = name;
			this.password = pass;
		}
	}
	
	public void addPerson(String name, String pass) {
		arr.add(new Person(name, pass));
	}

}
