public class Task01 {
	public static void main(String[] args) {
		double money = 100000; //还有多少钱
		int count  = 0; //累计过路的路口
		while (true) {  //无限循环
			if (money > 50000) { //
				money = money - money * 0.05;//过路口后还剩多少钱
				count++;//累计过路的路口
			}else if (money >= 1000) {
				money -= 1000;
				count++;//累计过路的路口
			} else { //前不够1000
				break;
			}
		}
		System.out.println("还剩" + money + "\n" +"100000可以过" 
		+ count + "路口");
	}
}