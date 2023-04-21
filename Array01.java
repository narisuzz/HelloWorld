public class Array01 {
	public static void main(String[] args) {
		double [] hens = {3,5,1,3.4,2,50};
		double totalweight = 0;
		for(int i = 0; i < hens.length;i++) {
			totalweight += hens[i];
		}
		System.out.print("总体重=" + totalweight + 
				"平均体重=" + (totalweight / hens.length )  ); 
	}
	}