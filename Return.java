public class Return {
	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			if (i == 3) {
				System.out.println("yeyeyye" + i);
				return;
			}
			System.out.println("lalalal");
		}
		System.out.println("dodododo");
	}
	}