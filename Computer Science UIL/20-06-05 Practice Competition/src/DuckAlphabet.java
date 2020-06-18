
public class DuckAlphabet {
	public static void main(String[] args) {
		String output = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
		for(int i = 1; i <= 26; i++) {
			System.out.print("Day " + i + ": ");
			for(int j = 0; j < (i * 2); j++) {
				System.out.print(output.charAt(j));
			}
			System.out.println();
		}
	}
}
