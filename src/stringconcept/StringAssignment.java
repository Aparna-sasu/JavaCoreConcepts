package stringconcept;

import java.util.ArrayList;
import java.util.List;


public class StringAssignment {


	public static void main(String[] args) {

		System.out.println("1.  Write a program to check two different strings equality.");
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "hello";
		String s4 = new String("hello");

		System.out.println(s1==s2); // false
		System.out.println(s1==s3);// true
		System.out.println(s3==s4);// false
		System.out.println(s3==s2);// false


		System.out.println("*******************-------------------*********************");	


		System.out.println("2. Remove all  spaces in a String . For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”. ");
		String s = removeSpace("\"        Hello        Everyone       .\"");
		
		System.out.println(s);		


		System.out.println("*******************-------------------*********************");	

		System.out.println("3. Write a program that will  print out the last character and first character of a word. ");
		getFirstAndLastCharacter("Selenium Java Learning");


		System.out.println("*******************-------------------*********************");	


		System.out.println("4. Write a program to verify a word or a character contained in the sentence.");
		boolean result = verifyWord("Run run as fast as you can, run until you can't run anymore. Again and again, I try again.","run");
		System.out.println("run is present in the String : " +result);


		System.out.println("*******************-------------------*********************");		

		System.out.println("5.Write a function/ method to reverse your own name.");

		char[] newname = getReversedName("Aparna");
		System.out.println(newname);


		System.out.println("*******************-------------------*********************");		



		System.out.println("6. Write a program that gives you the last half of the string.");

		String str = "The sun is shining, the sun is bright, the sun is warm.";
		int half = str.length()/2;
		String s6 = str.substring(half);
		System.out.println(s6);


		System.out.println("*******************-------------------*********************");		

		System.out.println("7.Write a program to get the 3rd  “ e “ of the string .");

		getLetter("Welcome to Naveen Auetomatieon Labs !");



		System.out.println("*******************-------------------*********************");		

		System.out.println("8. Write a method which gives an index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.");

		String sd = "Welcome to Naveen Auetomatieon Labs !";
		System.out.println(getIndex(sd,"Cool"));
		System.out.println(getIndex(sd,"Labs"));


		System.out.println("*******************-------------------*********************");	

		System.out.println("9. Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .");

		getStringValues("Be happy, be cool.");

		System.out.println("10. Assume that a string consists of 3 words, print out the middle one.");

		getSecondWord("Find bugs early");

		System.out.println("*******************-------------------*********************");	

		System.out.println("11. get only numeric part from this String: String s = your transaction id is: 12345 and reference id is 34567;");

		List<String> numbers = getNumbers(" your transaction id is: 12345 and reference id is 34567");
		List<Integer> numberList = new ArrayList<Integer>();

		for(int i =0;i< numbers.size();i++ ) {

			numberList.add(Integer.parseInt(numbers.get(i)));

		}

		System.out.println(numberList);

	}



	private static List<String> getNumbers(String message) {

		String sq = message.replaceAll("\\D+", " ");
		String[] splitsq = sq.trim().split(" ");

		List<String> ls = new ArrayList<String>();

		for(String et : splitsq){
			ls.add(et);

		}

		//int  i= Integer.parseInt(ls.get(0));
		//System.out.println(i);
		return ls;
	}


	private static void getSecondWord(String sm) {

		String[] splitString = sm.split(" ");

		System.out.println(splitString[1]);

		//		for(String e1: splitString) {
		//			e1.
		//		}
		//return null;
	}





	private static void getStringValues(String st) {

		String[] stringToSplit = st.split(" ");

		for(String e : stringToSplit) {
			System.out.println(e);
		}
	}

	private static void getLetter(String str) {

		String[] sen = str.split(" ");
		char[] c ;
		int num=0;

		for(String g: sen) {
			for(int j=0;j<g.length();j++) {
				if(g.charAt(j)== 'e') {

					if(num<3) {
						num++;
						System.out.println(g.charAt(j));
					}
				}
			}
		}
	}




	private static char[] getReversedName(String name) {

		char[] ch = name.toCharArray();
		char[] st1 = new char[name.length()];


		for(int i=name.length()-1;i>=0;i--) {

			st1[name.length()-1-i] += ch[i];


		}
		return st1;
	}


	private static boolean verifyWord(String sentence, String word) {

		String[] splitSentence = sentence.split(" ");


		for(String s1:splitSentence ) {
			if(s1.equalsIgnoreCase(word)) {
				System.out.println(s1);
				return true;
			}
		}
		return false;
	}


	private static void getFirstAndLastCharacter(String phrase) {

		char first = phrase.charAt(0);
		char last = phrase.charAt(phrase.length()-1);

		System.out.println("character at first : "+ first);
		System.out.println("character at last : "+ last);

	}


	private static String removeSpace(String s) {
		String newName = s.replaceAll("\\s+", "");
		return newName;
	}


	public static int getIndex(String str,String target) {

		int index = str.indexOf(target);

		return(!(index == -1) ? index : -1);

	}
}
