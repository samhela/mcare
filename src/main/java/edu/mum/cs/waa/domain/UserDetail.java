package edu.mum.cs.waa.domain;

import java.time.LocalDate;
import java.util.List;

public class UserDetail {
	
	private long id;
	private Double annualIncome;
	private Integer age;
	private String maritalStatus;
	private String email;
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	
	private List<Address> addresses;
	private List<UserDependent> userDependents;
	private List<Insurance> insurances;
	
	
	
	

}
