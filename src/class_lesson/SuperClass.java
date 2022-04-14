package class_lesson;


//Inheritance
//Encapsulation

public class SuperClass{
	
	int a = 100000000;
	int b = 100;
	
	
	public static void main(String[] args) {
		
		SubClass1 sc1 = new SubClass1();
		
		System.out.println(sc1.a);
		
		SubClass2 sc2 = new SubClass2();
		
		System.out.println(sc2.b);
	}
}

class SubClass1 extends SuperClass{
	
	
}

class SubClass2 extends SuperClass{
	
	
}

