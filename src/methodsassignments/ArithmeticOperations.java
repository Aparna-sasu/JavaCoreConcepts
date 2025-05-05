package methodsassignments;

import java.util.Scanner;

// 1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method

public class ArithmeticOperations {

	int a;
	int b;

	public static void main(String[] args) {

		ArithmeticOperations operations = new ArithmeticOperations();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1: ");
		operations.a = sc.nextInt();

		System.out.println("Enter num2: ");
		operations.b = sc.nextInt();

		int addRes = operations.addNumbers(operations.a,operations.b);
		int subRes = operations.subNumbers(operations.a,operations.b);
		int multiplyRes = operations.multiplyNumbers(operations.a,operations.b);
		int divideRes = operations.divideNumbers(operations.a,operations.b);


		System.out.println(operations.a +" + " + operations.b + " = "+ addRes);
		System.out.println(operations.a +" - " + operations.b + " = "+ subRes);
		System.out.println(operations.a +" * " + operations.b + " = "+ multiplyRes);
		System.out.println(operations.a +" % " + operations.b + " = "+ divideRes);

		sc.close();

	}


	public int addNumbers(int num1,int num2) {
		return num1+num2;
	}

	public int subNumbers(int num1,int num2) {
		return num1-num2;
	}

	public int multiplyNumbers(int num1,int num2) {
		return num1*num2;
	}

	public int divideNumbers(int num1,int num2) {
		return num1*num2;
	}

}
