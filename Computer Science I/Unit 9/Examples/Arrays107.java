public class Arrays107 {
    public static void main(String[] args) { 
        Arrays107 test = new Arrays107();
        
        int[] nums = {1,2,3,4};
        
        System.out.println("Sum of elements in array :: " + test.sum(nums));
    }
    public int sum(int[] rayray) {
        int sum = 0;
        //Basic for loop
        /*for(int i = 0; i < rayray.length; i++) {
            sum += rayray[i];
        }*/
        
        //Enhanced for loop
        for(int num : rayray) {
            sum += num;
        }
        return sum;
    }
}