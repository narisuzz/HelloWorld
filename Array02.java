import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double[] scores = new double [5];
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素的值" ); 
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("---------------"); 
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第" + i + "个元素的值=" + scores[i]); 
	}
	}
}