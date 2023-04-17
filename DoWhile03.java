import java.util.Scanner;
public class DoWhile03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("我叫你一声你敢答应吗");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		} while (answer != '好');
		System.out.println("孙行者");
	}
}