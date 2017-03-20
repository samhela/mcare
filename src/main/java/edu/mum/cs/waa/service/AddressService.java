package edu.mum.cs.waa.service;

import java.util.List;

import edu.mum.cs.waa.domain.Address;

public interface AddressService {

	//Address Basic Services
	
	//Add
	public void addAddress(Address address);
	
	//FindAddressById
	public Address findAddressById(long id);	
	
	//FindAddressByUserId	
	public List<Address> findAddressByUserId(long userId);
	
	//findAllAddress	
	public List<Address> findAllAddress();
	
	//Delete Address
	public void deleteAddress(long id);
	
}
