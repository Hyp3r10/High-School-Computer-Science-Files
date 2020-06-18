import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort() {
		list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int count = 0;
		int size = list.size()+1;

		if(size == 1) {
			list.add(word);
		}
		else {
			// Check if the word is already in the list...
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(word)) {
					count++;
				}
			}
			//... if not, enter... 
			if(count == 0) {
				// add the element
				list.add(0, word);
				// Sort the array
				for(int i = 0; i < list.size(); i++) {
					String temp = list.get(i);
					int j = i;
					while(j > 0 && list.get(j-1).compareTo(temp) > 0) {
						list.set(j, list.get(j-1));
						j--;
					}
					list.set(j, temp);
				}
			}
			// ... else, don't do anything.
		}
	}
	public void remove(String word)
	{
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(word)) {
				list.remove(i);
			}
		}
	}

	public String toString()
	{
		String output = "";
		for(String temp : list) {
			output += " " + temp;
		}
		return output;
	}
}