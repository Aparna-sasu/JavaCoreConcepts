package accessmodifiersconcept;

public class Parent {

	public static void main(String[] args) {
		System.out.println("Parent -- public");
	
	Parent parent = new Parent();
	parent.start();
	parent.stop();
	parent.refuel();
	parent.billing();
	
}
	
	
	
	
	public void start() {
		System.out.println("Parent(public) ----start");
		}
	private void stop() {
		System.out.println("Parent(private) ----stop");
	}
	
    void refuel(){
    	System.out.println("Parent(default) ---- refuel");
    }
    
    protected void billing() {
    	System.out.println("Parent(protected) ---- billing");
    }
}
