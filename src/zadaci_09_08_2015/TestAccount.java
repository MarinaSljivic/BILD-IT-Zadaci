package zadaci_09_08_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

/*(The Account class) Design a class named Account that contains:
 - A private int data field named id for the account (default 0).
 - A private double data field named balance for the account (default 0).
 - A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume all accounts have the same interest rate.
 - A private Date data field named dateCreated that stores the date when the
account was created.
 - A no-arg constructor that creates a default account.
 - A constructor that creates an account with the specified id and initial balance.
 - The accessor and mutator methods for id, balance, and annualInterestRate.
 - The accessor method for dateCreated.
 - A method named getMonthlyInterestRate() that returns the monthly
interest rate.
 - A method named getMonthlyInterest() that returns the monthly interest.
 - A method named withdraw that withdraws a specified amount from the
account.
 - A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g., like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created. */



/**
 * @author Marina Sljivic
 *
 */
public class TestAccount {

	public static void main(String[] args) {
		//creates an Account object with an account ID of 1122, a balance of 20000
		//and an annual interest rate of 4.5%
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500); //withdraw $2500
		account.deposit(3000); //deposit $3,000
		
		//print the balance, the monthly interest, and the date when this account was created
		System.out.println("Balance: "+account.getBalance()
				+"\nMonthly Interest: "+account.getMonthlyInterest()+" "
				+"\nThe account was created on: "
				+new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(account.getDateCreated()));
				//using a format "Day/Month/Year hours:minutes:seconds" for the Date
	}
}

/**
 * @author Marina Sljivic
 *
 */
class Account{
	//data fields
	private int id;//id for the account (default 0).
	private double balance;//balance for the account (default 0).
	private double annualInterestRate;//stores the current interest rate (default 0). Assume all accounts have the same interest rate.
	private Date dateCreated;//stores the date when the account was created
	
	 /**
	 * The no-arg constructor that creates a default account.
	 */
	Account(){
		//id, balance and annualInterestRate are set to 0, the dateCreated is set to the current date and time
		 setId(0);
		 setBalance(0);
		 setAnnualInterestRate(0);
		 this.dateCreated = new Date(System.currentTimeMillis());
	 }
	
	/**
	 * The constructor that creates an account with the specified id and initial balance.
	 * @param id int
	 * @param balance double
	 */
	Account(int id, double balance){
		//sets the default values and than the specified values of the id and balance
		setId(id);
		setBalance(balance);		 
		setAnnualInterestRate(0);
		this.dateCreated = new Date(System.currentTimeMillis());
	 }
	 
	//the accessors and mutators for id, balance and annualInterestRate
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//the accessor fot dateCreated 
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * @return the monthly interest rate.
	 */
	double getMonthlyInterestRate(){
		//monthlyInterestRate is annualInterestRate/12, annualInterestRate is a percentage,
		//so we need to divide it by 100
		return getAnnualInterestRate()/(100*12);
	}
	 
	 /**
	 * @return the monthly interest.
	 */
	double getMonthlyInterest(){
		//Monthly interest is the absolute value of the balance * monthlyInterestRate
		return Math.abs(getBalance()) * getMonthlyInterestRate(); 
	 }
	
	/**
	 * This method withdraws a specified amount from the account.
	 * @param amount double
	 */
	void withdraw(double amount){
		//subtract to the current balance the amount
		setBalance(getBalance() - amount);
		
		//alert the user that his bank account is in the red if the balance lower than 0
		if(getBalance()<0){
			System.out.println("Your bank account is in the red.");
		}
	}
	
	/**
	 * This method deposits a specified amount to the account.
	 * @param amount double
	 */
	void deposit(double amount){
		//add to the current balance the amount
		 setBalance(getBalance() + amount);
	 }
	
}