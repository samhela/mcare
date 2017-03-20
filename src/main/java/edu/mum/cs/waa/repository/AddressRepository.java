package edu.mum.cs.waa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

	//find specific user by USER ID, just to check

}
