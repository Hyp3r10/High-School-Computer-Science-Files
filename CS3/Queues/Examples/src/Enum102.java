
public class Enum102 {
	public static void main(String[] args) {
		Elements[] arr = Elements.values();
		for(Elements e : arr) {
			System.out.println(e + " at index " + e.ordinal());
		}
		System.out.println(Elements.valueOf("FIRE"));
		//IllegalArumentException because there is not an enum of this type
		//System.out.println(Elements.valueOf("LOVE"));
	}
}
