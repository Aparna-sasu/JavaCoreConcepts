package testpackage;

public class EmployeeData {
	
	String name;
	int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		
		if(salary<2000) {
			//System.out.println("salary: " + salary);
		return 0;
		
		}
		else {
			
			return salary;
		}
		
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
