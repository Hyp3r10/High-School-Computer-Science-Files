
public class Student implements Comparable<Student> {
	private int ID;
	private String name;
	private int grade;
	private double gpa;
	public Student (int iD, String name, int grade, double gpa) {
		super();
		ID = iD;
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public double getGpa() {
		return gpa;
	}
	@Override
	public boolean equals(Object other) {
		return this.ID == ((Student) other).ID;
	}
	@Override
	public int compareTo(Student other) {
		if(this.equals(other)) {
			return 0;
		}
		else if(this.ID < other.ID) {
			return -1;
		}
		else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", grade=" + grade + ", gpa=" + gpa + "]";
	}
}
