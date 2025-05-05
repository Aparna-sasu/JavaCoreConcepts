package methodsassignments;

import java.util.Scanner;

// 8. Write a program to print the factorial of a number by defining a method named 'Factorial'.

// Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

// 4! = 1*2*3*4 = 24
// 3! = 3*2*1 = 6
// 2! = 2*1 = 2 
// Also,
// 1! = 1
// 0! = 1

public class FactorialOfNumber {
	
	  int i=1;

	public static void main(String[] args) {

		// Input from user 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");

		int value = sc.nextInt();

		FactorialOfNumber fc = new FactorialOfNumber();
		int res = fc.factorial(value);
		
		System.out.println(res);

		sc.close();
	}
// 1. using for loop
	
//	public void factorial(int num) {
//
//		int j = 1;
//		
//		// checking if entered number is 0 or 1. if so, then the if block is executed.
//
//		if (num == 0 || num == 1) {
//			System.out.println(num + "!" + " = " + num);
//		}
//
//		else {
//			System.out.println("Entered value: " + num);
//			j = num * (num - 1);
//
//			for (int i = 2; i < num; i++) {
//
//				j *= (num - i);
//
//			}
//
//			System.out.println(num + "! = " + j);
//
//		}
//
//	}
	
	
	// 2. using while loop
	
	
//	public  void factorial(int n) {
//		int j = n;
//		
//		
//		while(i<n) {
//			j = j*(n-i);
//			i++;
//			
//		}
//		System.out.println(n + "! = " + j);
//	}

	
	//3. using recursive function
	
	public int factorial(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		
		return n*factorial(n-1);
	}
}
