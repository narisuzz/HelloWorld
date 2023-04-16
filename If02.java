import java.util.Scanner;
public class If02 {
	public static void main(String[] aegs) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你的年龄大于18，直接枪毙");
			} else {
				System.out.println("未满18周岁，应有期徒刑99年");
			}
		System.out.println("程序继续。。。。。");
	}
}