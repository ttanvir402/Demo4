package Learn;

import java.util.Scanner;

public class Method {
	
	/*
	  Run a loop to find out the even and odd numbers in 1-1000
	  Store the even numbers in one array and the odd numbers in another one
	*/
	
	public static void main(String[] args) {
	
//		int n[] = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println("odd numbers:");
//		
//		for(int i=0;i<n.length;i++){  
//			if(n[i]%2!=0){  
//			System.out.println(n[i]); 
//			}
//		}
//		System.out.println("Even Numbers:");  
//		for(int i=0;i<n.length;i++){  
//		if(n[i]%2==0){  
//		System.out.println(n[i]);  
//		}  
//		} 
//		
//		int sum = add(5,6);
//		
//		System.out.println(sum);
		
		//What kind of operation you want to do?
		//1)add
		//2)subtract
		//3)Multiplication
		//4)Division
		//5)Square
		
		//Take input from user as an integer --> input = sc.nextInt();
		
		//if(input == 1) --> take two parameters a,b from the user and call add method
		//if(input == 2) --> take two parameters a,b from the user and call subtract method
		//if(input == 3) --> take two parameters a,b from the user and call multiplication method
		//if(input ==4) --> take two parameters a,b from the user and call division method
		//In division method, check if b == 0. If b == 0, then return 0. else return a/b
		//if(input == 5) --> take one parameter a from the user and call the square method.
		
		//In all the cases, print the result found from the methods for the user.
		//i.e.
		//The result is: <result>
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your choice 1)add 2)square: ");
		int input = sc.nextInt();
				
		int result = 0;
		
		if(input == 1) {
			System.out.print("Enter value of a: ");
			int a = sc.nextInt();
			
			System.out.print("Enter value of b: ");
			int b = sc.nextInt();
			
			result = add(a,b);
		}
		
		else if(input == 2) {
			System.out.print("Enter value of a: ");
			int a = sc.nextInt();
			
			result = square(a);
		}
		
		System.out.println(result);
	}
	
	public static int add(int a, int b) {
		
		return a + b;
	}
	
	public static int square(int a) {
		
		return a * a;
	}
}
