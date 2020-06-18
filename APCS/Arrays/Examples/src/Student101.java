
public class Student101 {
	//Instance variables
	private String name;
	private int gradeLevel;
	private double gpa;
	//Constructor
	public Student101() {
		name = "";
		int gradeLevel = 0;
		double gpa = 0;
	}
	public Student101(String name, int gradeLevel, double gpa) {
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}
	//Accessor (AKA Getters) 
	public String getName() {
		return name;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public double getGPA() {
		return gpa;
	}
	//Mutator (AKA Setters)
	public void setName(String name) {
		this.name = name;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	//toString
	@Override
	public String toString() {
		return "\nName ::" + getName() + 
			   "\nGrade Level :: " + getGradeLevel() + 
			   "\nGPA :: " + getGPA();
	}
}
