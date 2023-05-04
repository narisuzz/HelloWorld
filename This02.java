public class This02 {
	public static void main(String[] args) {
		person3 p1 = new person3("mary",20);
		person3 p2 = new person3("mary",20);
		System.out.println("p1和p2的比较结果=" + p1.compareTo(p2));
	}
}
class person3 {
	String name;
	int age;
	public person3(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(person3 p) {
		return this.name.equals(p.name) && this.age == p.age;
		}
	}
