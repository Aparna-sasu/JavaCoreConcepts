package StringReversal;

import java.util.Scanner;

public class ReversalOfString {

	public static String doReverse(String str) {

		String rev ="";

		//null check
		if(str.isEmpty()) {
			throw new NullCheckException("Please provide valid String");
		}

		//char check
		if(str.length()==1) {
			return str;
		}


		//valid string to be reversed

		if(!str.isEmpty()) {

			String[] splitString = new String[str.length()];

			splitString = str.split(" ");

			for(int i=0;i<splitString.length;i++) {

				System.out.println(splitString[i]);
				String sd = splitString[i];
				rev = stringReversalLogic(rev, sd);

				if(i<splitString.length-1) {
					rev=rev+" ";
				}

			}

		}

		return rev;
	}





	private static String stringReversalLogic(String rev, String sd) {

		for(int j=sd.length()-1;j>=0;j--) {
			rev = rev+sd.charAt(j);
		}
		return rev;
	}



	public static void main(String[] args) {
		String str = "";


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");

		try {

			str = sc.nextLine();

		}
		catch(NullCheckException e){

			e.printStackTrace();
			System.exit(-1);

		}



		String result = ReversalOfString.doReverse(str);

		System.out.println(result);

		sc.close();
	}


}
