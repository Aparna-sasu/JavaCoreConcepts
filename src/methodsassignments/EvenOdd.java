package methodsassignments;

import java.util.Scanner;

//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.

public class EvenOdd {

	int num;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");

		EvenOdd eo =   new EvenOdd();
		eo.num = sc.nextInt();

		boolean result = eo.checkEvenOdd(eo.num);
		if(result) {
			System.out.println("Number "+ eo.num +" is even");
		}

		else {

			System.out.println("Number "+ eo.num +" is odd");
		}

		sc.close();

	}


	public boolean checkEvenOdd(int n) {

		if(n%2==0) {
			return true;
		}

		return false;
	}
}
