import java.util.*;

public class Lab14B_GoingUpOrDown
{
    public static void main( String args[] )
    {
        int[] one = {1,2,3,4,5,6,7,8,9,10};
        int[] two = {1,2,3,9,11,20,30};
        int[] three = {9,8,7,6,5,4,3,2,1-1,-2};
        int[] four = {3,6,9,12,9,6,3};
        
    
        System.out.println(Arrays.toString(one));
        System.out.println("is going Up ?  " + goingUp(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Up ?  " + goingUp(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Up ?  " + goingUp(three));         
        System.out.println(Arrays.toString(four));
        System.out.println("is going Up ?  " + goingUp(four));
        
        System.out.println("\n\n"+Arrays.toString(one));
        System.out.println("is going Down ?  " + goingDown(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Down ?  " + goingDown(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Down ?  " + goingDown(three));         
        System.out.println(Arrays.toString(four));
        System.out.println("is going Down ?  " + goingDown(four));
        
    }
    public static boolean goingUp(int[] array)
    {
        // write the code to find if the array array is going up return either true or false.
        int count = 0;
        boolean tf = false;
        int subArray1 = 0;
        int subArray2 = 1;
        for(int i = 0; i < array.length-1; i++) {
            if(array[subArray1] < array[subArray2]) {
                count++;
            }
            if(count == array.length-1) {
                tf = true;
            }
            subArray1++;
            subArray2++;
        }
        return tf;
    }
    public static boolean goingDown(int[] array)
    {
        // write the code to find if the array array is going down return either true or false.
        int count = 0;
        boolean tf = false;
        int subArray1 = 0;
        int subArray2 = 1;
        for(int i = 0; i < array.length-1; i++) {
            if(array[subArray1] > array[subArray2]) {
                count++;
            }
            if(count == array.length-1) {
                tf = true;
            }
            subArray1++;
            subArray2++;
        }
        return tf;
    }
}		