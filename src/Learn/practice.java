package Learn;

import java.util.Scanner;

public class practice {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the first number:");
		int num1 = sc.nextInt();
		
		System.out.println("enter the second number:");
		int num2 = sc.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		
		
		
	}
}
