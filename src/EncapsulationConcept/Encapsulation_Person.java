package EncapsulationConcept;

//Instructions:

//Create a class called "Person" with the following private attributes: name (String), age (int), and gender (String).
//Create getter and setter methods for each attribute.
//Write a method called "printInfo" that prints out the name, age, and gender of the person.
//Create an instance of the "Person" class and set its attributes using the setter methods.
//Call the "printInfo" method to verify that the data was set correctly.

public class Encapsulation_Person {
	
String name;
int age;
String gender;


	
	
	
	public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public int getAge() {
	return age;
}





public void setAge(int age) {
	this.age = age;
}





public String getGender() {
	return gender;
}





public void setGender(String gender) {
	this.gender = gender;
}





	public static void main(String[] args) {
		
		Encapsulation_Person person = new Encapsulation_Person();
	
		person.setName("Nitesh");
		person.setAge(38);
		person.setGender("Male");
		
		person.printInfo();
		
	//System.out.println(person.getAge());
	}
	
	
	public void printInfo( ) {
		
		
		System.out.println(getName()+" "+ getAge() +" "+ getGender());
		
	}

}
