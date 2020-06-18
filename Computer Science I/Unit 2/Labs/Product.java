

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
public class Product {
	private long productId;

	private String description;

	private String labelling;

	private double price;

	private ShoppingCart shoppingCart;

	private Set<ProductCategory> category;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		final Product rhs = (Product) obj;
		final EqualsBuilder builder = new EqualsBuilder();
		builder.append(productId, rhs.productId);
		return builder.isEquals();
	}

	@ManyToMany(mappedBy = "products")
	public Set<ProductCategory> getCategory() {
		return this.category;
	}

	public String getDescription() {
		return this.description;
	}

	public String getLabelling() {
		return this.labelling;
	}

	public double getPrice() {
		return this.price;
	}

	@Id
	public long getProductId() {
		return this.productId;
	}

	@ManyToOne(optional = false)
	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(productId);
		return builder.toHashCode();
	}

	public void setCategory(Set<ProductCategory> categorys) {
		this.category = categorys;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public void setLabelling(String value) {
		this.labelling = value;
	}

	public void setPrice(double value) {
		this.price = value;
	}

	public void setProductId(long value) {
		this.productId = value;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(description);
		builder.append(labelling);
		builder.append(price);
		return builder.toString();
	}

}
