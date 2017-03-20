package edu.mum.cs.waa.service;

import java.util.List;

import edu.mum.cs.waa.domain.Insurance;

public interface InsuranceService {
		
		//Insurance Basic Services
	
		//Add
		public void addInsurance(Insurance insurance);
		
		//findInsuranceById
		public Insurance findInsuranceById(long id);	
		
		//FindInsuranceByUserId	
		public List<Insurance> findInsuranceByUserId(long userId);
		
		//findAllInsurances	
		public List<Insurance> findAllInsurance();
		
		//Delete Insurance
		public void deleteInsurance(long id);
}
