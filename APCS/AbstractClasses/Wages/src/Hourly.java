public class Hourly extends Employee {
	private double wage;
	private int hours;
	
	public Hourly(String name, String ss, double wage, int hours) {
		super(name, ss);
		this.wage = wage;
		this.hours = hours;
	}
	public double getSalary() {
		int over = hours - 160;
		if(over > 0) {
			return ((hours-over) * wage) + ((over * (wage * 1.5)));
		}
		else {
			return hours * wage;
		} 
	}
}