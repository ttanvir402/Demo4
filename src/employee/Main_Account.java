package employee;

public class Main_Account {
	

		public static void main(String[] args) {

			                          
			Account Acc = new Account(12345, 54321, 1000, 0);
			
			System.out.println("Balance after opening acccount is: " + Acc.getBalance());

			Acc.deposit(500);

			System.out.println("Balance after depositing 500 dollars: " + Acc.getBalance());

			Acc.withdraw(200);

			System.out.println("Balance after withdrawing 200 dollars: " + Acc.getBalance());
			

			Authorized_Account authorized = new Authorized_Account(Acc);

			authorized.deposit(500);

			System.out.println("Balance after depositing 200 dollars using authorized account: " + Acc.getBalance());


			authorized.withdraw(100);

	
		System.out.println("Balance after withdrawing 100 dollars using authorized account: " + Acc.getBalance());

}
}
