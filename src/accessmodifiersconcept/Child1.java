package accessmodifiersconcept;

public class Child1 {

	public static void main(String [] args) {
		
		Parent parent = new Parent();
		parent.start();
		//parent.stop();
		parent.refuel();
		parent.billing();
		
		
	}
	
	
//	@Override
//	public void start() {
//		System.out.println("Parent(public) ----start");
//		}
//	
//	
//	@Override
//	  protected void billing() {
//	    	System.out.println("Parent(protected) ---- billing");
//	    }
//	  
//	  void refuel(){
//	    	System.out.println("Parent(default) ---- refuel");
//	    }
//	  
//	  
//	  private void stop() {
//			System.out.println("Parent(private) ----stop");
//		}
}
