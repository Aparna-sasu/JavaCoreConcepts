package basics;

public class HighestNum {

	public static void main(String[] args) {

		int x = 200;
		int y= 600;
		int z = 900;
		int w = 500;

		if(x>y && x>z && x>w) {
			System.out.println("x is highest.");
		}
		else if(y>z && y>w) {
			System.out.println("y is highest.");

		}
		else if(z>w) {
			System.out.println("z is highest.");

		}
		else {
			System.out.println("w is highest.");
		}
	}

}
