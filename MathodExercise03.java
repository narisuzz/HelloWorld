public class MathodExercise03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		BB ojt = new BB();
		ojt.swap(a,b);
		System.out.println("a=" + a + "\tb=" + b);
	}
}
class BB {
	public void swap(int a,int b) {
		System.out.println("a=" + a + "\tb=" + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a=" + a + "\tb=" + b);
	}
}