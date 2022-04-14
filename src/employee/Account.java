package employee;

public class Account {

	private int account_number;
	public int routing_number;
	private double initial_amount;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int account_number, int routing_number, double initial_amount, double balance) {
		
		this.account_number = account_number;
		this.routing_number = routing_number;
		this.initial_amount = initial_amount;
		this.balance = balance;
		
		this.balance += this.initial_amount;
	}
      //get method
      protected double getBalance() {
    	  return this.balance;
      }
      //void method
      protected void deposit(double amount) {
    	this.balance=  this.balance +amount;
     }
      
      //void method
      protected void withdraw(double amount) {
    	  this.balance = this.balance - amount;
      }
      
      
     // protected int getAccountNumber() {
    	  //return this.account_number;
      //}
      
      
}


