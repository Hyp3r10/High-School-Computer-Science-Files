public class StudentInfo
{
	// instance variables
	private String name;
	private int creditHours;
	private double gradePoints;
	private double GPA;

	public StudentInfo(String n, int c, double g)
	{
		name = n;
		creditHours = c;
		gradePoints = g;
		GPA = 0;
	}

	public String getName()
	{
		return name;
	}

	public int getCreditHours()
	{
		return creditHours;
	}

	public double getGradePoints()
	{
		return gradePoints;
	}

	public double getGPA()
	{
		return GPA;
	}

	public void setGPA(double gpa)
	{
		GPA = gpa;
	}

	public String toString()
	{
		return name + " " + creditHours + " " + gradePoints + " " + GPA;
	}
}