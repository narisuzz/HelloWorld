public class Object01{
	public static void main(String[] args) {
		person p1 = new person();
		p1.age = 10;
		p1.name = "iu";
		person p2 = p1;
		System.out.println(p2.age);
	}
}

class person {
	String name;
	int age;	
}