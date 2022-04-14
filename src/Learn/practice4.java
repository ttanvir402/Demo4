package Learn;

import java.util.Scanner;

public class practice4 {

	public static void main(String[]args) {
		
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the days:");
		int amount= sc.nextInt();
		
		/*int seconds = days*86400;
		
		System.out.println(seconds);*/
		
		
		
		for(int i=0;i<3;i++){
		     int payment = (amount*10) /100;
		     if((amount%10)!=0){
		         amount =amount-1;
		     }
		     amount = amount- payment ;
		    
		     }
		     System .out .print(amount);

		
				
		
		
		
	}
}
