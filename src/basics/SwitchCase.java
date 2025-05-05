package basics;

public class SwitchCase {

	public static void main(String[] args) {
		// find the vowel
		char ch = 97;
		switch(ch) {
		
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
			default:
				System.out.println("invalid");
		}
	}

}
