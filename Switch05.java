import java.util.Scanner;

public class Switch05 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);System.out.println("请输入月份");
		int month = myScanner.nextInt();
		//if (month >=1 && month <= 12) {
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month + "月は31日まであります");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(month + "月は30日まであります");
			break;
		case 2 :
			System.out.println(month + "月は28,または29日まであります");
			break;
			default:
				System.out.println("エラー");
		}
		//} else {
			//System.out.println("エラー");
		}
	}
