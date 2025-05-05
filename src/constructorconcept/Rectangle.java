package constructorconcept;

//Create a Java class named "Rectangle" with the following instance variables:

//length (double)
//width (double)

//Create a default constructor for the Rectangle class that sets both the length and width to 0.0.

//Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.

//Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).

//Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.


public class Rectangle {

	double length;
	double width;


	public Rectangle() {


	}

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}



	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		System.out.println("Length and width set by default: " + rect1.length +" "+ rect1.width);
		double area1 = rect1.length*rect1.width;
		
		System.out.println("Area of the rectangle using default constructor : " +  area1);

		Rectangle rect2 = new Rectangle(20.4,35.8);
		System.out.println("Length and width set by parameterized : "+ rect2.length +" "+ rect2.width);
		
		double area2 = rect2.length*rect2.width;
		System.out.println("Area of the rectangle using parameterized constructor : " +  area2);


		Rectangle rect3 = new Rectangle();
		double area3 = rect3.calculateArea(30.5,10.6);
		System.out.println("Area of the rectangle : "+ area3);


	}

	public double calculateArea(double length, double width) {

		return length*width;

	}

}
