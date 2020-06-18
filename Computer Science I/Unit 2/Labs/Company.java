

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
public class Company {

	private Set<Employee> employees;

	private String companyName;

	private Set<Customer> customers;

	private Set<Webshop> webshops;

	private Address address;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Company) {
			final Company other = (Company) obj;
			if (ObjectUtils.equals(companyName, other.companyName) == false)
				return false;
			return true;
		}
		return false;
	}

	@Embedded
	public Address getAddress() {
		return this.address;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	@ManyToMany
	public Set<Customer> getCustomers() {
		return this.customers;
	}

	@OneToMany(mappedBy = "employer")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	@OneToMany(mappedBy = "company")
	public Set<Webshop> getWebshops() {
		return this.webshops;
	}

	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		if (companyName != null)
			builder.append(companyName);
		return builder.toHashCode();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCompanyName(String value) {
		this.companyName = value;
	}

	public void setCustomers(Set<Customer> customerss) {
		this.customers = customerss;
	}

	public void setEmployees(Set<Employee> employeess) {
		this.employees = employeess;
	}

	public void setWebshops(Set<Webshop> webshopss) {
		this.webshops = webshopss;
	}

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(companyName);
		return builder.toString();
	}

}
