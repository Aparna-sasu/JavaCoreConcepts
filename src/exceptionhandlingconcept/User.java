package exceptionhandlingconcept;

public class User {
	String name;
	int i;


	public void VoterAge(int i) {

		if(i<18) {
			throw new NonEligibleException("Person not eligible to vote");
			
		}
		
		System.out.println("Voter's age is good");
	}

	public static void main(String[] args) {

		System.out.println("inside main method");


		User u = new User();
		try {
		u.VoterAge(8);
		}
		catch(NonEligibleException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("bye!!");


	}

}
