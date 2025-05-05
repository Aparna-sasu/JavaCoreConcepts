package basics;

public class DataTypesAssignment {

	public static void main(String[] args) {

		//1. Write a Java program to add two strings:

		String a = "Hello";

		String b = "Naveen K";

		String c = a +" "+ b;

		System.out.println(c);


		// 2. Write a Java program to print the sum of two numbers. Test Data: 74 + 36 

		int d = 74 + 36;
		System.out.println(d);


		//3. Write a Java program to print the division of two numbers.
		// k = 50/3
		//Expected Output :16

		int k = 50/3;
		System.out.println(k);

		//4. Write a Java program to compute the specified expressions and print the output. Go to the editor.
		//Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		//Expected Output: 2.138888888888889
		
		double res = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(res);
		
		//5. Try to concat "Hello Selenium" with a character 't'.
		
		String s = "Hello Selenium";
		char ch = 't';
		String s1 = s+ch;
		System.out.println(s1);
		
		//6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate 
		//and generate this output String : "Your Total  amount is. 3700".
		
		int num1 = 100;
		int num2 = 200;
		int num3 = 3400;
		int num4 = num1+num2+num3;
		
		System.out.println("Your Total  amount is. " +num4);
		
		//7.Print the ASCII value of the character 'h'.
		
		char t = 'h';
		int t1 = (int)t;
		System.out.println(t1);
		
		//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.


		char ar = 'd';
		int ar1 = (int)ar;
		int numAddn = ar1+3;
		char eqnCh = (char)numAddn;
		System.out.println(eqnCh);
		
		
        //9. Write a program to find the square of the number 3.9.
		
		float fNum = 3.9f;
		float squareOfNum = fNum * fNum ;
		System.out.println("Square of num is : "+squareOfNum);
		






	}

}