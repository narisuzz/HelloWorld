public class MathodExercise05 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "milan";
		p.age = 23;
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		System.out.println("p1:" + p.age + " " + p.name);
		System.out.println("p2:" + p.age + " " + p.name);
	}
}
class Person {
	String name;
	int age;
}

class MyTools {
	public Person copyPerson(Person p) {
	Person p2	= new Person();
	p2.name = p.name;
	p2.age = p.age;
	return p2;
		
	}
}