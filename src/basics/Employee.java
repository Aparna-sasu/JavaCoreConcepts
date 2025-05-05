package basics;

public class Employee {
	String name;
	static String companyName="bkj";

	public static void main(String[] args) {
		
		//System.out.println(companyName);
		Employee e = new Employee();
		e.test();
		e.name = "cds";
		
		
	}

	
	public  void test() {
		System.out.println(Employee.companyName);
		
	}
}
