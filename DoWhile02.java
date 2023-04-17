public class DoWhile02 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		int t = 5;
		int g = 3;
		int f = 200;
		do {
			if(i % t == 0 && i % g != 0) {
			System.out.println(i);	
			count++;
			}
			i++;
		} while (i <= f);
		System.out.println("count=" + count);	
	}
	}