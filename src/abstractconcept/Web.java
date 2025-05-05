package abstractconcept;

public abstract class Web {
	
	public Web() {
		System.out.println("I am abstract class Web constructor...");
	}
	
	int i = 0;
	
	public final void title() {
		
		System.out.println("this is final method in abstract class...");
	}
	
	
	public int getNum(int n) {
		
	System.out.println("From web");
	return n-10;
	
	}

}
