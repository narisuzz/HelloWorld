 public class DoWhile01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			System.out.println(i);	
			i++;
			sum += i;
		} while (i <= 100);
		System.out.println("sum=" + sum );
	}
	}