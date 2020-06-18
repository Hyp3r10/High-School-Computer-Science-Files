public class Arrays103 {
    public static void main(String[] args) {
        int[] scores = {3,4,5,6,7,9,1,2,5,8};
        // index        0,1,2,3,4,5,6,7,8,9
        int len = scores.length;
        System.out.println("The length of the array is :: " + len);
        System.out.println();
        for(int i = 0; i < len; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}