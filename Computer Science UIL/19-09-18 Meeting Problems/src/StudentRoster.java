import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentRoster {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("studentroster.dat"));
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			ArrayList<Student> studentRoster = new ArrayList<Student>();
			int numStudents = scan.nextInt();
			scan.nextLine();
			for(int j = 0; j < numStudents; j++) {
				String[] tempStudent = scan.nextLine().split(" ");
				studentRoster.add(new Student(tempStudent[0], Double.parseDouble(tempStudent[1]), Integer.parseInt(tempStudent[2])));
			}
			
			Collections.sort(studentRoster);
			
			for(int j = 0; j < numStudents; j++) {
				System.out.println(studentRoster.get(j));
			}
		}
	}
}
class Student implements Comparable<Student> {
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
	@Override
	public String toString() {
		return "\nName        :: " + getName() + 
			   "\nGPA         :: " + getGPA() + 
			   "\nGrade Level :: " + getGradeLevel();
	}
	@Override
	public int compareTo(Student temp) {
		if(this.getGPA() > temp.getGPA()) { 
			return 1;
		}
		else if(this.getGPA() < temp.getGPA()) {
			return -1;
		}
		else {
			if(this.getGradeLevel() > temp.getGradeLevel()) {
				return 1;
			}
			else if(this.getGradeLevel() < temp.getGradeLevel()) {
				return -1;
			}
			else {
				if(this.getName().compareTo(temp.getName()) < 0) {
					return 1;
				}
				if(this.getName().compareTo(temp.getName()) > 0) {
					return -1;
				}
				else {
					return 0;
				}
			}
		}
	}
}
