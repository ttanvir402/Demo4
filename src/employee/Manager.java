package employee;

public class Manager extends Employee{

	String position;
	private int empId;
	private int salary;
	String location;
	
	public Manager(String position, int empId, int salary, String location) {
		
		super(position, empId, salary, location);
		
		this.position = position;
		this.empId = empId;
		this.salary = salary;
		this.location = location;
	}
	
	public double getBonus() {
		
		return .50 * this.salary;
	}
}
