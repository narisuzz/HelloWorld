public class Logic01 {
	public static void main(String[] aegs) {
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ikuyou");
		}
		if(age > 20 | age < 30) {
			System.out.println("panpan");
		}
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4) {
			System.out.println("wawa");
		}
		System.out.println("a=" + a + "b=" + b);
	}
}