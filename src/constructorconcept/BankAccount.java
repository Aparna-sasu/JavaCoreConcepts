package constructorconcept;

//Create a Java class named "BankAccount" with the following instance variables:

//accountNumber (String)
//balance (double)

//Create a constructor for the BankAccount class that takes in the accountNumber and balance as parameters and initializes the instance variables.

//Create a method in the BankAccount class named "deposit" that takes in a double value as a parameter and adds it to the balance instance variable.

//Create a method in the BankAccount class named "withdraw" that takes in a double value as a parameter and subtracts it from the balance instance variable.

//Create a main method that creates an instance of the BankAccount class using the constructor and performs multiple deposits 
//and withdrawals using the deposit and withdraw methods. Print out the updated balance after each transaction.

public class BankAccount {

	String accountNumber;
	double balance;

	public BankAccount(String accountNumber,double balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;

	}



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



	public static void main(String[] args) {

		BankAccount bankacc = new BankAccount("1234567", 100.00);
		System.out.println("Bank Account set by constructor: " + bankacc.accountNumber + " "+ bankacc.balance);

		double deposit_Amount = bankacc.deposit(0);
		bankacc.setBalance(deposit_Amount);
		System.out.println("Bank balance after first deposit: " + bankacc.accountNumber + " "+ bankacc.getBalance());

		double deposit1_Amount = bankacc.deposit(800.00);
		bankacc.setBalance(deposit1_Amount);
		System.out.println("Bank balance after second deposit: " + bankacc.accountNumber + " "+ bankacc.getBalance());

		double withdraw_Amount = bankacc.withdraw(200);
		bankacc.setBalance(withdraw_Amount);
		System.out.println("Bank balance after first withdraw: " + bankacc.accountNumber + " "+ bankacc.getBalance());

		double withdraw1_Amount = bankacc.withdraw(0);
		bankacc.setBalance(withdraw1_Amount);
		System.out.println("Bank balance after first withdraw: " + bankacc.accountNumber + " "+ bankacc.getBalance());





	}



	public double deposit(double addAmount) {

		double amount = 0.0;

		if(addAmount==0) {

			System.out.println("Provide valid amount.");

			return amount+balance;
		}



		return addAmount+balance;

	}

	public double withdraw(double takeAmount) {

		double amount = 0.0;

		if(takeAmount==0) {

			System.out.println("Provide valid amount.");

			return amount+balance;
		}



		return balance - takeAmount;

	}

}
