package Learn;

public class Taxi {
	
	public static void main(String[] args) {
		
		double fare = 0;
		
		int distance = 35;	//in miles
		
		//for first 5 miles
		fare = fare + 10;	//new = old + $value
		
		System.out.println();
		
		//for next 20 miles
		fare = fare + 20 * 1.12;
		
		//for remaining miles
		fare = fare + 0.88 * 5;
		
		System.out.println(String.format("%.2f", fare));
		
	}
}
