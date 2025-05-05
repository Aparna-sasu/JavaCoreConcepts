package EncapsulationConcept;

public class Employee {
	
	String name;
	int age;
	private int salary;
	
	

	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		
		if(salary<2000) {this.salary = salary;}
		
		
	}



	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Tom";
		e.age = 29;
		e.salary = 30000;
		
		System.out.println(e.name +' '+e.age +' '+ ' '+e.salary);

	}

}
