import java.util.ArrayList;
public class Student {
	
	private String name;
	private double gpa;
	private int gradeLevel;
	
	public Student(String name, double gpa, int gradeLevel) {
		this.name = name;
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
	}
	public String getName() {
		return name;
	}
	public double getGPA() {
		return gpa;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	@Override
	public String toString() {
		return "\nName        :: " + getName() + 
			   "\nGPA         :: " + getGPA() + 
			   "\nGrade Level :: " + getGradeLevel();
	}
}
