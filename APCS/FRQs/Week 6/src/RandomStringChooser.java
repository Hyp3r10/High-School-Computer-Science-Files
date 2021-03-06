// Part (a) - Write the entire RandomStringChooser class.
public class RandomStringChooser {
	private int count;
	private boolean[] indexes;
	private String[] strings;
	public RandomStringChooser(String[] array) {
		strings = array;
		indexes = new boolean[strings.length-1];
	}
	public String getNext() {
		if(count < strings.length-1) {
			boolean good = false;
			do {
				int random = (int) (Math.random() * strings.length-1);
				if(indexes[random] != true) {
					indexes[random] = true;
					count++;
					return strings[random];
				}
			} while (good == false);
		}
		else {
			return "NONE";
		}
	}
}