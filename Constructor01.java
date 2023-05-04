public class Constructor01 {
	public static void main(String[] args) {
		person9 p1 = new person9("smith",60);
		person9 p2 = new person9("tom");
	}
}

class person9 {
	String name;
	int age;
	//构造器
	//构造器没有返回值
	public person9(String pName, int pAge) {
		System.out.println("构造器被调用");
		name = pName;
		age = pAge;
	}
	public person9(String pName) {
		name = pName;
	}
} 