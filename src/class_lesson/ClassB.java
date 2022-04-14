package class_lesson;
//Find the Area of the shapes using a method for each shapes and using a constructor
public class ClassB {
	
	public static void main(String[]args) {
		
		
		circle ci = new circle(10);
		System.out.println("circle area is:"+ ci.area());
		
		square sq = new square(20);
		System.out.println("square area is:" + sq.area());
		
		rectangle rc = new rectangle(30,40);
		System.out.println("rectangle area is:" + rc.area());
		
		triangle tr = new triangle(25,25);
		System.out.println("triangle area is:" + tr.area());
		
		
		
	}

}

class circle{
	
	int a;
	public circle(int a) {
		this.a = a;
		
	}
	
	public double area() {
		return 3.14 * this.a*this.a;
		
	}
	
	
}

class square{
	
	int b;
	public square(int b) {
		this.b = b;
	}
	
	public int area() {
		return this.b*this.b;
	}
	
}

class rectangle{
	
	int c;
	int d;
	public rectangle(int c, int d) {
		this.c = c;
		this.d = d;
	}
	
	public int area() {
		return this.c*this.d;
	}
	
}

class triangle{
	
	int e;
	int f;
	public triangle(int e, int f) {
		this.e = e;
		this.f = f;
	}
	
	public double area() {
		return .5*this.e * this.f;
	}
	
}