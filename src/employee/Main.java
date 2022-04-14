package employee;

public class Main {
	
	public static void main(String[] args) {
		
//		Associate Imran = new Associate("Associate", 12345, 57000, "CT");
//		
//		System.out.println("Imran's position is : "  + Imran.position);
//		
//		System.out.println("Imran's salary is : " + Imran.getSalary());
//		
//		System.out.println("Inram's empId is : " + Imran.getEmpId());
//		
//		System.out.println("Imran's bonus this year is: " + Imran.getBonus());
		
		Help_Desk_Operator Adnan = new Help_Desk_Operator("HDO", 54321, 24320, "NY");
		
		System.out.println("Location: " + Adnan.location);
		System.out.println("EmpID: " + Adnan.getEmpId());
		System.out.println("Salary: " + Adnan.getSalary());
		System.out.println("Position: " + Adnan.position);
		
		System.out.println("Bonus: " + Adnan.getBonus());
	}
}
