

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person implements Human {
	private Address address;

	private String name;

	private int age;

	private String gender;

	@Embedded
	@AttributeOverride(name = "name", column = @Column(name = "ADDR_NAME"))
	public Address getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAge(int value) {
		this.age = value;
	}

	public void setGender(String value) {
		this.gender = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}
