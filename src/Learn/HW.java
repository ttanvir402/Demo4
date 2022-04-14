package Learn;

import java.util.Scanner;

public class HW {
	
	public static void main(String[] args){
		
		Scanner result = new Scanner(System.in);
		
		System.out.print("enter the score:");
			
		double score = result.nextInt(); //TBD --> To be decided
		
		if(score >= 0 && score < 40) {
			System.out.println("F");			
		} 
		else if (score >=40 && score < 50) {
			System.out.println("B-");	
		}
		else if (score >=50 && score <60) {
			System.out.println("B");	
		}
		else if (score >=60 && score <70) {
			System.out.println("B+");	
		}
		else if (score >=70 && score <80) {
			System.out.println("A-");			
		}
		else if (score >=80 && score <90) {
			System.out.println("A");	
		}
		else if (score >=90 && score <= 100) {
			System.out.println("A+");	
		}
		else {
			System.out.println("error");
		}
	}
}
	
