
public class BubbleSort101 {

	public static void main(String[] args) {
		//Bubble Sort with primitives
				int[] nums = new int[10];

				// Generate random numbers from 2..11 inclusive

				for(int i = 0; i < nums.length; i++) {
					nums[i] = (int) (Math.random()*10 ) + 2;
				}

				// Print sorted Array
				System.out.println("Unsorted Array :: "); 
				for(int num : nums) {
					System.out.print(num + " ");
				}

				// Sort the Array
				int count = 0;
				do {
					count = 0;
					for(int i = 0; i < nums.length-1; i++) {
						if(nums[i] > nums[i+1]) {
							swap(nums, i, i+1);
							count++;
						}
					}
				} while(count > 0);

				// Print sorted Array
				System.out.println("\nSorted Array :: "); 
				for(int num : nums) {
					System.out.print(num + " ");
				}
			}
			public static void swap(int[] nums, int pos1, int pos2) {
				int temp = nums[pos2];
				nums[pos2] = nums[pos1];
				nums[pos1] = temp;
			}
		}
