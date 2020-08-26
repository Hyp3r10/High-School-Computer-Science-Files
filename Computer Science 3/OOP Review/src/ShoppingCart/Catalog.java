package ShoppingCart;

import java.util.ArrayList;

/**
 * @author MatthewSheldon
 */
public class Catalog {
	// the name of the catalog
	public String catalogName;
	// the list of Items in this catalog
	public ArrayList<Item> catalog;
	/**
	 * Constructs a Catalog Object instantiating the global variables 
	 * catalogName and catalog
	 * 
	 * @param name	the name of the Catalog being created
	 */
	public Catalog(String name) {
		this.catalogName = name;
		this.catalog = new ArrayList<Item>();
	}
	/**
	 * Adds a new Item Object to the list of Items in the global variable
	 * catalog
	 * 
	 * @param item	the Item being added to the catalog
	 */
	public void add(Item item) {
		this.catalog.add(item);
	}
	/**
	 * Returns the size of the catalog
	 * 
	 * @return	the size of the catalog
	 */
	public int size() {
		return this.catalog.size();
	}
	/**
	 * Returns the Item at the given index
	 * 
	 * @param index		the index of the Item that is being retrieved 
	 * @return			the item at index in catalog
	 */
	public Item get(int index) {
		return this.catalog.get(index);
	}
	/**
	 * Returns the name of the catalog
	 * 
	 * @return	the name of the catalog
	 */
	public String getName() {
		return this.catalogName;
	}
}
