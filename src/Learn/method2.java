package Learn;

public class method2 {
	
	public static void main(String[]args) {
		
//		System.out.print("Odd numbers:");
//		System.out.print("even numbers:");
//		int a[] = new int[1000];
//		
//        for(int i = 0 ; i <a.length ; i++)
//        {  
//        	a[i] = i+1;
//        	
//            if(a[i] % 2 != 0)
//            {
//                System.out.println(a[i]+" ");
//            }
//            else if(a[i] %2 ==0){
//            	System.out.println(a[i]+"");
//            }
//        }
//        
//        System.out.print("even numbers:");
//        int b [] = new int[1000];
//        
//        for(int i =0; i <b.length; i++) {
//        	b[i] = i+1;
//        	
//        	if(b [i] % 2 ==0) {
//        		System.out.println(b[i]+"");
//        	}
//        }
								// 0 1 2 3 4
		int odd[] = new int[5];	//{1,3,5,7,9}
		int even[] = new int[5];
		
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i=1; i <= 10; i++) {
			
			if(i % 2 != 0) {
				
				odd[oddIndex] = i;
				oddIndex++;
			}
			else {
				
				even[evenIndex] = i;
				evenIndex++;
			}
		}
		
		
		System.out.println("The odd numbers are: ");
		
		for(int j = 0; j < odd.length; j++) {
			
			System.out.println(odd[j]);
		}
		
		System.out.println("The even numbers are: ");
		
		for(int k = 0 ; k < even.length; k++) {
			
			System.out.println(even[k]);
		}
	}
}
