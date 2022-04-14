package Learn;

import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert value of a: ");
		int a = sc.nextInt();
		
		System.out.print("Insert value of b: ");
		int b = sc.nextInt();
		
		System.out.print("Insert valye of c: ");
		int c = sc.nextInt();
		
		
		int min;
		int max;
		int middle;
		
		//Find MIN
		if(a < b && a < c)
			min = a;
		else if(b < a && b < c)
			min = b;
		else 
			min = c;
		
		//Find MAX
		if(a > b && a > c)
			max = a;
		else if(b > a && b > c)
			max = b;
		else 
			max = c;
		
		//2 1 3 --> a,b,c
		//2 3 1 --> a,b,c
		//1 2 3 --> a,b,c
		//3 2 1 --> a,b,c
		//Find Middle
		if((a > b && a < c) || (a > c && a < b))
			middle = a;
		else if((b > a && b < c) || (b >c && b < a))
			middle = b;
		else
			middle = c;
		
			
		System.out.println("Minimum number is: " + min);
		System.out.println("Maximum number is: " + max);
		System.out.println("Middle number is " + middle);
	}

}
