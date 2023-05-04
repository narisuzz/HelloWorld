public class This01 {
	public static void main(String[] args) {
		T2 t2 = new T2();
		t2.f2();
	}
}
class T2 {
	public T2() {
		this("jack",100);
		System.out.println("T()构造器");
	}
	public T2(String name,int age) {
		System.out.println("T(String name,int age)构造器");
	}
	public void f1() {
		System.out.println("f1()方法。。");
	}
	public void f2() {
		System.out.println("f2()方法。。");
		f1();
		this.f1();
}
}