

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ShoppingCart {
	private long cartId;

	private Customer customer;

	private Set<Product> products;

	public long getCartId() {
		return this.cartId;
	}

	@OneToOne(mappedBy = "shoppingCart", optional = false)
	public Customer getCustomer() {
		return this.customer;
	}

	@OneToMany(mappedBy = "shoppingCart")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setCartId(long value) {
		this.cartId = value;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setProducts(Set<Product> productss) {
		this.products = productss;
	}

}
