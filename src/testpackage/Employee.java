package testpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee {

	//String name;
	
	public static void main(String[] args) {

		
		
		List<EmployeeData> person = new ArrayList<EmployeeData>();
		EmployeeData emp1 = new EmployeeData();
	    emp1.setName("tom");
		emp1.setSalary(20043);
		emp1.getName();
		emp1.getSalary();
		
		EmployeeData emp2 = new EmployeeData();
		emp2.setName("ramu");
		emp2.setSalary(300);
		
		emp2.getName();
		emp2.getSalary();
		
		person.add(emp1);
		person.add(emp2);
		
		for(EmployeeData e : person) {
			//System.out.println(e);
			System.out.println(e.getName()+  "  " + "  "+ e.getSalary());
		}
		
	}


}
