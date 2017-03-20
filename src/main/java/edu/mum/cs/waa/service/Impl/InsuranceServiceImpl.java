package edu.mum.cs.waa.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.domain.Insurance;
import edu.mum.cs.waa.repository.InsuranceRepository;
import edu.mum.cs.waa.service.InsuranceService;
@Service
@Transactional
public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	InsuranceRepository insuranceRepository;
	
	@Override
	public void addInsurance(Insurance insurance) {
		try {
			insuranceRepository.save(insurance);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public Insurance findInsuranceById(long id) {
		try {
			Insurance insurance = insuranceRepository.findOne(id);
			return insurance;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Insurance> findInsuranceByUserId(long userId) {
		// The implementation is not done on the RepositoryImplementation
		// lol
		return null;
	}

	@Override
	public List<Insurance> findAllInsurance() {
		try {
			List<Insurance> insurances = (List<Insurance>) insuranceRepository.findAll();
			return insurances;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteInsurance(long id) {
		try {
			insuranceRepository.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
