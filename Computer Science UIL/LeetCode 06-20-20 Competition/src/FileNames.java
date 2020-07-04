import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FileNames {
	public String[] getFolderNames(String[] names) {
		ArrayList<Name> list = new ArrayList<Name>();
		for(String curr : names) {
			String name = curr;
			int count = 0;
			Name temp = new Name(name, count);
			if(!list.contains(temp)) {
				list.add(temp);
			}
			else {
				while(!list.contains(temp)) {
					temp.increaseCount();
				}
			}
			
			
			/*Name temp = new Name(curr);
			if(uniqueNames.contains(temp)) {
				Name master = null;
				int index = 0;
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).compareTo(temp) == 0) {
						index = i;
						master = list.get(i);
						i = list.size();
					}
				} 
				master.increaseCount();
				Name newName = new Name(master.name, master.count);
				list.add(e)
			}
			else {
				uniqueNames.add(temp);
				list.add(temp);
			}*/
		}
	}
}
class Name implements Comparable<Name> {
	public String name;
	public int count;
	
 	public Name(String name, int count) {
 		this.name = name;
 		this.count = count;
 	}
	public int compareTo(Name other) {
		String temp1 = this.name;
		String temp2 = other.name;
		if(this.count != 0) { 
			temp1 = this.name + "(" + this.count + ")";
		}
		if(other.count != 0) { 
			temp2 = other.name + "(" + other.count + ")";
		}
		return temp1.compareTo(temp2);
	}
	public void increaseCount() {
		this.count++;
	}
	public String toString() {
		return name;
	}
}
