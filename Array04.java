public class Array04 {
	public static void main(String[] args) {
		char[] chars = new char[26];
		for(int i = 0; i < chars.length; i++) {
			chars[i] = (char)('A' + i);
		}
		System.out.println("---------------"); 
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " "); 
		}
	}
	}