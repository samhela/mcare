package edu.mum.cs.waa.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.domain.Address;
import edu.mum.cs.waa.repository.AddressRepository;
import edu.mum.cs.waa.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void addAddress(Address address) {
		
		try {
			addressRepository.save(address);
		} catch (Exception e) {
			// TODO: handle exception
			//Handle the exception here
			e.printStackTrace();
		}
	}

	@Override
	public Address findAddressById(long id) {
		
		try {
			Address address = (Address)addressRepository.findOne(id);
			return address;
		} catch (Exception e) {
			// TODO: handle exception
			//Handle the exception here
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Address> findAddressByUserId(long userId) {
		
		try {
			// Did not implemented on the Repository
			return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Address> findAllAddress() {
		try {
			List<Address> addresses = (List<Address>) addressRepository.findAll();
			return addresses;
		} catch (Exception e) {
			//Catch the error with handler
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteAddress(long id) {
		try {
			addressRepository.delete(id);
			System.out.println("Successfully deleted");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	

}
