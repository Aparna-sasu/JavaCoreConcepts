package methodsassignments;

import java.util.Scanner;

public class DoubleNumberMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1 : ");
		double a = sc.nextDouble();

		System.out.println("Enter num2 : ");
		double b = sc.nextDouble();

		DoubleNumberMultiplication dc = new DoubleNumberMultiplication();

		double res = dc.multiplyNums(a, b);

		System.out.println("Multiplication of "+ a +" and "+ b +" :  " + res);
		sc.close();


	}


	public double multiplyNums(double num1, double num2) {
		return num1*num2;
	}

}
