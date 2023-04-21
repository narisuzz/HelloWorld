import java.util.Scanner;
public class Caq {
	public static void main(String[] args) {
		String[] names = {"哪吒", "古力娜扎" ,"扎克热舞" ,"孙红雷" ,"黑蜂类" ,"一哭" ,"二小"};
		Scanner myScanner = new Scanner(System.in);
		 System.out.print("请输入名字");
		 String findName = myScanner .next();
		int index = -1;
		 for(int i = 0; i < names.length; i++) {
			 if(findName.equals(names[i])) {
				 System.out.print("恭喜你找到了" + findName);
				 System.out.print("下标=" + i);
				 index = i;
				 break;	 
			 }
		 }
		 if(index == -1) {
			 System.out.print("没找到" + findName);
		 }
		
	}
}