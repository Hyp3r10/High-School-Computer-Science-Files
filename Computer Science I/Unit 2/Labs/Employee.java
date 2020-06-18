

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "EMP_ID" }) })
@AttributeOverrides( {
		@AttributeOverride(name = "age", column = @Column(name = "EMP_AGE")),
		@AttributeOverride(name = "name", column = @Column(name = "EMP_NAME")) })
public class Employee extends Person {
	private long employeeId;

	private Boolean onVacation;

	private Company employer;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		final Employee rhs = (Employee) obj;
		final EqualsBuilder builder = new EqualsBuilder();
		builder.appendSuper(super.equals(rhs));
		builder.append(employeeId, rhs.employeeId);
		return builder.isEquals();
	}

	@Column(name = "EMP_ID")
	@Id
	public long getEmployeeId() {
		return this.employeeId;
	}

	@ManyToOne
	public Company getEmployer() {
		return this.employer;
	}

	public Boolean getOnVacation() {
		return this.onVacation;
	}

	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		builder.appendSuper(super.hashCode());
		builder.append(employeeId);
		builder.append(onVacation);
		return builder.toHashCode();
	}

	public void setEmployeeId(long value) {
		this.employeeId = value;
	}

	public void setEmployer(Company employer) {
		this.employer = employer;
	}

	public void setOnVacation(Boolean value) {
		this.onVacation = value;
	}

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.appendSuper(super.toString());
		builder.append(employeeId);
		builder.append(onVacation);
		return builder.toString();
	}

	public void work(Integer hours) {
		// TODO implement this operation
		throw new UnsupportedOperationException("not implemented");
	}
}
