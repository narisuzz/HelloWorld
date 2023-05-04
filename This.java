public class This {
	public static void main(String[] args) {
		Dog3 dog1 = new Dog3("jani",5);
		dog1.info();
	}
}

class Dog3 {
	String name;
	int age;
public Dog3(String name, int age) {
	this.name = name;//当前对象的属性
	this.age = age;
   }
public void info() {
	System.out.println(name + " " + age);
}
}