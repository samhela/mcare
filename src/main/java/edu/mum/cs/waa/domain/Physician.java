package edu.mum.cs.waa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Physician implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1916567031609139088L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty
	@Size(min = 4, max = 20, message = "{Physician.validation.firstName}")
	private String firstName;

	@NotEmpty
	@Size(min = 4, max = 20, message = "{Physician.validation.lastName}")
	private String lastName;

	@NotEmpty
	@Size(min = 4, max = 20, message = "{Physician.validation.specialization}")
	private String specialization;
	
	@Valid
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Physician_HealthFacility", 
					joinColumns = @JoinColumn(name = "physician_Id"), 
						inverseJoinColumns = @JoinColumn(name = "healthFacility_Id"))
	private List<HealthFacility> healthFacilities;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		specialization = specialization;
	}

	public List<HealthFacility> getHealthFacilities() {
		return healthFacilities;
	}

	public void setHealthFacilities(List<HealthFacility> healthFacilities) {
		this.healthFacilities = healthFacilities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((healthFacilities == null) ? 0 : healthFacilities.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Physician other = (Physician) obj;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (healthFacilities == null) {
			if (other.healthFacilities != null)
				return false;
		} else if (!healthFacilities.equals(other.healthFacilities))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
