package csci3444.inheritance;

public class MainEntry {

	public static void main(String[] args) {
		Person p1, p2;
		Teacher t = new TeacherImpl("Ilker", "Java");
		Student s = new StudentImpl("Christina", "Java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("p1 name: " + p1.getName());
		System.out.println("p2 name: " + p2.getName());
		

	}

}
