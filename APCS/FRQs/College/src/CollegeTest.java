import java.util.*;

public class CollegeTest
{
	public CollegeTest()
	{
		CollegeGroup group = new CollegeGroup();
		group.addCollege(new Colgate(27025));
		group.addCollege(new Duke(26000));
		group.addCollege(new Kalamazoo(19764));
		group.addCollege(new Stanford(25917));
		group.addCollege(new FloridaInternational(10800));
		group.addCollege(new Dartmouth(27764));
		group.addCollege(new Spelman(11455));
		
		group.updateTuition("Colgate University", 27500);
		for(College c : group.getColleges())
		{
			System.out.printf("%-35s", c.getName());
			System.out.printf("%-10s", c.getRegion());
			System.out.printf("$%6d\n", c.getTuition());
		}
		System.out.println();	
		ArrayList <College> list = group.getCollegeList("Southeast", 10000, 20000);
		for(College c : list)
		{
			System.out.printf("%-35s", c.getName());
			System.out.printf("%-10s", c.getRegion());
			System.out.printf("$%6d\n", c.getTuition());
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		CollegeTest test = new CollegeTest();
	}
}