package testpackage;

import java.util.Arrays;


public class Palindrome {


	public static void checkPalindrome(String s) {

		int i=0;
		char[] ch = s.toCharArray();
		boolean isPalindrome = true;

		System.out.println(Arrays.toString(ch));

		while(i<ch.length-1/2) {
			if(ch[i]== ch[ch.length-1-i]) {
				
				i++;

			}

			else {
				System.out.println("not palindrome");
				isPalindrome = false;
				break;

			}
		}

		if(isPalindrome) {
			System.out.println("is palindrome");
		}

	}





	public static void main(String[] args) {

		Palindrome.checkPalindrome("appa");

	}
}
