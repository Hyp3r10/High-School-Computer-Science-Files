import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Maps103 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new TreeMap<String, Integer>();
		String[] s = "dog1cat2pig3dog1cat2pig7dog3dog6cat8dog4pig".split("\\d");
		for(String temp : s) {
			if(map1.containsKey(temp)) {
				map1.put(temp, map1.get(temp) + 1);
			} else {
				map1.put(temp, 1);
			}
		}
		for(String temp : map1.keySet()) {
			System.out.print(temp + "\t");
		}
		System.out.println();
		for(Integer val : map1.values()) {
			System.out.print(val + "\t");
		}
		
		System.out.println();
		
		Iterator<String> it = map1.keySet().iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.print(temp + " - " + map1.get(temp) + "\n");
		}
	}
}
