/**
 * @author MatthewSheldon
 */
public class BarrelRoping {
	public static void main(String[] args) {
		double[] M = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < M.length; i++) {
			int len = (int) Math.round((double) (3.0 * (Math.PI + M[i])) + 0.5) + 6;
			System.out.println(i+2 + " " + len);
		}
	}
}
