package Learn;

import java.util.Scanner;

public class practice2 {
	
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("please enter the first number:");
		int a = sc.nextInt();
		
		System.out.print("please enter the second number:");
		int b = sc.nextInt();
	
	
//public static void swap(int a , int b) {
		
		System.out.println("Before:... a:"+a+",b:"+b);
		
		
		a= a^b;
		b= a^b;
		a= a^b;
		
		System.out.println("after:... a:"+a+",b:"+b);
		
	}

}
