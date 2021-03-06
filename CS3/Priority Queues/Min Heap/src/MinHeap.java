public class MinHeap {
	public Integer[] heap;					// The array backing the heap
	private int size; 						// The logical size of the heap
	public final int DEFAULT_CAPACITY = 8;	// The defualt size of the heap
	/**
	 * Defualt constructor that initializes a new heap
	 */
	public MinHeap() {
		this.heap = new Integer[this.DEFAULT_CAPACITY];
		this.size = 0;
	}
	/**
	 * Constructs a MinHeap with the passed initial values of vals
	 * @param vals	The initial values of the heap
	 */
	public MinHeap(int...vals) {
		this.heap = new Integer[vals.length+1];
		this.size = vals.length;
		for(int i = 1; i < this.heap.length; i++) {
			this.heap[i] = vals[i-1];
		}
		this.buildHeap();
	}
	/**
	 * Calls the method heapify() from index of
	 * heap.length/2 to 1. Used to pre-build the
	 * heap to satisfy min-heap properties.
	 */
	private void buildHeap() {
		for(int i = this.heap.length/2; i >= 1; i--) {
			this.heapify(i);
		}
	}
	/**
	 * Recursively calls itself until each sub-heap satisfies 
	 * the conditions of being a min-heap
	 * @param index	The index of the current node being tested
	 */
	private void heapify(int index) {
		int smallestIndex = index;
		if(this.inBounds(this.leftChildIndex(index)) && this.hasLeftChild(index) && this.getLeftChild(index) < this.heap[smallestIndex]) {
			smallestIndex = this.leftChildIndex(index);
		}
		if(this.inBounds(this.rightChildIndex(index)) && this.hasRightChild(index) && this.getRightChild(index) < this.heap[smallestIndex]) {
			smallestIndex = this.rightChildIndex(index);
		}
		if(smallestIndex != index) {
			this.swap(index, smallestIndex);
			this.heapify(smallestIndex);
		}
	}
	/**
	 * @return	The logical size of the heap
	 */
	public int getSize() {
		return this.size;
	}
	/**
	 * @return	If the heap is empty
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}
	/**
	 * Returns the minimum value in the heap without popping it off
	 * @return	The minimum value in the heap
	 */
	public int peekMinimum() {
		return this.heap[1];
	}
	/**
	 * Returns the left child of the passed index
	 * @param index	The node that we are currently looking at
	 * @return		The value of the left child node
	 */
	public int getLeftChild(int index) {
		return this.heap[(2 * index)];
	}
	/**
	 * Returns the right child of the passed index
	 * @param index	The node that we are currently looking at
	 * @return		The value of the right child node
	 */
	public int getRightChild(int index) {
		return this.heap[((2 * index) + 1)];
	}
	/**
	 * Returns the value of the parent to this (child) index
	 * @param index	The node that we are currently looking at
	 * @return		The value of the parent node
	 */
	public int getParent(int index) {
		return this.heap[(index / 2)];
	}
	/**
	 * Doubles the array's capacity, when adding an element 
	 * would exceed current capacity
	 */
	private void doubleCapacity() {
		Integer[] oldHeap = this.heap;
		this.heap = new Integer[oldHeap.length*2];
		for(int i = 1; i < oldHeap.length; i++) {
			this.heap[i] = oldHeap[i];
		}
	}
	/**
	 * Inserts the passed value into the min-heap
	 * Calls doubleCapacity() if the size is needed 
	 * to be greater to perform this action
	 * @param value	The value to be inserted
	 */
	public void insert(int value) {

		if(this.size+1 == this.heap.length) {
			this.doubleCapacity();
		}
		this.heap[++this.size] = value;
		this.bubbleUp(this.size);
	}
	/**
	 * Recursive helper method that allows a value added to
	 * the heap to "bubble up" to its correct position
	 * @param index	The index that we are currently looking at
	 */
	private void bubbleUp(int index) {
		if(index >= 2 && this.heap[index] < this.heap[(index / 2)]) {
			int parentIndex = (index / 2);
			this.swap(index, parentIndex);
			this.bubbleUp(parentIndex);
		}
	}
	/**
	 * Returns the minimum value and removes it from the heap
	 * Calls shiftDown() to restructure the tree
	 * @return	The smallest value removed from the heap
	 */
	public int popMinimum() {
		int minVal = this.heap[1];
		this.heap[1] = this.heap[this.size];
		this.shiftDown(1);
		this.size--;
		return minVal;
	}
	/**
	 * Recursive helper method that allows a value added to
	 * the head to "sift down" (bubble down) to its correct 
	 * position in the heap
	 * @param index	The current node being searched
	 */
	private void shiftDown(int index) {
		// As long as the index is in bounds and the index isn't 0 or less (i.e., out of bounds to the left)
		if(this.heap[index] != null && index >= 1) {
			// Variables that are used for determining where to shift elements
			Integer left = null;
			Integer right = null;
			int leftIndex = this.leftChildIndex(index);
			int rightIndex = this.rightChildIndex(index);
			
			// Only update the left object if it exists
			if(this.inBounds(leftIndex) && this.hasLeftChild(index)) { 
				left = this.getLeftChild(index); 
			}
			// Only update the right object if it exists
			if(this.inBounds(rightIndex) && this.hasRightChild(index)) { 
				right = this.getRightChild(index); 
			}
			
			// Has no children, exit
			if(left == null && right == null) {
				return;
			}
			// Has no right child or the left child is less than the right
			else if(right == null || left < right) {
				this.swap(index, leftIndex);
				this.shiftDown(leftIndex);
			}
			// Has no left child or the right child is less than the left
			else if(left == null || right <= left){
				this.swap(index, rightIndex);
				this.shiftDown(rightIndex);
			}
		}
		else {
			return;
		}
	}
	/**
	 * Tests to see if there is a right child of the passed index
	 * @param index	The index of the element in question
	 * @return		Whether or not the passed index has a right child
	 */
	private boolean hasRightChild(int index) {
		return this.heap[(index * 2) + 1] != null;
	}
	/**
	 * Tests to see if there is a left child of the passed index
	 * @param index	The index of the element in question
	 * @return		Whether or not the passed index has a left child
	 */
	private boolean hasLeftChild(int index) {
		return this.heap[(index * 2)] != null;
	}
	/**
	 * Tests to see if the passed index is contained within
	 * the logical size of the min-heap
	 * @param index	The index of the element in question
	 * @return		Whether or not the passed index is in bounds
	 */
	private boolean inBounds(int index) {
		return index < this.size;
	}
	/**
	 * Return the index of the left child of the passed index
	 * @param index	The index of the parent
	 * @return		The index of the left child
	 */
	private int leftChildIndex(int index) {
		return (index * 2);
	}
	/**
	 * Returns the index of the right child of the passed index
	 * @param index	The index of the parent
	 * @return		The index of the right child
	 */
	private int rightChildIndex(int index) { 
		return ((index * 2) + 1);
	}
	/**
	 * Swaps the values at index1 and index2
	 * @param index1	The first index to be swapped with the second
	 * @param index2	The second index to be swapped with the first
	 */
	private void swap(int index1, int index2) {
		int temp = this.heap[index1];
		this.heap[index1] = this.heap[index2];
		this.heap[index2] = temp;
	}
	@Override
	public String toString() {
		String output = "";
		for (int i = 1; i <= getSize(); i++)
			output += heap[i] + ", ";
		return output.substring(0, output.lastIndexOf(",")); //lazily truncate last comma
	}
	/** method borrowed with minor modifications from the Internet somewhere, for printing */
	public void display() {
		int nBlanks = 32, itemsPerRow = 1, column = 0, j = 1;
		String dots = "...............................";
		System.out.println(dots + dots);
		while (j <= this.getSize())
		{
			if (column == 0)
				for (int k = 0; k < nBlanks; k++)
					System.out.print(' ');
			System.out.print((heap[j] == null)? "" : heap[j]);
			if (++column == itemsPerRow) {
				nBlanks /= 2;
				itemsPerRow *= 2;
				column = 0;
				System.out.println();
			}
			else
				for (int k = 0; k < nBlanks * 2 - 2; k++)
					System.out.print(' ');
			j++;
		}
		System.out.println("\n" + dots + dots);
	}
}