public class Work01 {
	public static void main(String[] args) {
		String[] strs = {"jack","mmm","ffff"};
		A02 a02 = new A02();
		int index = a02.find("ffff", strs);
		System.out.println("index=" + index);
	}
}
//a编写类A02 定义方法find 实现查找某字符串是否在字符串数组中
//并返回索引 如果找不到 返回-1
class A02 {
	//思路分析
	//类名 a02
	//方法 find
	//形参 int
	//返回值 (String String[])
	//先完成正常业务 然后在考虑代码的健壮性
	 public int find(String findStr,String[] strs) {
		 for(int i = 0; i < strs.length; i++) {
			 if(findStr.equals(strs[i]) ) {
				 return i;
			 }
		 }
		 return -1;
	 }
}