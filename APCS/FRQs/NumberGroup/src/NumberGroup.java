import java.util.ArrayList;
import java.util.List;

// Part(a)
public interface NumberGroup {
	public boolean contains(int num);
}
// Part(b)
class Range implements NumberGroup {
	private int min, max;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public Range(int min, int max) {
		this.min = min;
		this.max = max;
		getList();
	}
	public void getList() {
		for(int i = min; i <= max; i++) {
			list.add(i);
		}
	}
	public boolean contains(int num) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(num)) {
				return true;
			}
		}
		return false;
	}
}
// Part (c)
class MultipleGroups
{
	private List<NumberGroup> grouplist;

	public MultipleGroups(Range[] ranges)
	{
		grouplist = new ArrayList<NumberGroup>();
		for(int i = 0; i < ranges.length; i++) {
			grouplist.add(ranges[i]);
		}
	}
	/** Returns true if at least one of the number groups in this multiple group contains num;
	* false otherwise.
	*/
	public boolean contains(int num)
	{
		for(int i = 0; i < grouplist.size(); i++) {
			if(grouplist.get(i).contains(num)) {
				return true;
			}
		}
		return false;
	}
}
