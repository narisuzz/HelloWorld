import java.util.Scanner;

public class If08 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);System.out.println("数字のみ入力");
		int x = myScanner.nextInt();
		if (x % 2 == 0) {
			System.out.println(x + "偶数");
		} else {
			System.out.println(x + "奇数");
		}
	}
}