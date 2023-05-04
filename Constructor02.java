public class Constructor02 {
	public static void main(String[] args) {
		person6 p1 = new person6();//无参构造器
		System.out.println(p1.name +" " + p1.age);
		person6 p2 = new person6("milan",20);
		System.out.println(p2.name + " " +p2.age);
    }
}

class person6 {
	String name;
	int age;
	public person6() {
		age = 18;
	}
	public person6(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}