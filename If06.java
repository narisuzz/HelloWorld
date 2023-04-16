import java.util.Scanner;
public class If06 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int yue = myScanner.nextInt();
		if (yue >=1 && yue <= 12) {
			if (yue >= 4 && yue <= 10) {
				System.out.println("请输入年龄");	
				int age = myScanner.nextInt();
				if (age >18 && age <60) {
					System.out.println("票价60");
				}else if (age< 18) {
					System.out.println("票价30");
				}else if (age > 60) {
					System.out.println("票价20");
				}
			}else {
				System.out.println("请输入年龄");
				int age = myScanner.nextInt();
				if (age >18 && age <60) {
					System.out.println("40");
				} else {
					System.out.println("20");
			}
		}
		
		} else {
		System.out.println("重新输入年龄");
	}
}
}
		
		
      
		