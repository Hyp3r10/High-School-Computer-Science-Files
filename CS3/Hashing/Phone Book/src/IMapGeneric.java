
public interface IMapGeneric<T, E> {
	/**
	 * Add the key/value pair to the table
	 * @return the number previously associated with E, or null
	 */
	E put(T key, E val);

	/**
	 * perform a table lookup
	 * @param key
	 * @return T mapped to this E
	 */
	E get(T key);

	/** return the current number of key/value pairs in the map */
	int size();
	
	/**
	 * Remove supplied key (E)
	 * @return value mapped to supplied key, or null
	 */
	E remove(T key);
}
