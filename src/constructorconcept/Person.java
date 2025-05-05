package constructorconcept;

public class Person {
	//	Create a Java class named "Person" with the following instance variables:
	//		name (String)
	//		age (int)
	//		gender (char)
	//		height (double)

	//		Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
	//		Create a main method that creates two instances of the Person class using the constructor and prints out their information.


	String name;
	int age;
	char gender;
	double height;

	public Person(String name,int age,char gender,double height) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;

	}

	public static void main(String[] args) {


		Person person1 = new Person("Nitesh", 35,'M', 5.9);
		Person person2 = new Person("Pooja", 40,'F', 5.6);

		System.out.println("Details of person1 : " + person1.name + " " + person1.age + " " + person1.gender + " " + person1.height);
		System.out.println("Details of person2 : " + person2.name + " " + person2.age + " " + person2.gender + " " + person2.height);

	}

}
