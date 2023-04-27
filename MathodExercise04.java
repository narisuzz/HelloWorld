public class MathodExercise04 {
	public static void main(String[] args) {
	B b	= new B();
	int[] arr = {1,2,3,};
	b.test100(arr);
	System.out.println("main的arr数组");
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] +  " ");
	  }
	System.out.println();
	}
}
class B {
	public void test100(int[] arr) {
		arr[0] = 200;
		System.out.println("tsert100的arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] +  " ");
		}
	}
}