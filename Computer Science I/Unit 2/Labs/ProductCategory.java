

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProductCategory {
	private Set<Webshop> offeredBy;

	private String categoryName;

	private Set<ProductCategory> subCategories;

	private ProductCategory parentCategory;

	private Set<Product> products;

	public String getCategoryName() {
		return this.categoryName;
	}

	@ManyToMany
	public Set<Webshop> getOfferedBy() {
		return this.offeredBy;
	}

	@ManyToOne(optional = false)
	public ProductCategory getParentCategory() {
		return this.parentCategory;
	}

	@ManyToMany
	public Set<Product> getProducts() {
		return this.products;
	}

	@OneToMany(mappedBy = "parentCategory", cascade = { CascadeType.ALL })
	public Set<ProductCategory> getSubCategories() {
		return this.subCategories;
	}

	public void setCategoryName(String value) {
		this.categoryName = value;
	}

	public void setOfferedBy(Set<Webshop> offeredBys) {
		this.offeredBy = offeredBys;
	}

	public void setParentCategory(ProductCategory parentCategory) {
		this.parentCategory = parentCategory;
	}

	public void setProducts(Set<Product> productss) {
		this.products = productss;
	}

	public void setSubCategories(Set<ProductCategory> subCategoriess) {
		this.subCategories = subCategoriess;
	}

}
