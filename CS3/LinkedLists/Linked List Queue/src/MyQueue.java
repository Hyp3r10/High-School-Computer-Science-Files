
public class MyQueue<T> implements QueueADT<T> {
	/**
	 * This is the backbone for storing the data in this MYQueue Object
	 */
	public MyLinkedList<T> queue;
	/**
	 * Default constructor that instantiates the queue object
	 */
	public MyQueue() {
		this.queue = new MyLinkedList<T>();
	}
	/**
	 * Overloaded constructor that instantiates the queue object
	 * to hold the elements from vars
	 * @param vars	A variable number of arguments that are original elements to add
	 */
	@SafeVarargs
	public MyQueue(T...vars) {
		this.queue = new MyLinkedList<T>(vars);
	}
	@Override
	public void offer(T item) {
		this.queue.add(item);
	}
	@Override
	public T poll() {
		return this.queue.remove(0);
	}
	@Override
	public T peek() {
		return this.queue.get(0);
	}
	@Override
	public int size() {
		return this.queue.size;
	}
	@Override
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
	@Override
	public void clear() {
		this.queue = new MyLinkedList<T>();
	}
}
