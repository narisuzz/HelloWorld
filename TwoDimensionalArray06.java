public class TwoDimensionalArray06 {
	public static void main(String[] args) {
		int [] arr = {10,12,45,90};
		int insertNum = 20; //需要插入的值
		int index = -1; //位置
		for(int i = 0; i < arr.length;i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;//找到位置后退出
			}
		}
		if(index == -1) { //如果还没找到位置
			index = arr.length;//那么这个数放在最后位置
		}
		System.out.println("index=" + index);
		
		int[] arrNew = new int[arr.length + 1];//新建一个数组 比前一个数组大
		for(int i = 0, j = 0; i < arrNew.length; i++) {
			if( i != index) {
				arrNew[i] = arr[j];
				j++;
			} else {
				arrNew[i] = insertNum;
			}
		}
		arr = arrNew;
		System.out.println("===============");
		for(int i = 0; i < arr.length;i++) { 
			System.out.print(arr[i] + "\t");
		}
	}
	}