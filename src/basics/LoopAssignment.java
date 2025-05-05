package basics;

import java.util.Arrays;

public class LoopAssignment {

	public static void main(String[] args) {

	//1. WAP to print following output:
	//		I am Batman﻿
	//		I am Batman﻿
	//		I am Batman﻿
	//		I am Batman
	//		I am Batman


	int i = 1;
   
	while(i<=5) {

		System.out.println("I am Batman");
		i++;
	}


	System.out.println("-------------------------------------------");


	//		2. WAP to print following output:
	//			I am Batman 1
	//			I am Batman 2
	//			I am Batman 3
	//			I am Batman 4
	//			I am Batman 5
	//			I am Batman 6
	//			I am Batman 7
	//			I am Batman 8
	//			I am Batman 9


	int j = 1;
	
	while(j<=9) {
		
		System.out.println("I am Batman "+ j);
		j++;
	}

	System.out.println("-------------------------------------------");


	System.out.println("using for loop");

	//3. WAP to print 10 to 1 using for, while and do-while loop


	// using for loop

	for(int k = 10;k>0;k--) {

		System.out.println(k);
	}


	System.out.println("using while loop");



	int n = 10;

	while(n>=1) {
		System.out.println(n);
		n--;

	}

	System.out.println("using do while loop");


	int m = 10;
	do {
		System.out.println(m);
		m--;
	}
	while(m>=1);



	System.out.println("-------------------------------------------");


	//4. Write a program in Java to print "Hello World" ten times using while loop


	String st = "Hello World";
	int p = 1;

	while(p<=10) {
		System.out.println(st);
		p++;
	}


	System.out.println("-------------------------------------------");


	//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop


	System.out.println("using while loop");


	int num = 1;

	while(num<=100) {
		System.out.println(num + " * 5" + " = "+ num * 5);
		num++;
	}


	System.out.println("----------------------------");

	System.out.println("using for loop");



	for(int l = 1;l<=100;l++) {

		System.out.println(l + " * 5" + " = "+ l * 5);

	}


	System.out.println("----------------------------");

	System.out.println("using do while loop");


	int d = 1;

	do {
		
		System.out.println(d + " * 5" + " = "+ d * 5);
		d++;


	}while(d<=100);


	System.out.println("-------------------------------------------");


	//6. Print all odd and even numbers between 1 to 100



	for(int t = 1;t<=100;t++) {
		if(t%2 == 0) {
			System.out.println("The number "+ t + " is even number.");

		}
		else {
			System.out.println("The number "+ t + " is odd number.");

		}

	}


	//		7. What will be the output of this program:
	//
	//			int i1 = 1;
	//
	//			while(i1<=1){
	//
	//			System.out.println("Hi Java");
	//
	//			}
	// Answer: Will result in infinite loop since i1 is not incremented.



	//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.

	char ch = 'A';

	while(ch <='Z') {

		System.out.println("ASCII value of " + ch + " = " + (int)ch);

		ch++;
	}

	System.out.println("-------------------------");

	char smallCh = 'a'; 

	while(smallCh <='z') {

		System.out.println("ASCII value of " + smallCh + " = " + (int)smallCh);

		smallCh++;
	}

	System.out.println("-------------------------");

	char digits = '0';

	while(digits<='9') {

		System.out.println("ASCII value of " + digits + " = " + (int)digits);
		digits++;

	}


	System.out.println("-------------------------");


	for(char chs = 'a'; chs<='z';chs++) {

		System.out.println("ASCII value of " + chs + " = " + (int)chs);

	}


	System.out.println("-------------------------");


	for(char cs = 'A'; cs<='Z';cs++) {

		System.out.println("ASCII value of " + cs + " = " + (int)cs);

	}

	System.out.println("-------------------------");



	for(char ds = '0';ds<='9'; ds++) {

		System.out.println("ASCII value of " + ds + " = " + (int)ds);
	}



	System.out.println("-------------------------------------------");


	//9. Print the following series: 
	//	1.0 2.0 3.0  ...... 10.0  
	//	 0 9 18 27 36 …99

	for(double x = 1.0;x<=10.0;x++) {
		System.out.println(x);
	}

	System.out.println("----------------------");

	for(int y = 0;y<=11;y++) 
	{
		System.out.println(y*9);
	}


	System.out.println("-------------------------------------------");


	//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.


	System.out.println("using for loop");

	for(char v = 'a';v<='z';v++) {
		
		if(v =='a'|| v=='e'||v=='i'||v=='o'||v=='u') {

			System.out.println(v);
			}

	}
	System.out.println("----------------------");

	System.out.println("using while loop");

	char value= 'a';

	while(value<='z') {

		if(value =='a'|| value=='e'||value=='i'||value=='o'||value=='u') {

			System.out.println(value);

		}
		value++;
	}


	System.out.println("-------------------------------------------");


	//11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".



	for(int nums = 1;nums<=10;nums++) {
		
		

		if(nums%7==0) {
			
			System.out.println("bye, see you tomorrow");
				break;

			}
		System.out.println(nums);
		}

	}

}


