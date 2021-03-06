import java.util.*;
public class Perishable extends InventoryItem {
	private double price;
	private Date entryDate, expirationDate;	
	
	public Perishable(Date entryDate, double price, Date expirationDate) {
		super(entryDate, price);
		this.price = price;
		this.entryDate = entryDate;
		this.expirationDate = expirationDate;
	}
	public double getPrice() {
		if(expirationDate.compareTo(entryDate) < 0) {
			price *= 0.1;
		}
		return price;
	}
	
}
