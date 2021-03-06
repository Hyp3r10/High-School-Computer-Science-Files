import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MySolutionUnique {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Number> numbers = new ArrayList<Number>();
        for(int i = 0; i < arr.length;) {
            int curr = arr[i];
            int len = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] == curr) {
                    len++;
                }
                else {
                    j = arr.length;
                }
            }
            i+=len;
            numbers.add(new Number(curr, len));
        }
        int index = 0;
        Collections.sort(numbers);
        for(int i = 0; i < k; i++) {
                if(index < numbers.size()) {
                    Number newNumber = numbers.get(index);
                    newNumber.decreaseCount();
                    if(newNumber.numNumbers == 0) {
                        numbers.remove(0);
                    }
                    else {
                        numbers.set(0, newNumber);
                    }
            }
        }
        return numbers.size();
    }
}
class Number implements Comparable<Number> {
    public int numNumbers;
    public int number;
    public Number(int number, int numNumbers) {
        this.number = number;
        this.numNumbers = numNumbers;
    }
    public void decreaseCount() {
        numNumbers--;
    }
    public int compareTo(Number other) {
        return Integer.compare(this.numNumbers, other.numNumbers);
    }
    public String toString() {
        return "" + this.number;
    }
}