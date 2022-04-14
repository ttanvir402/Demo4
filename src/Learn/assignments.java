package Learn;

import java.util.Scanner;

public class assignments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("insert the distance:");
		 double distance = sc.nextInt();
		 
		 double fare = 0;
		 
		 if (distance >0 && distance <=8) {
			 
			 fare =15;
			 
		 }
		 else if (distance >=9 && distance <=30) {
			 fare = 15 + (distance-8)*1.17;
		 }
		 else if (distance>30) {
			 fare = 15 + 22*1.17 +(distance-30)*0.98;
		 }
		 System.out.println("total fare is:"+String.format("%.2f",fare));
		

	}

}
