public class Object02 {
	public static void main(String[] args) {
		person a = new person();
		a.age = 10;
		a.name = "iu";
		person b;
		b = a;
		
		System.out.println(b.name);
		b.age = 200;
		b = null;
		System.out.println(a.age);
		System.out.println(b.age);
	}
}

class person {
	String name;
	int age;	
}