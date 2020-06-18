//import java.lang.*;

public class MyArray
{
    // constants
    private final int INITIAL_LENGTH = 5;  // initial length of array

    // instance variables
    private int[] array;
    private int numElements;  // logical size of array
    // constructor
    public MyArray() {
        array = new int[INITIAL_LENGTH];  // instaniate array
        numElements = 0;
    }
    /** postcondition: value has been appended to the end of
     *    array. numElements has been incremented by one.
     *  @param value the value to be added to array
     */
    public void add(int value) {
    	array[numElements] = value;
    	numElements++;
    	if(numElements == array.length) {
    		resize();
    	}
    }
    /** postcondition: value has been inserted into array at position
     *    index. numElements has been incremented by one.
     *    by one.
     *  @param index position to insert value
     *  @param value the value to be inserted
     */
    public void add(int index, int value) {
    	if(index >= 0 && index < numElements) {
    		for(int i = numElements-1; i >= index; i--) {
    			array[i+1] = array[i];
    		}
    		array[index] = value;
    		numElements++;
    		if(numElements == array.length) {
    			resize();
    		}
    	}
    	else if(index < array.length) {
    		add(value);
    	}
    	else {
    		throw new java.lang.ArrayIndexOutOfBoundsException(index);
    	}
    }
    /** postcondition: the value at index has been removed from
     *    array. numElements has been decremented
     *    by one.
     *  @param index position of element to be removed
     */
    public int remove(int index) {
    	int item = 0;
    	if(index >= 0 && index < numElements) {
    		item = array[index];
    		for(int i = index; i <= numElements-1; i++) {
    			array[i] = array[i+1];
    		}
    		numElements = numElements-1;
    		return item;
    	}
    	else {
    		throw new java.lang.ArrayIndexOutOfBoundsException(index);
    	}
    }

    /** @return the value at index
     *  @param index position of element to be returned
     */
    public int get(int index) {
    	if(index >= 0 && index < array.length) {
    		return array[index];
    	}
    	else{
    		throw new java.lang.ArrayIndexOutOfBoundsException(index);
    	}
    }
    /** postcondition: array's size has been increased by one
     */
    public void resize() {
    	int[] newArray = new int[array.length+1];
    	for(int i = 0; i <= array.length-1; i++) {
    		newArray[i] = array[i];
    	}
    	array = newArray;
    }
	/** @return logical size of array(numElements)
     */
    public int size() {
        return numElements;
    }
    /** @return a string representation of array
     */
    @Override
    public String toString() {
        String str="";

        for(int i=0; i < numElements; i++)
        {
            str+="["+i+","+array[i]+"]\n";
        }
        return str;
    }
}  