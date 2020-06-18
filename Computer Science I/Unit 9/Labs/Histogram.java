import java.util.*;
public class Histogram {
    public int numCount0 = 0, numCount1 = 0, numCount2 = 0, numCount3 = 0, numCount4 = 0, numCount5 = 0, numCount6 = 0, numCount7 = 0, numCount8 = 0, numCount9 = 0;
    public static void main(String[] args) {
        Histogram app = new Histogram();
        int[] array1 = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        int[] array3 = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        
        app.getNumOfArray(array1);
        app.printResults();
        System.out.println();
        
        app.getNumOfArray(array2);
        app.printResults();
        System.out.println();
        
        app.getNumOfArray(array3);
        app.printResults();
        System.out.println();
    }
    public void getNumOfArray(int[] array) {
        numCount0 = 0;
        numCount1 = 0;
        numCount2 = 0;
        numCount3 = 0;
        numCount4 = 0;
        numCount5 = 0;
        numCount6 = 0;
        numCount7 = 0;
        numCount8 = 0; 
        numCount9 = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                numCount0++;
            }
            else if(array[i] == 1) {
                numCount1++;
            }
            else if(array[i] == 2) {
                numCount2++;
            }
            else if(array[i] == 3) {
                numCount3++;
            }
            else if(array[i] == 4) {
                numCount4++;
            }
            else if(array[i] == 5) {
                numCount5++;
            }
            else if(array[i] == 6) {
                numCount6++;
            }
            else if(array[i] == 7) {
                numCount7++;
            }
            else if(array[i] == 8) {
                numCount8++;
            }
            else if(array[i] == 9) {
                numCount9++;
            }
        }
    }
    public void printResults() {
        System.out.println(" 0 - " + numCount0);
        System.out.println(" 1 - " + numCount1);
        System.out.println(" 2 - " + numCount2);
        System.out.println(" 3 - " + numCount3);
        System.out.println(" 4 - " + numCount4);
        System.out.println(" 5 - " + numCount5);
        System.out.println(" 6 - " + numCount6);
        System.out.println(" 7 - " + numCount7);
        System.out.println(" 8 - " + numCount8);
        System.out.println(" 9 - " + numCount9);
    }
}