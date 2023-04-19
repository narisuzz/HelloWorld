public class Break01	 {
	public static void main(String[] args) {
		abc1:
			for(int a = 0; a <= 4; a++) {
				abc2:
					for(int i = 0; i < 10; i++) {
						if (i == 2 ) {
							break abc1;
						}
						System.out.println("i=" + i);
					}
			}
			
	}
}