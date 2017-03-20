package edu.mum.cs.waa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.InsurancePackage;
@Repository
public interface InsurancePackageRepository extends CrudRepository<InsurancePackage, Long> {

	/*//Add some custom implementations
	@Query("Select p from InsurancePackage p where p.id = :userId ")
	List<InsurancePackage> findInsurancePackageByUserId(long userId);*/

	
}
