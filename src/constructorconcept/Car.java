package constructorconcept;

//Create a Java class named "Car" with the following instance variables:

//make (String)
//model (String)
//year (int)

//Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
//Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
//Create a main method that creates three instances of the Car class using both constructors and prints out their information.

public class Car {
	
	
	
	String make;
	String model;
	int year;
	
	public Car(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		this.make = "Unkown";
		this.model = "Unkown";
		this.year = 0;
		
	}

	public static void main(String[] args) {
		
		Car param_car = new Car("Tesla", "Y", 2020);
		System.out.println(param_car.make + " " + param_car.model+ " " + param_car.year );
		
		Car defa_c = new Car();
		System.out.println(defa_c.make + " " + defa_c.model+ " " + defa_c.year);
		

	}

}
