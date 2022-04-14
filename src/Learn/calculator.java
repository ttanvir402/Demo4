package Learn;

import java.util.Scanner;

public class calculator {
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in); 
	
	System.out.print("enter your choice:");
	int input = sc.nextInt();
	
	int result = 0;
	
	if(input == 1) {
		System.out.print("enter the value of a:");
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b =sc.nextInt();
		
		result= add(a,b);
	}
	
	else if(input == 2) {
		System.out.print("enter the value of a:");
		int a = sc.nextInt();
		
		System.out.print("enter the value of b");
		int b= sc.nextInt();
		
		result = sub(a,b);
	}
	
	else if (input ==3) {
		System.out.print("enter the value of a:");
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		result = mul(a,b);
	}
	
	else if(input==4) {
		System.out.print("enter the value of a:");
		int a = sc.nextInt();
		
		result = square(a);
	
	}
	
	else if (input==5) {
		System.out.print("enter the value of a:");
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		result = div(a , b);
	}
	System.out.println(result);
	
	}

public static int add(int a, int b) {
		
		return a + b;
	}

public static int sub(int a, int b) {
	
	return a - b;

    }
public static int mul(int a, int b) {
	
	return a * b;
}

public static int square(int a) {
	
	return a * a;
}

public static int div(int a , int b) {
	
	if (b==0)
		return 0;
	else
	
	    return a / b;
  }

}
	
	
		
		
	
	
	
		
		
		
		
			
			
			
			
			
	
		
	
		
      
	
         
	
			
			
		
			
	


