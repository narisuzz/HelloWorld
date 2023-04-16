import java.util.Scanner;
public class Switch02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-e ）");
		char g = myScanner.next().charAt(0);
		switch(g) {
		case'a' :
			System.out.println("A");
			break;
		case'b' :
			System.out.println("B");
			break;
		case'c' :
			System.out.println("C");
			break;
		case'd' :
			System.out.println("D");
			break;
		case'e' :
			System.out.println("E");
			break;
			default:
				System.out.println("重新输入");
		
			
		
		}
		
	}
}
