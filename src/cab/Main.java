package cab;

//circle and square

public class Main {
	
	public static void main(String[] args) {
		
		Shape c = new Circle(5);	//honda
		
		System.out.println(c.area());
		
		Shape s = new Square(10);	//toyota
		
		System.out.println(s.area());
		
	}
}

//car 
abstract class Shape{
	
	int r;
	
	public Shape(int r) {
		this.r = r;
	}
		
	abstract public double area();
	
}


//Car --> Honda

class Circle extends Shape{
	
	int radius;
	
	public Circle(int radius) {
		
		super(radius);	// super() is nothing but the constructor of super class Shape
		this.radius = radius;
	}
	
	public double area() {
		
		return 3.14 * this.radius * this.radius;
	}
}

//car --> Toyota
class Square extends Shape{
	
	int side;
	
	public Square(int side) {
		
		super(side);
		
		this.side = side;
	}
	
	public double area() {
		
		return this.side * this.side;
	}
}
