package basics;

public class FunctionConcept {
	
	public boolean browserName(String name) {
		System.out.println("Checking for chrome browser...");
		switch(name) {
		
		case "chrome":
			System.out.println("chrome browser launched");
			return true;
			
		case "safari":
			System.out.println("safari launched");
			return true;
			
			default:
				System.out.println("safari launched");
				return false;
				
		}
		
	}

	public static void main(String[] args) {
	FunctionConcept fc = new FunctionConcept();
	boolean res = fc.browserName("ie");
	System.out.println(res);

	}

}
