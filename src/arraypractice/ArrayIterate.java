package arraypractice;

import java.util.Arrays;

public class ArrayIterate {

	public static void main(String[] args) {
		
     int[] price = new int[4];
     
     price[0]=100;
     price[1]=200;
     price[2]=300;
     price[3]=400;
     
//     for(int i: price) {
//    	 System.out.println(i);
//     }

     
     char space = ' ';
    //System.out.println((int)space);
     
     char s[] = new char[3];
     s[0]= 'a';
     s[2]= 'w';
     
     System.out.println(Arrays.toString(s));
     System.out.println((int)s[1]);
     
    for(int i=0;i<=s.length-1;i++) {
    	
    	System.out.println((int)s[i]);
    	
    }
	}

}
