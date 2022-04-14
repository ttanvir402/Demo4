package Learn;

import java.util.Scanner;

public class array_practice3 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a:");
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		System.out.print("enter the value of c:");
		int c = sc.nextInt();
		
		int min;
		int max;
		int middle;
		
		
		if(a<b && a <c)
			min =a;
		
			
		else if(b<a && b<c)
			min = b;
			
		else
			min =c;
		
		
		if (a>b && a>c)
			max = a;
		
		else if(b>a && b>c)
			max = b;
		
		else 
			max =c;
		
		if((a<b && a>c) || (a>b && a<c))
			middle = a;
		
		else if((b>a && b<c)|| (b<a && b>c))
			middle = b;
		
		else
			middle = c;
		
		
		System.out.println("Min number is:" +min);
		System.out.println("Max number is:" +max);
		System.out.println("Middle number is:" +middle);
			
	}
	
}
	
	