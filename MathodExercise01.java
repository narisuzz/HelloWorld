public class MathodExercise01 {
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isOdd(2)) {
			System.out.println("是奇数");
		} else {
			System.out.println("是偶数");
		}
		
	}
}

class AA {
	public boolean isOdd(int num) {
		return num % 2 !=  0 ? true : false;
	}
}