package basics;

import java.nio.file.spi.FileSystemProvider;

public class LoopCases {

	public static void main(String[] args) {
	
		//1. while loop
		
		int i1=2;
		
		while(i1<=10) {
			System.out.println(i1);
			i1=i1+2;
		}
	//}
	
	//2. for loop
		
	for(char ch = 'A';ch<='Z'; ch++) {
		System.out.println(ch + "= "+ (int)ch);
		
	}
	
	// 3. Nested loop
	// print this:
	//000 001 002 003 004 005

	for(int i=0;i<=9;i++) {
		for(int j=0;j<=9;j++) {
			for(int k=0;k<=9;k++) {

				System.out.print(i+""+j+""+k+" ");

			}
			System.out.println();
		}
		System.out.println();
	}

	System.out.println();


	}

}