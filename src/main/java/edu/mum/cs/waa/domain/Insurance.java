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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Insurance implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7748563917653559670L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotEmpty
	private String insuranceName;//name of insurance company
	@NotEmpty
	private String description;
	
	@Valid
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private List<Address>addresses;
	
	@Valid
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="Insurance")
	private List<HealthFacility> hospitals;
	
	@Valid
	@
	private List<InsurancePackage> insurancePackages;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getInsuranceName() {
		return insuranceName;
	}


	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public List<HealthFacility> getHospitals() {
		return hospitals;
	}


	public void setHospitals(List<HealthFacility> hospitals) {
		this.hospitals = hospitals;
	}


	public List<InsurancePackage> getInsurancePackages() {
		return insurancePackages;
	}


	public void setInsurancePackages(List<InsurancePackage> insurancePackages) {
		this.insurancePackages = insurancePackages;
	}


	@Override
	public String toString() {
		return "Insurance [addresses=" + addresses + ", description=" + description + ", hospitals=" + hospitals
				+ ", id=" + id + ", insuranceName=" + insuranceName + ", insurancePackages=" + insurancePackages + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((hospitals == null) ? 0 : hospitals.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((insuranceName == null) ? 0 : insuranceName.hashCode());
		result = prime * result + ((insurancePackages == null) ? 0 : insurancePackages.hashCode());
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
		Insurance other = (Insurance) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (hospitals == null) {
			if (other.hospitals != null)
				return false;
		} else if (!hospitals.equals(other.hospitals))
			return false;
		if (id != other.id)
			return false;
		if (insuranceName == null) {
			if (other.insuranceName != null)
				return false;
		} else if (!insuranceName.equals(other.insuranceName))
			return false;
		if (insurancePackages == null) {
			if (other.insurancePackages != null)
				return false;
		} else if (!insurancePackages.equals(other.insurancePackages))
			return false;
		return true;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
