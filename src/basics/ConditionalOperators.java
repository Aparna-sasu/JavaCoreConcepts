package basics;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox");
		}
		else {
			System.out.println("invalid");
		}

	}

}
