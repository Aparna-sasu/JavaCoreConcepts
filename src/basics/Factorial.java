package basics;

public class Factorial {

	public static void main(String[] args) {
		int f = 4;
		
	int res = factNum(f);
		System.out.println(res);
		System.out.println(String.class.getClassLoader());
	}
	

	public static int factNum(int f) {
		
		if(f<=1) {
			return 1;
		}
		
         
		return f*factNum(f-1);
		 
	}
	

}
