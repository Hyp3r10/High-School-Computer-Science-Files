

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Webshop {
	private Set<ProductCategory> offers;

	private String shopName;

	private String address;

	private Company company;

	public String getAddress() {
		return this.address;
	}

	@ManyToOne(optional = false)
	public Company getCompany() {
		return this.company;
	}

	@ManyToMany(mappedBy = "offeredBy")
	public Set<ProductCategory> getOffers() {
		return this.offers;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setAddress(String value) {
		this.address = value;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setOffers(Set<ProductCategory> offerss) {
		this.offers = offerss;
	}

	public void setShopName(String value) {
		this.shopName = value;
	}

}
