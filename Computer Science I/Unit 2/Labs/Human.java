

import javax.persistence.Entity;

@Entity
public interface Human {
	public int getAge();

	public String getGender();

	public String getName();

	public void setAge(int value);

	public void setGender(String value);

	public void setName(String value);
}
