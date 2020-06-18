public class Arrays108 {
    public static void main(String[] args) { 
        Arrays108 test = new Arrays108();
        
        int[] nums = {7,1,3,7,5,7,8,7,7};
        
        System.out.println("'7' Count " + test.findSevens(nums));
    }
    public int findSevens(int[] rayray) {
        int count7 = 0;
        //Basic for loop
        /*for(int i = 0; i < rayray.length; i++) {
            if(rayray[i] == 7) {
                count7++;
            }
        }*/
        
        //Enhanced for loop
        for(int num : rayray) {
            if(num == 7) {
                count7++;
            }
        }
        return count7;
    }
}