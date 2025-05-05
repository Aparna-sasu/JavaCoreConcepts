package pack1;

public class Player {
	
	String name;
	private int salary;
	

	public static void main(String[] args) {
		
		Player p = new Player();
		
		p.name = "Tom";
		p.salary = 1000;
		
		
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	
}
