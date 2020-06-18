

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String name;

	private String street;
	private Integer houseNumber;

	private Integer zipCode;

	private String city;

	private String district;

	private String country;

	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}

	public String getDistrict() {
		return this.district;
	}

	public Integer getHouseNumber() {
		return this.houseNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getStreet() {
		return this.street;
	}

	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public void setCountry(String value) {
		this.country = value;
	}

	public void setDistrict(String value) {
		this.district = value;
	}

	public void setHouseNumber(Integer value) {
		this.houseNumber = value;
	}

	public void setName(String value) {
		this.name = value;
	}

	public void setStreet(String value) {
		this.street = value;
	}

	public void setZipCode(Integer value) {
		this.zipCode = value;
	}
}
