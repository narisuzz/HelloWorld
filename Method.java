public class Method {
	public static void main(String[] args) {
		jinrui p1= new jinrui();
		p1.speak();
		p1.cal();
		p1.cal1(8);
		int returnRes = p1.getSum(10, 20);
		System.out.println("getSum方法返回的值=" + returnRes );
	}
}

class jinrui {
	String name;
	int age;
	public void speak() {
		System.out.println("我是谁");
	}
	public void cal() {
		int res = 0;
		for(int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("计算结果=" + res);
	}
	public void cal1(int n) {
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("计算结果=" + res);
     }
	 public int getSum(int num1,int num2) {
		 int res =  num1 + num2;
		 return res;
	 }
}