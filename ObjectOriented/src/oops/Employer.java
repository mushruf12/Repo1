package oops;

public class Employer {
	private String name;//prop1
	private int salary;//prop2
	int empID;
	protected int getEmpID() {
		return empID;
	}
	protected void setEmpID(int empID) {
		this.empID=empID;
	}
	String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
