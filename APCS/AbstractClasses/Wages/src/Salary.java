public class Salary extends Employee {
	private double salary;
	
	public Salary(String name, String socialSecuriy, double salary) {
		super(name, socialSecuriy);
		this.salary = salary;
	}
	public double getSalary() {
		return salary/12;
	}
}