package employee;

public class Help_Desk_Operator extends Employee{

	String position;
	private int empId;
	private int salary;
	String location;
	
	public Help_Desk_Operator(String position, int empId, int salary, String location) {
		
		super(position, empId, salary, location);
		
		this.position = position;
		this.empId = empId;
		this.salary = salary;
		this.location = location;
	}
	
	public double getBonus() {
		
		return .1 * this.salary;
	}
}
