package EncapsulationConcept;


//Objective: The objective of this assignment is to create a class that uses encapsulation to hide its implementation details and provide a simple interface for clients.

//Instructions:

//1. Create a class called "BankAccount" with the following private attributes: accountNumber (String), balance (double), and owner (String).

//2. Create getter and setter methods for each attribute.

//3. Write a method called "deposit" that takes a double parameter and adds it to the balance.

//4. Write a method called "withdraw" that takes a double parameter and subtracts it from the balance.

//5. Write a method called "printStatement" that prints out the account number, owner name, and balance.

//6. Create an instance of the "BankAccount" class and set its attributes using the setter methods.

//7. Call the "deposit" and "withdraw" methods to modify the balance of the account.

//8. Call the "printStatement" method to verify that the data was set correctly.


public class Encapsulation_BankAccount {


	private String accountNumber;
	private double balance;
	private String owner;



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}


	public double deposit(double addAmount) {

		return addAmount+balance;
	}

	public double withdraw(double takeAmount) {

		return balance - takeAmount;


	}

	public void printStatement(String accountNumber , double balance , String owner) {

		System.out.println( getAccountNumber()+ " " + getBalance() + " "+ getOwner());

	}



	public static void main(String[] args) {

		Encapsulation_BankAccount  eb_acc = new Encapsulation_BankAccount();
		eb_acc.setAccountNumber("23800579");
		eb_acc.setBalance(4000);
		eb_acc.setOwner("Pooja");

		System.out.println("Inital Balance: "+ eb_acc.getAccountNumber()+ " " + eb_acc.getBalance() + " "+ eb_acc.getOwner());

		double retBal = eb_acc.deposit(200);
		eb_acc.setBalance(retBal);

		String accNum = eb_acc.getAccountNumber();
		double bal = eb_acc.getBalance();
		String ownerName = eb_acc.getOwner();

		System.out.println("----Deposit----");


		eb_acc.printStatement(accNum, bal , ownerName);


		System.out.println("----Withdraw----");


		double retBal1 = eb_acc.withdraw(300);
		eb_acc.setBalance(retBal1);


		eb_acc.printStatement(accNum, bal , ownerName);


		System.out.println("----Deposit----");


		double retBal2 = eb_acc.deposit(200);
		eb_acc.setBalance(retBal2);

		eb_acc.printStatement(accNum, bal , ownerName);

	}












}
