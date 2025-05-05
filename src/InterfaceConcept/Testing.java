package InterfaceConcept;

public class Testing {
	
	public Testing() {
		super();
		System.out.println("super() method executed");
	}
	public static void main(String [] args) {
		
		Testing t = new Testing();
		
		
		IIMA ima = new IIMA();
		ima.BBA();
		ima.EMBA();
		ima.MBA();
		ima.MSc();

		
		USEducationSystem us = new IIMA();
		us.EMBA();
		us.MSc();
		us.PhD();
	}
	

}
