package employee;

public class Authorized_Account extends Account {
	
	private Account main_account;
	
	public Authorized_Account() {
		
	}
	
	public Authorized_Account(Account main_account) {
		this.main_account = main_account;
	}
	
	public void deposit(double amount) {
		main_account.deposit(amount - 5);
	}
	
	
	public void withdraw(double amount) {
		main_account.withdraw(amount-5);
		
	}

}
