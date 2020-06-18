public class Student101 implements Comparable<Object>
{
	private String name;
	private int grade;
	private double gpa;
	private int id;


	public Student101(int i, String n, int gr, double g)
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
	public int compareTo(Object temp) {
		Student101 stu = (Student101) temp;
		
		// < > ==
		// < (negative)
		if(this.getID() < stu.getID()) {
			return -1;
		}
		// > (positive)
		else if(this.getID() > stu.getID()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}