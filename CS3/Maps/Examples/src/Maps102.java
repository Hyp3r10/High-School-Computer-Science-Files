import java.util.Map;
import java.util.TreeMap;

public class Maps102 {
	public static void main(String[] args) {
		Map<Character, Integer> map1 = new TreeMap<Character, Integer>();
		String s = "The FitnessGram PACER Test is a multistage aerobic capacity test that progressively gets more difficult as it continues.";
		for(char temp : s.toCharArray()) {
			if(map1.containsKey(temp)) {
				map1.put(temp, map1.get(temp) + 1);
			} else {
				map1.put(temp, 1);
			}
		}
		System.out.println(map1);
	}
}
