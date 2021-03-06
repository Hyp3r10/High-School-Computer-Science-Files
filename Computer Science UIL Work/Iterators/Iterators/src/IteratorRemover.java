import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorRemover
{
	private ArrayList<String> list;
	private Iterator<String> iterate;
	private String toRemove;
	private int size = 0;

	public IteratorRemover(String line, String rem)
	{
		setTest(line, rem);
	}

	public void setTest(String line, String rem)
	{
		toRemove = rem;
		String[] letters = line.split("[ ]");
		list = new ArrayList<String>(Arrays.asList(letters));
		

		remove();
	}

	public void remove()
	{
		iterate = list.iterator();
		int i = 0;
		while(iterate.hasNext()) {
			if(iterate.next().equals(toRemove)) {		
				iterate.remove();
			}
			i++;
		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}