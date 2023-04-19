import java.util.Scanner;
public class Break03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);//用户输入
		String name = "";//定义了名字变量来保存用户的输入
		String passwd = "";//定义了密码变量来保存用户的输入
		int chance = 3;//登陆机会
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			//if 是比较用户输入的名字和密码是否正确
			//字符串的内容比较
			if ("阿三".equals(name) && "666".equals(passwd)) {
				System.out.println("恭喜你登陆成功");
				break;
			}
			chance--;
			System.out.println("你还有" + chance +"登陆机会");
		}
	}
}