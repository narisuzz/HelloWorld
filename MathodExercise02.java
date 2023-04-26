public class MathodExercise02 {
	public static void main(String[] args) {
		II a = new II();
		a.print(4, 4, '$');
	}
}

class II {
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}