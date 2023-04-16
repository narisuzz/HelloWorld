import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-f）");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
		case 'a' :
			System.out.println("今日は月曜");
			break;
		case 'b' :
			System.out.println("今日は火曜日");
		case 'c' :
			System.out.println("今日は水曜日");
		case 'd' :
			System.out.println("今日は木曜日");
		case 'e' :
			System.out.println("今日は金曜日");
			default:
				System.out.println("再入力");
		}
		System.out.println("switch");
  }
}