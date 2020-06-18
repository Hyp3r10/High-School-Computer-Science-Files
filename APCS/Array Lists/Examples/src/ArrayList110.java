import java.util.ArrayList;
public class ArrayList110 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 1;
		for(int i = 0; i < 10; i++) {
			list.add(count++);
		}
		System.out.println(list);
		/*for(int i = 0; i < list.size(); i++) {
			if(list.get(i) >= 4 && list.get(i) <= 7) {
				list.remove(i--);
			}
		}*/
		for(int i = list.size()-1; i >= 0; i--) {
			if(list.get(i) >= 4 && list.get(i) <= 7) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}
