
public class Arrays106 {
	public static void main(String[] args) {
		Arrays106 test = new Arrays106();
		int[] nums = {1,2,3,4};
		System.out.println("Sum of the elements of the array :: " + test.sum(nums));
	}
	public int sum(int[] ray) {
		int sum = 0;
		/*for(int i = 0; i < ray.length; i++) {
			sum += ray[i];
		}*/
		
		for(int num : ray) {
			sum+= num;
		}
		return sum;
	}
}
