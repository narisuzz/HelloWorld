public class MaoPao {
	public static void main(String[] args) {
		int[] arr = {37,4,85,6,53,536,26,13,8};
		int tamp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
		for(int j = 0; j < arr.length - 1 ; j++) {
			if(arr[j] > arr[j + 1]) {
				tamp = arr[j];
				 arr[j] = arr[j + 1];
				arr[j + 1] = tamp;
			}		
		}
		System.out.print("\n"  + "di" + (i + 1) + "lun");
		for(int j = 0; j < arr.length ; j++) {
		    System.out.print(arr[j] + "\t");
	}
}
}
}