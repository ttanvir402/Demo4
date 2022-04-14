package cab;

public class Baap {
	
	protected int money = 1000000;
	public int book = 100;
	private int jainga = 5;
	
	protected void printName() {
		
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		Pola p = new Pola();
		
		System.out.println(p);
		p.printName();
	}
}

class Pola extends Baap{
	
	
}
