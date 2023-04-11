public class Ternary {
	public static void main(String[] aegs) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		int in = a > b ? a++ : --b;
		System.out.println("in=" + in);
	}
}