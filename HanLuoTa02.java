public class HanLuoTa02 {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(2,4);
		method.m("加油");
		System.out.println(method.max(10, 20));
		System.out.println(method.max(10.0, 22.4));
		System.out.println(method.max(10, 2.9,9.6));
	}
}
 
class Methods {
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return  max1 > n3 ? max1 : n3;
	}
	public void m(int n) {
		System.out.println("平方=" + n * n);
	}
	public void m(int n1, int n2) {
		System.out.println("相乘=" + n1 * n2);
	}
	public void m(String str) {
		System.out.println("传入的str" + str);
    }
}