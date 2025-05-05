package basics;

public class IncrementDecrementOperatorsAssignment {

	public static void main(String[] args) {

		//1. What will be the output of the following program?
		// Output is : 24

		int i = 11;

		i = i++ + ++i;

		System.out.println(i);

		//2. Guess the output of the following program?
		// Output is : a: 13 , b: 24 , c:103

		int a=11, b=22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);



		//3. What will be the output of the below program?
		// Output is : j= 0 

		int j=0;

		j = j++ - --j + ++j - j--;

		System.out.println(j);


		//4.Is the below program written correctly?
		//Ans: Nope. You cannot increment or decrement a boolean value.

				//boolean b = true;
		
				//b++;
		
				//System.out.println(b);


		//5. What will be the output of the below program?


		int i1=1, j1=2, k=3;

		int m = i1-- - j1-- - k--; //(1 - 2 - 3 = -4)

		System.out.println("i="+i1); // 0

		System.out.println("j="+j1); // 1

		System.out.println("k="+k); // 2

		System.out.println("m="+m); // -4


		//6. What will be the output of the following program?

		int x=1, y=2;

		System.out.println(--y - ++x + ++y - --x); // 0


		//7. What will be the value of i, j and k in the below program?


		int q=19, r=29, s = 9;

		int mt = q-- - r-- - s--; // ( 19 - 29 - 9 =  -19)



		System.out.println("i="+q); // 18

		System.out.println("j="+r); // 28

		System.out.println("k="+s); // 8


		//8. What is wrong with the below program? Why it is showing a compilation error?
		//Ans: Because the compiler is confused  what to increment or decrement.
		//Java, will not allow a number cannot be incremented or decremented.

		//		int w = 11;
		//
		//		int o = --(w++);  


		//9. Guess the value of p in the below program?

		int ms = 0, n = 0;

		int p = --ms * --n * n-- * ms--; // (-1 * -1 * -1 * -1)

		System.out.println(ms); // -2
		System.out.println(n);  // -2
		System.out.println(p);  // 1
		
		
		//10. What will be the output of the following program?
		
		int ab=1;
		ab = ab++ + ++ab * --ab - ab--;  //(1 + 3 * 2 - 2 )
        System.out.println(ab); // 5
        
        
        //11.  What will be the outcome of the below program?
        //Ans: Java will not allow a number to be incremented or decremented.
        
//        int rt = 11++;
//        System.out.println(rt);
        
        
        //12. What will be the outcome of the below program?
        
        int ch = 'A';//65

        System.out.println(ch++);// 65
        System.out.println(ch);
        
        
        //13. What will be the outcome of the below program?
        
        char chs = 'A'; // 65

        

        System.out.println(++chs); // B because chs is of char type.
        
        
        
       //14.  What will be the outcome of the below program?
        
       double d = 1.5, D = 2.5;

       System.out.println(d++ + ++D); //(1.5 + 3.5 = 5.0)

	}

}
