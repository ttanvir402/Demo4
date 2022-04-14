package employee;

public class Associate extends Employee{
	
	String position;
	private int empId;
	private int salary;
	String location;
	
	public Associate(String position, int empId, int salary, String location) {
		
		super(position, empId, salary, location);
		
		this.position = position;
		this.empId = empId;
		this.salary = salary;
		this.location = location;
	}
	
	public double getBonus() {
		
		return .30 * this.salary;
	}
}
