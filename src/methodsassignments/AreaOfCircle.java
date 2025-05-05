package methodsassignments;

import java.util.Scanner;

//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
// Area of circle = pi * r * r
// circumference of circle = 2*pi*r


public class AreaOfCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		int radius = sc.nextInt();

		AreaOfCircle ac = new AreaOfCircle();
		ac.areaOfCircle(radius);
		ac.circumferenceOfCircle(radius);

		sc.close();

	}

	public void areaOfCircle(int r) {

		System.out.println("Area of circle is : " + Math.PI*r*r);
	}

	
	public void circumferenceOfCircle(int r) {


		System.out.println("circumference of circle is : " + 2*Math.PI*r);
	}
}
