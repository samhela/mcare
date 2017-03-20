package edu.mum.cs.waa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.InsurancePackage;
@Repository
public interface InsurancePackageRepository extends CrudRepository<InsurancePackage, Long> {

	//Add some custom implementations
}
