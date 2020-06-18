import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		setEmAll(line, rem, rep);
	}

	public void setEmAll(String line, String rem, String rep)
	{
		toRemove = rem;
		replaceWith = rep;
		
		String[] words = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		
		replace();
	}

	public void replace()
	{
		ListIterator<String> li = list.listIterator();
		while(li.hasNext()) {
			if(li.next().equals(toRemove)) {
				li.set(replaceWith);
			}
		}
		while(li.hasPrevious()) {
			li.previous();
		}
		int i = 0;
		while(li.hasNext()) {
			list.set(i, li.next());
			i++;
		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}