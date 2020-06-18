
public class Arrays107 {
	public static void main(String[] args) {
		Arrays107 test = new Arrays107();
		int[] nums = {3,1,7,3,5,3,9,3,3};
		System.out.println("The number of threes in the array :: " + test.findThrees(nums));
	}
	private int findThrees(int[] manta) {
		int count3 = 0;
		for(int num : manta) {
			if(num == 3) {
				count3++;
			}
		}
		return count3;
	}
}
