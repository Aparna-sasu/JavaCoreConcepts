package methodsassignments;

import java.util.Scanner;

// 4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

public class MinMaxNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a = sc.nextInt();

		System.out.println("Enter num2: ");
		int b = sc.nextInt();

		System.out.println("Enter num3: ");
		int c = sc.nextInt();

		MinMaxNumbers minmax = new MinMaxNumbers();
		minmax.maxNum(a,b,c);
		minmax.minNum(a,b,c);

		sc.close();
	}


	public void maxNum(int num1,int num2,int num3) {


		if(num1>num2 && num1>num3) {
			System.out.println("Maximum among three numbers is: "+ num1);
		}

		else if(num2>num3) {
			System.out.println("Maximum among three numbers is: "+ num2);

		}

		else {
			System.out.println("Maximum among three numbers is: "+ num3);
		}
	}


	public void minNum(int num1,int num2,int num3) {

		if(num1<num2 && num1<num3) {
			System.out.println("Minimum among three numbers is: "+ num1);
		}

		else if(num2<num3) {
			System.out.println("Minimum among three numbers is: "+ num2);

		}

		else {
			System.out.println("Minimum among three numbers is: "+ num3);
		}
	}
}
