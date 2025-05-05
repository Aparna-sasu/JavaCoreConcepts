package testpackage;

abstract class Car {

	String msg;
	
//	public Car(String msg) {
//		this.msg = msg;
//		
//		
//		
//	}
	public void start(String s) {
		
		System.out.println("I am in Car class" + s);
	}
	
	abstract public void stop(); 
		
	

}
