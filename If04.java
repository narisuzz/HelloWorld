import java.util.Scanner;
public class If04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分(1-100)");
		int grade = myScanner.nextInt();
		if (grade >=1 && grade <=100) {
		if (grade == 100) {
			System.out.println("优秀");
		} else if (grade > 80 && grade <= 99) {
			System.out.println("还行");
		} else if  (grade >= 60 && grade <= 80) {
			System.out.println("一般");
		}else {
			System.out.println("不及格");
		}
		} else {
			System.out.println("输入有误，请重新输入");
		}
	}
}