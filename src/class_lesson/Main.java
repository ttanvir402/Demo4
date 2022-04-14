package class_lesson;

public class Main {
	
	public static void main(String[] args) {
		
		Adnan a = new Adnan();
		
		Imran i = new Imran();
		
		Box b = new Box(4,5,6);
		
		System.out.println("Volume of the box is : " + b.volume());
		
		Box c = new Box(10,20,30);
		
		System.out.println("Volume of the box is :" + c.volume());
	}
}

class Imran{
	
	int length;
	int width;
	int height;
}



class Adnan{
}

class Box{
	
	int length;
	int height;
	int width;
	
	public Box(int length, int width, int height) {
		
		this.length = length;
		this.height = height;
		this.width = width;
	}
	
	public int volume() {
		
		return this.length*this.height*this.width;
	}
}