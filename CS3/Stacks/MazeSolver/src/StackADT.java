/**
 * An interface that describes a stack abstract data type
 */
public interface StackADT 
{
    /**
     * Add an item onto the stack
     * @param item the data item to add (of type T)
     */
    public void push(Square item);

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     */
    public Square pop();
	
	/**
     * Returns but does not remove the top item from the stack
     * @return the top item in the stack
     */
    public Square peek();

    /**
     * Return how many items are in the stack
     * @return the number of items in the stack
     */
    public int size();

    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty();

    /**
     * Remove all elements from the data structure
     */
    public void clear();
}
