package edu.mum.cs.waa.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.domain.InsurancePackage;
import edu.mum.cs.waa.repository.InsurancePackageRepository;
import edu.mum.cs.waa.service.InsurancePackageService;
@Service
@Transactional
public class InsurancePackageServiceImpl implements InsurancePackageService{

	@Autowired
	InsurancePackageRepository insurancePackageRepository;
	
	@Override
	public void addInsuracnepackage(InsurancePackage insurancePackage) {
		try {
			insurancePackageRepository.save(insurancePackage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public InsurancePackage findInsurancePackage(long id) {
		try {
			InsurancePackage insurancePackage = insurancePackageRepository.findOne(id);
			return insurancePackage;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<InsurancePackage> findInsurancePackageByUserId(long userId) {
		try {
			List<InsurancePackage> insurancePackages = (List<InsurancePackage>) insurancePackageRepository.findAll();
			return insurancePackages;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<InsurancePackage> findAllInsurancePackage() {
		//It is not implemented again .....hahaha
		return null;
	}

	@Override
	public void deleteInsurancePackage(long id) {
		try {
			insurancePackageRepository.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
