package Labs;

import java.util.Arrays;

public class Or {
	public static void main(String[] args) {
		String s = "humbapumpa jim";
		String[] segments = s.split(".*(jim|joe).*");
		System.out.println(Arrays.toString(segments).length() == 2);
		
		s = "humbapumpa jom";
		segments = s.split(".*(jim|joe).*");
		System.out.println(Arrays.toString(segments).length() == 2);
		
		s = "humbaPumpa joe";
		segments = s.split(".*(jim|joe).*");
		System.out.println(Arrays.toString(segments).length() == 2);
		
		s = "humbapumpa joe jim";
		segments = s.split(".*(jim|joe).*");
		System.out.println(Arrays.toString(segments).length() == 2);
		
	}
}
