package edu.mum.cs.waa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HealthFacility implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3418261888039156767L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String location;
	
	private List<Address> addresses;
	private List<Physician> physicians;
	
	//private List<>
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Physician> getPhysicians() {
		return physicians;
	}
	public void setPhysicians(List<Physician> physicians) {
		this.physicians = physicians;
	}
	
	
	
		

}
