import java.util.ArrayList;

public class tester {
	
	public static void main(String[] args) {
		Student s1 = new Student("aaaa", 12);
		Student s2 = new Student("aaaa", 12);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		
		Student s3 = new Student("aaab", 12);
		Student s4 = new Student("aaaa", 12);
		
		System.out.println(s4.equals(s3));
		System.out.println(s3.hashCode() + " " + s4.hashCode());
		
		Student s5 = new Student("aaaa", 12);
		Student s6 = new Student("aaaa", 14);
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.hashCode() + " " + s6.hashCode());
		
		 ArrayList<Double> map = new ArrayList<>();
		 
	        map.add((double) 1);
	        map.add((double) 2);
	 
	        ImmutableObj s = new ImmutableObj("ABC", 101, map);
	 
	        System.out.println(s.getName());
	        System.out.println(s.getCount());
	        System.out.println(s.getArr());
	 
	        //s.immCount = 102;
	 
	        map.add((double)3);
	        System.out.println(s.getArr());
	        s.getArr().add((double)4);
	        System.out.println(s.getArr());
	}

}
