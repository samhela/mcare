package edu.mum.cs.waa.service;

import java.util.List;

import edu.mum.cs.waa.domain.InsurancePackage;

public interface InsurancePackageService {

	//Insurance Package Basic Services
	
		//Add
		public void addInsuracnepackage(InsurancePackage insurancePackage);
		
		//findByInsuranceId
		public InsurancePackage findInsurancePackage(long id);	
		
		//FindAInsurancePackageByUserId	
		public List<InsurancePackage> findInsurancePackageByUserId(long userId);
		
		//findAllInsurancePackage	
		public List<InsurancePackage> findAllInsurancePackage();
		
		//Delete InsurancePackage
		public void deleteInsurancePackage(long id);
}
