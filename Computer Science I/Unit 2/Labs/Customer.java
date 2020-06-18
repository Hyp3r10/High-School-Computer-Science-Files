

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "CUST_ID" }) })
public class Customer extends Person {
	private long customerId;

	private Set<Company> companies;

	private ShoppingCart shoppingCart;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		final Customer rhs = (Customer) obj;
		final EqualsBuilder builder = new EqualsBuilder();
		builder.appendSuper(super.equals(rhs));
		builder.append(customerId, rhs.customerId);
		return builder.isEquals();
	}

	@ManyToMany(mappedBy = "customers")
	public Set<Company> getCompanies() {
		return this.companies;
	}

	@Column(name = "CUST_ID")
	@Id
	public long getCustomerId() {
		return this.customerId;
	}

	@OneToOne(optional = false)
	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		builder.appendSuper(super.hashCode());
		builder.append(customerId);
		return builder.toHashCode();
	}

	public void setCompanies(Set<Company> companiess) {
		this.companies = companiess;
	}

	public void setCustomerId(long value) {
		this.customerId = value;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.appendSuper(super.toString());
		builder.append(customerId);
		return builder.toString();
	}
}
