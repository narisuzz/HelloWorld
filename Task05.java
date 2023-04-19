public class Task05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <=  100; i++) {
			for (int k = 1; k<= i; k++) {
				sum += k;
			}
		}
		System.out.println("sum=" + sum);
	}
	}