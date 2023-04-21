public class Array06 {
	public static void main(String[] args) {
		int[] arr = {3,4,8,5,76,34,976,536};
		int len = arr.length;
		int temp = 0;
		for(int i = 0; i < len / 2; i++) {
			temp = arr[len - 1 - i];
			arr[len - 1 - i ] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
		