public class Work {
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1.0,5.6,3.7};
		Double res = a01.max(arr);
		if(res != null) {
			System.out.println("arr的最大值=" + a01.max(arr));
		} else {
		System.out.println("输入有误");
		}
	}
/*
 * 编写类A01  的¥定义方法max 实现求某个double数组的最大值 并返回
思路分析
类名 a01
方法 max
形参 double
返回值 double
先完成正常业务 然后在考虑代码的健壮性
*/
class A01 {
	public Double max(double[] arr) {
		if(arr != null && arr.length > 0) {
		double max = arr[0];//假定第一个元素就是最大值
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	} else {
		return null;
	}
	}
}

