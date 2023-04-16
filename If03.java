public class If03 {
	public static void main(String[] aegs) {
		double d1 = 56.5;
		double d2 = 2.5;
		if(d1 > 10.0 && d2 < 20.0) {
			System.out.println("两个数和=" + (d1 + d2));
		}
		System.out.println("==============");
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("和可以被3又能被5整除");
		} else {
			System.out.println("和不能别3和5整除");
		}
		System.out.println("==============");
		  int year = 2023;
		  if((year % 4 == 0 && year % 100 != 100)|| year % 400 == 0) {
			  System.out.println(year + "是闰年");
		  }else {
			  System.out.println(year + "不是闰年");
		  }
	}
}