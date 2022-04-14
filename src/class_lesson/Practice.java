package class_lesson;
import java.util.Scanner;
public class Practice {
	int account_number =2;
	int ammount=4;
	static int ID = 0;
	
	public static void main(String[]args) {

		Practice t= new Practice();
		Practice s = new Practice();
		System.out.println(s.add(3, 7));
		System.out.println(t.add(3, 7));
		System.out.println("account_number:"+t.account_number);
		System.out.println("amount:"+t.ammount);
		System.out.println("ID:"+ t.ID);
		t.ID++;
		System.out.println("ID:"+ s.ID);
		
		
	}
	
	public int add(int a, int b) {
		return a+b;
	}

}
