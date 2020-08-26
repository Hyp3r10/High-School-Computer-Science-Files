package ShoppingCart;

/**
 * @author MatthewSheldon
 */
public class ItemOrder {
	/**
	 * The Item that is being bought
	 */
	private Item item;
	/**
	 * The number of this item that is being bought
	 */
	private int quantity;
	/**
	 * Constructs an ItemOrder object instantiating the global variables
	 * item and quantity. Sets the number of items being bought in the 
	 * item object to be equal to qty
	 * 
	 * @param item	the Item object that is being bought
	 * @param qty	the number of this item that is being bought
	 */
	public ItemOrder(Item item, int qty) {
		this.item = item;
		this.quantity = qty;
	}
	/**
	 * Returns the price of this Order after discounts 
	 * 
	 * @return	the price of this Order after discounts
	 */
	public double getPrice() {
		return this.item.priceFor(this.quantity);
	}
	/**
	 * Returns the Item object of this ItemOrder object
	 * 
	 * @return	the item object of this ItemOrder object
	 */
	public Item getItem() {
		return this.item;
	}
	@Override
	/**
	 * Tests to see if two Objects are equal to each other.  
	 * 
	 * @param obj	the second object that is being compared to the current ItemOrder Object.	
	 * @return		true or false depending on if the names are the same between the two objects
	 */
	public boolean equals(Object obj) {
		ItemOrder other = (ItemOrder) obj;
		return this.item.equals(other.item);
	}
}
