package Learn;

import java.util.Scanner;

public class bank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter deposit the amount:");
		System.out.println("enter the withdraw amount:");
		
		double deposit = sc.nextInt();
		double withdraw = sc.nextInt();
		
		double total =100 ;
		
		if (deposit>= 0 && deposit <=0) {
			total = 100 + deposit;
		}
		else if
			(withdraw>=0){
			total =  - withdraw;
		}
		System.out.println("amount is:"+total);
	}
	

}
