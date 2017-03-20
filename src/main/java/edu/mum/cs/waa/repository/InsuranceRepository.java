package edu.mum.cs.waa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.Insurance;
@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long> {

	@Query("select i from Insurance i where i.id = :userId  ")
	public List<Insurance> findInsuranceByUserId(@Param("userId")long userId);

}
