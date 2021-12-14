//Написать класс Student с полями String name, int age, String group и реализовать для него equals() и hashCode(). Научиться писать его в электронном блокноте безошибочно.


public class Student {
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		int result = age;
		result = 31*result + name.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
	   if (this == o) return true;
	   if (o == null || getClass() != o.getClass()) return false;
	   Student st = (Student) o;
	   
	   return age == st.age && name.equals(st.name);
	}
}
