public class Student104 implements Comparable<Student104>
{
	private String name;
	private int grade;
	private double gpa;
	private int id;


	public Student104(int i, String n, int gr, double g)
	{
		id = i;
		name = n;
		gpa = g;
		grade = gr;
	}

	public int getID()
	{
		return id;
	}

	public void setID(int i)
	{
		id = i;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String n)
	{
		name = n;
	}

	public int getGrade()
	{
		return grade;
	}

	public void setGrade(int g)
	{
		grade = g;
	}

	public double getGPA()
	{
		return gpa;
	}

	public void setGrade(double g)
	{
		gpa = g;
	}
	public boolean equals(Student104 stu) {
		return this.getGPA() == stu.getGPA();
	}
	// compareTo should utilize the equals method (Best Practice)
	public int compareTo(Student104 stu) {
		// < > ==
		// < (negative)
		if(this.equals(stu)) {
			return 0;
		}
		// > (positive)
		else if(this.getGPA() > stu.getGPA()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}