package methodsassignments;

import java.util.Scanner;

// 6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to﻿ vote. - return true/false

public class VoteEligibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");

		int age = sc.nextInt();

		VoteEligibility vg = new VoteEligibility();
		boolean res = vg.checkEligibility(age);

		if (res) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}

	}

	
	public boolean checkEligibility(int age) {

		if (age >= 18) {
			return true;
		}

		return false;
	}
}
