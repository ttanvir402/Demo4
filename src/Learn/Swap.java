package Learn;

public class Swap {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		System.out.println("Before swap:");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		//a --> Adnan coffee
		//b --> rajin tea
				
		//temp --> empty
		//Pour adnan's coffee in temp
		int temp = a;
				
		//pour rajin's coffee in adnans cup
		a = b;
				
		//coffee from temp cup to rajin's cup
		b = temp;
		
		System.out.println("After swap:");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
//	public static void swap(Object a, Object b) {
//		
//		//a --> Adnan coffee
//		//b --> rajin tea
//		
//		//temp --> empty
//		//Pour adnan's coffee in temp
//		Object temp = a;
//		
//		//pour rajin's coffee in adnans cup
//		a = b;
//		
//		//coffee from temp cup to rajin's cup
//		b = temp;
//		
//		System.out.println("Inside method:");
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
//	}
}
