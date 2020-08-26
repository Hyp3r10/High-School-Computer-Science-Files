package ShoppingCart;

import java.util.ArrayList;

/**
 * @author MatthewSheldon
 */
public class ShoppingCart {
	// a list of ItemOrder objects containing the current list of Items being bought
	ArrayList<ItemOrder> shoppingCart;
	/**
	 * Constructs a ShoppingCart object instantiating the global variable
	 * shoppingCart
	 */
	public ShoppingCart() {
		this.shoppingCart = new ArrayList<ItemOrder>();
	}
	/**
	 * Adds the ItemOrder object named newOrder to the shoppingCart list
	 * 
	 * @param newOrder	the ItemOrder object that is being added to the shoppingCart list
	 */
	public void add(ItemOrder newOrder) {
		if(this.shoppingCart.contains(newOrder)) {
			this.shoppingCart.remove(newOrder);
		}
		this.shoppingCart.add(newOrder);
	}
	/**
	 * Returns the total of all of the ItemOrder objects inside of the
	 * shopping cart list
	 * 
	 * @return	the total price of buying all items inside of the shopping cart list
	 */
	public double getTotal() {
		double total = 0.0;
		// adds all of the ItemOrder prices inside of shoppingCart together
		for(int i = 0; i < shoppingCart.size(); i++) {
			total += shoppingCart.get(i).getPrice();
		}
		return total;
	}
}
