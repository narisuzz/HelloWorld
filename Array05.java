public class Array05 {
	public static void main(String[] args) {
		int[] arr = {3,4,8,5,76,34,976,536,86,35,876,35,45343,65434,443,};
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {
        	if(max < arr[i]) {
        		max = arr[i];
        		maxIndex = i;
        	}
        }
        System.out.println("max=" + max + "     " + "maxIndex="
        		+ maxIndex); 
	}
	}