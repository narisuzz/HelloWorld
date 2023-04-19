public class While {
	public static void main(String[] args) {
		int i = 1;
		int num = 100;
		int t = 3;
		while (i <= num) {
			if(i % t == 0) {
			System.out.println("加油" + i);
			}
			i++;
		}
		System.out.println("继续");
		System.out.println("-------------");
		int j = 40;
		while (j <= 200) {
			if (j % 2 == 0) {
				System.out.println("j=" + j);
			}
			j++;
		}
	}
}