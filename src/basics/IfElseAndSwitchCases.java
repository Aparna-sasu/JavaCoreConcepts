package basics;

public class IfElseAndSwitchCases {

	public static void main(String[] args) {
		//	1. Find out the greatest number out of four different given numbers:
		//     Inputs: 25 , 78 , 87 , 97 

		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;

		if(a>b && a>c && a>d) {
			System.out.println("Input a = "+ a + " is the greatest of all numbers.");
		}
		else if(b>c && b>d) {
			System.out.println("Input b = "+ b + " is the greatest of all numbers.");
		}
		else if(c>d) {
			System.out.println("Input c = "+ c + " is the greatest of all numbers.");
		}
		else {
			System.out.println("Input d = "+ d + " is the greatest of all numbers.");
		}

		System.out.println("------------------------------------------------------------------------------------------");


		//2. Write a Java program to test a number is positive or negative.
		// Test Data: 
		//Input number: 35 -- positive number
		// Input number: -11 -- negative number

		int x = 35;
		int y = -11;

		if(x>0 && y>0) {
			System.out.println("x = " + x + " is positive number");
			System.out.println("y = " + y + " is positive number");

		}
		else if(x>0 && y<0) {
			System.out.println("x = " + x + " is positive number");
			System.out.println("y = " + y + " is negative number");

		}
		else if(x<0 && y>0) {
			System.out.println("x = " + x + " is negative number");
			System.out.println("y = " + y + " is positive number");

		}
		else {
			System.out.println("x = " + x + " is negative number");
			System.out.println("y = " + y + " is negative number");
		}

		System.out.println("------------------------------------------------------------------------------------------");


		//3. WAP to check number is odd or even using If - Else


		int z = 100;

		if(z%2 == 0) {
			System.out.println("The number "+ z + " is even number.");
		}
		else {
			System.out.println("The number "+ z + " is odd number.");
		}


		System.out.println("------------------------------------------------------------------------------------------");

		//		4. WAP to check given alphabet character is Vowel or Consonant using Switch - Case

		char ct = 'D';
		String ch = String.valueOf(ct).trim().toLowerCase();

		switch(ch){

		case "a","e","i","o","u": 
			System.out.println("The character " + ch + " is a vowel.");
		break;
		default:
			System.out.println("The character " + ch + " is a consonant.");
			break;

		}

		System.out.println("------------------------------------------------------------------------------------------");

		//		5. WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case

		String envmnt = "PROD";

		switch(envmnt.trim().toLowerCase()) {

		case "qa":
			System.out.println("Test Cases run in QA Environment");
			break;
		case "stage":
			System.out.println("Test Cases run in Stage Environment");
			break;
		case "dev":
			System.out.println("Test Cases run in Dev Environment");
			break;
		case "uat":
			System.out.println("Test Cases run in UAT Environment");
			break;
		case "prod":
			System.out.println("Test Cases run in PROD Environment");
			break;
		default:
			System.out.println("Please provide valid environment.");
			break;


		}

		System.out.println("------------------------------------------------------------------------------------------");


		//	6. WAP to book the specific type of car from the Uber app using Switch - Case.
		// Car Type: Mini, Sedan, SUV, Premium
		//	If user passes wrong car type, print please select the right car type	

		String carType = "SUV";

		switch(carType.trim().toLowerCase()) {

		case "mini":
			System.out.println(" Mini is selected.");
			break;
		case "sedan":
			System.out.println(" Sedan is selected.");
			break;
		case "suv":
			System.out.println(" SUV is selected.");
			break;
		case "premium":
			System.out.println(" Premium is selected.");
			break;
		default:
			System.out.println("Please select right car type.");
			break;


		}

		System.out.println("------------------------------------------------------------------------------------------");  

		// 7. WAP to launch browsers using If-ElseIf and Switch Case.
		//	Browser: Chrome/Firefox/IE/Safari
		//	If user passes wrong browser, print please pass the right browser name


		//Using  if Else if

		String browser = "Chrome";

		if(browser.equalsIgnoreCase("Chrome")){

			System.out.println("Chrome browser is launched.");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {

			System.out.println("Firefox browser is launched.");
		}
		else if(browser.equalsIgnoreCase("IE")) {

			System.out.println("IE browser is launched.");

		}
		else {
			System.out.println("Safari browser is launched.");
		}


		// Using Switch Case


		switch(browser.trim().toLowerCase()) {

		case "chrome":
			System.out.println(" Chrome browser is launched.");
			break;
		case "firefox":
			System.out.println("Firefox browser is launched.");
			break;
		case "ie":
			System.out.println("IE browser is launched.");
			break;
		case "safari":
			System.out.println("Safari browser is launched.");
			break;
		default:
			System.out.println("Please pass the right browser name");
			break;

		}


		System.out.println("-----------------------------------------------------------------------------------------");


		// 8. WAP to define the interest rate on the basis of Loan type using Switch Case
		// Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		// For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan


		String loanType = "Housing Loan";
		int salary = 3000;
		double interestRate = 0.0;


		switch(loanType.trim().toLowerCase()) {

		case "car loan":
			interestRate  = 4.5;
			break;
		case "housing loan":

			if(salary<35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
				break;
			}
			interestRate = 10.5;
			break;
		case "personal loan":
			interestRate = 7.8;
			break;

		case "education loan":
			interestRate = 5.5;
			break;

		default:
			System.out.println("Please provide valid input.");

		}

		System.out.println("Interest Rate for " + loanType + "  is "+ interestRate + "%");

	}

}
