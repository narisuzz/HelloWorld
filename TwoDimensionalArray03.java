public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		//创建二维数组，有三个一维数组组成，但是每个一维数组还没开数据空间
		int[][] arr = new int[5][];
		for(int i = 0; i < arr.length; i++) {//遍历arr每个一维数组
			//给每个一维数组开空间 new
			//如果没有给一维数组 new 那么arr【i】就是null
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;//赋值
			}
		}
		System.out.println( "========arr元素======== ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	}