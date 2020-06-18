import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class InsertionSortRunner
{
	public static void main(String args[])
	{
		InsertionSort test = new InsertionSort();
		out.println("adding alice");
		test.add("alice");
		out.println("adding tommy");
		test.add("tommy");
		out.println("adding bobby");
		test.add("bobby");
		out.println("adding annabell");
		test.add("annabell");
		out.println("adding sallysue");
		test.add("sallysue");
		out.println("adding sallymae");
		test.add("sallymae");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing bobby");
		test.remove("bobby");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing alice");
		test.remove("alice");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("adding fred");
		test.add("fred");
		out.println("adding xylophone");
		test.add("xylophone");
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing tommy");
		test.remove("tommy");
		test.remove("tommy");  //should do nothing
		out.println("printing the list ::  "+test+"\n\n");
		out.println("removing fred");
		test.remove("fred");
		out.println("removing annabell");
		test.remove("annabell");
		out.println("removing sallysue");
		test.remove("sallysue");
		out.println("printing the list ::  "+test+"\n\n");
	}
}