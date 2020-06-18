//� A+ Computer Science  -  www.apluscompsci.com
//Name - Matthew Sheldon
//Date - 1/9/18
//Class - Computer Science I
//Lab  - ArrayFunHouse
import java.lang.System;
import java.lang.Math;
public class ArrayFunHouse {
    //instance variables and constructors could be used, but are not really needed
    //getSum() will return the sum of the numbers from start to stop, including stop
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for(int i = start; i <= stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }
    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val) {
        int numVal = 0;
        for(int num : numArray) {
            if(num == val) {
                numVal++;
            }
        }
        return numVal;
    }
}