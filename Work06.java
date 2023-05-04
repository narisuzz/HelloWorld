public class Work06 {
		int count = 9;//属性
		public void count1() {//成员方法
			count = 10;
			System.out.println("count1=" + count);
		}
		public void count2() {//成员方法
			System.out.println("count1=" + count++);
		}
		public static void main(String args[]) {
			new Work06().count1();
			Work06 w1 = new Work06();
			w1.count2();
			w1.count2();
		}
	}

