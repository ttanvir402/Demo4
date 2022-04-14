package Learn;

import java.util.Scanner;

public class Modular {
	
	 public static void main(String[] args){
		 
		 int number;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter the number:");
		 number=sc.nextInt(); 
		 
		 for(int i = 1; i <= 10; i++) {
			 
			 System.out.println(number + " x " + i + " = " + (number * i));
		 }
	}
}
