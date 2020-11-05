public interface IMap 
{
	/**
	 * Add the key/value pair to the table
	 * @return the number previously associated with person, or null
	 */
	PhoneNumber put(Person person, PhoneNumber phone);

	/**
	 * perform a table lookup
	 * @param person
	 * @return phone number mapped to this person
	 */
	PhoneNumber get(Person person);

	/** return the current number of key/value pairs in the map */
	int size();
	
	/**
	 * Remove supplied key (person)
	 * @return value mapped to supplied person, or null
	 */
	PhoneNumber remove(Person person);
}
