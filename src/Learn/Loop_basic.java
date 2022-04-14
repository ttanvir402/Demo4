package Learn;

public class Loop_basic {

	//() --> parenthesis
	//{} --> Curly braces
	//[] --> Brackets
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 10; i > 0; i-=3) {
			
			sum = sum + i;
		}
		
		System.out.println("Sum is: " + sum);
	}
}
