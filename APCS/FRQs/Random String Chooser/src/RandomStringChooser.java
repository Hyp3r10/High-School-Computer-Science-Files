// Part (a) - Write the entire RandomStringChooser class.
public class RandomStringChooser {
	private int count;
	private boolean[] used;
	private String[] strings;

	public RandomStringChooser(String[] array) {
		strings = array;
		used = new boolean[strings.length];
		count = 0;
	}

	public String getNext() {
		boolean done = false;
		if(count != strings.length) {
			do {
				int random = (int) (Math.random() * strings.length);
				if(!used[random]) {
					used[random] = true;
					count++;
					return strings[random];
				}
			} while(!done);
		}
		return "NONE";
	}
}
