public class Student103 implements Comparable<Student103>
{
	private String name;
	private int grade;
	private double gpa;
	private int id;


	public Student103(int i, String n, int gr, double g)
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
	public int compareTo(Student103 stu) {
		return this.getName().compareTo(stu.getName());
	}
}