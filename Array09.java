//数组扩容
import java.util.Scanner;
public class Array09 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3};//初始数组
		do {
		int[] arrNew = new int[arr.length + 1];//建新数组 比初始数组（） + 1
		for(int i = 0; i < arr.length; i++) { //遍历arr数组
			arrNew[i] = arr[i]; //依次将arr的元素拷贝到arrNew数组
		    }
		System.out.println("请输入要添加的元素");
		int addNum = myScanner.nextInt();
		arrNew[arrNew.length - 1] = addNum;
		arr = arrNew;
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
	         }
		System.out.println("是否继续添加");
		char key = myScanner.next().charAt(0);
		if (key == 'n') {
			break;
		}
		} while (true);
		System.out.println("退出了程序");
}
}