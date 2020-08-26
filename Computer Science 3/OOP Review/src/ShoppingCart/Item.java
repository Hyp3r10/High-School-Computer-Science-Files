package ShoppingCart;
/**
 * @author MatthewSheldon
 */
public class Item {
	// the name of the Item 
	public String name;
	// the price of the Item being created without discount
	public double price;
	// the number of items needed to be bought for a bulk discount to be active
	public int bulkQty;
	// the price of each item when the bulkQty condition is met
	public double bulkPrice;
	/**
	 * Passes name and price to the overloaded constructor with four values. 
	 * Sets the bulk quantity and bulk price to be the equivalent of no bulk 
	 * discount being active.
	 * 
	 * @param name	the name of the Item being created
	 * @param price	the price of the Item being created without discount
	 */
	public Item(String name, double price) {
		this(name, price, 0, price);
	}
	/**
	 * Constructs an Item object instantiating the global variables name, price,
	 * bulkQty, and bulkPrice. Throws an exception if any of the numbers are 
	 * less than zero. 
	 * 
	 * @param name		the name of the Item being created
	 * @param price		the price of the Item being created without discount
	 * @param bulkQty	the number of items needed to be bought for a bulk discount to be active
	 * @param bulkPrice	the price of each item when the bulkQty condition is met
	 */
	public Item(String name, double price, int bulkQty, double bulkPrice) {
		if(price < 0.0 || bulkQty < 0 || bulkPrice < 0.0) {
			throw new IllegalArgumentException("error");
		}
		else {
			this.name = name;
			this.price = price;
			this.bulkQty = bulkQty;
			this.bulkPrice = bulkPrice;
		}		
	}
	/**
	 * Returns the cost of buying quantity number of this current Item
	 * 
	 * @param quantity	the number of this Item that are being bought
	 * @return			the price, after discounts, of buying quantity number of this Item 
	 */
	public double priceFor(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException("error");
		}
		else {
			if(quantity >= this.bulkQty) {
				return this.bulkPrice * quantity;
			}
			else {
				return this.price * quantity;
			}
		}
	}
	@Override
	/**
	 * Tests to see if two Objects are equal to each other.  
	 * 
	 * @param obj	the second object that is being compared to the current Item Object.	
	 * @return		true or false depending on if the names are the same between the two objects
	 */
	public boolean equals(Object obj) {
		Item other = (Item) obj;
		return this.name.equals(other.name);
	}
	@Override
	/**
	 * Return a String representation of this current Item Object
	 * 
	 * @return 	a String containing the name and the price separated by a comma and a space
	 */
	public String toString() {
		return this.name + ", $" + this.price;
	}
}
