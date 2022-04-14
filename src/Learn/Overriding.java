package Learn;

public class Overriding {

	public static void main(String[] args) {
		
		Pola p = new Pola();
		
		p.printName();
		
		p.setDeposit(200);
		
		System.out.println(p.getDeposit());
		
		System.out.println(p.add(1, 5));
		
		
	}
}


//overriding is a procedure of creating the same method in a subclass that is already defined in
//the superclass with a different implementation
class Abba {
	
	private int deposit = 1000;
	
	public void printName() {
		
		System.out.println("My last name is Haque");
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int getDeposit() {
		
		return deposit;
	}
	
	public void setDeposit(int amount) {
		
		deposit = deposit + amount;
	}
}

class Pola extends Abba {
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(int a, int b) {
		return a * b;
	}
}

class Nati extends Pola {
	
	public int add(int a, int b) {
		return a % b;
	}
}
