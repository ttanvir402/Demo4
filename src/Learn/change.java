package Learn;

import java.util.Scanner;

public class change {
	
	public static void main(String[]args) {
		
		double amount;
		int quarter;
		int dime;
		int nickle;
		int penny;
		
		System.out.print("Enter the amount in $: ");
		
		Scanner sc = new Scanner(System.in);
		amount = sc.nextDouble() * 100;
		
		quarter = (int)amount / 25;
		amount = amount % 25;
		
		dime = (int)amount / 10;
		amount = amount % 10;
		
		nickle = (int)amount / 5;
		amount = amount % 5;
		
		penny = (int)amount;
		
		System.out.println("Quarter: " + quarter);
		System.out.println("Dime: " + dime);
		System.out.println("Nickle: " + nickle);
		System.out.println("Penny: " + penny);
	}
}
