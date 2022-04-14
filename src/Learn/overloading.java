package Learn;

public class overloading {
	//when there are multiple method created in a class by same name  its called 
	//"overloading". overloading is a type of polymorphism. polimorphism has two types. "overloading and
	//overriding.
	
	//overloading is a procedure of defining multiple methods with a same name and same return type
	// but difference set of parameters.
	public int add(int a, int b) {		
		return a+b;	
	}
	// polymorphism works in diffrent types of parameter or diffrent numbers of parameters.
	public int add(double a, double b) {
		return (int)(a+b);
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public int add(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	

}
