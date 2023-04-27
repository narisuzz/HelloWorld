public class Recursion02{
	public static void main(String[] args) {
		G t1 = new G();
		int n = 9;
		int res = t1.fibonacci(n);
		if( res != -1) {
		System.out.println("当" + n + "时"+ res);
   }
}
}
class G {
	public int fibonacci(int n) {
		if(n >= 1) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci( n - 1) + fibonacci(n - 2);
		}
	 } else {
		 System.out.println("要求输入 n 》= 1");
		 return n;
	 }
   }
}
