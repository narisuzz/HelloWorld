public class Task06 {
	public static void main(String[] args) {
		for(int i = 1; i<=150; i++) {
			System.out.print(i); 
			if(i % 3 == 0) {
				System.out.print("ok");
			}
			if(i % 5 == 0) {
				System.out.print("sun");
			}
			if(i % 7 == 0) {
				System.out.print("nb");
			}
			System.out.println();
		}
	}
}