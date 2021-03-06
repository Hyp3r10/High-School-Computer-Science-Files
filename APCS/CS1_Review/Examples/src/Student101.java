public class Student101
{
	// Instance variables
	private String name; 
	private int gradeLevel;
	private double gPA;
	// Constructors
	public Student101() {
		name = "";
		gradeLevel = 0;
		gPA = 0.0;
	}
	public Student101(String n, int gradeLevel, double gPA) {
		name = n;
		this.gradeLevel = gradeLevel;
		this.gPA = gPA;	
	}
	// Getters
	public String getName() {
		return name;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public double getGPA() {
		return gPA;
	}
	// Mutators
	public void setName(String name) {
		this.name = name;
	}
	public void changeGradeLevel(int gl) {
		gradeLevel = gl;
	}
	public void changeGPA(double gpa) {
		gPA = gpa;
	}
	@Override
	public String toString() {
		return  "\nName :: " + getName() + 
				"\nGrade Level :: " + getGradeLevel() + 
				"\nGPA :: " + getGPA();
	}
	@Override
	public boolean equals(Object temp) {
		Student101 secondStudent = (Student101) temp;
		return this.getName().equals(secondStudent.getName()) && 
				getGradeLevel() == secondStudent.getGradeLevel() && 
				this.getGPA() == secondStudent.getGPA();
	}
}
