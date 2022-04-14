package Learn;

import java.util.Scanner ;

public class num {
	
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("insert value of a:");
	int a = sc.nextInt();
	
	System.out.print("insert value of b:");
	int b = sc.nextInt();
	
	System.out.print("insert value of c:");
	int c = sc.nextInt();
	
	int min;
	int max ;
	int middle;
	
	if(a<b && a<c)
		min = a;
	
	else if(b<a && b<c)
		min = b;
	
	else
		min = c;
	
	if (a>b && a>c)
		max=a;
		
	else if (b>a && b>c)
		max=b;
	else 
		max=c;
	
	if((a<b && a<c)||(a>b && a>c))
		middle =a;
	
	else if ((b<a && b<c)||(b>a && b>c))
		middle =b;
	 
	else 
		middle=c;
	
	System.out.println("minimum number is:" +min);
	System.out.println("maximum number is:" +max);
	System.out.println("middle number is:" +middle);
		
   }
	
}


