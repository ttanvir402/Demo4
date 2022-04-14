package employee;

//Main class

abstract public class Employee {
	 
	String position;
	private int empId;
	private int salary;
	String location;
	
	public Employee(String position, int empId, int salary, String location) {
		
		this.position = position;
		this.empId = empId;
		this.salary = salary;
		this.location = location;
	}
	
	public int getSalary() {
		
		return this.salary;
	}
	
	public int getEmpId() {
		
		return this.empId;
	}
	
	abstract public double getBonus();
}
