package edu.mum.cs.waa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.cs.waa.domain.Insurance;
import edu.mum.cs.waa.domain.InsurancePackage;
import edu.mum.cs.waa.service.InsurancePackageService;
import edu.mum.cs.waa.service.InsuranceService;

@Controller
@RequestMapping("/insurance")
public class InsuranceController {

	@Autowired
	InsuranceService insuranceService;

	@Autowired
	InsurancePackageService insurancePackageService;

	// List Insurance
	@RequestMapping(value = { "/", "/listInsurances" }, method = RequestMethod.GET)
	public String listInsurance(Model model) {
		try {
			List<Insurance> insurances = insuranceService.findAllInsurance();
			model.addAttribute("insurances", insurances);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "insurance/listInsurances";
	}

	// show Add form Insurance
	@RequestMapping(value = { "/addInsurance" }, method = RequestMethod.GET)
	public String showAddInsuranceForm() {
		return "insurance/addInsurance";
	}

	// show Add form Insurance
	@RequestMapping(value = { "/addInsurance" }, method = RequestMethod.POST)
	public String addInsurance(@Valid @ModelAttribute("insurance") Insurance insurance, BindingResult result,
			RedirectAttributes redirectAttributes) {
		try {
			if (!result.hasErrors()) {
				redirectAttributes.addFlashAttribute("insurance", insurance);
				return "redirect:/listInsurances";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "insurance/addInsurance";
	}

	// Edit Insurance Information

	// Delete Insurance Information
	/*
	 * ***********************************************************
	 */
	/* INSURANCE PACKAGE RELATED STARTS HERE */
	/*
	 * ************************************************************
	 */
	// List Insurance Package as a JSON
	@RequestMapping(value = "/insurance/insurancePackages", method = RequestMethod.GET, 
			produces = {"application/json" })
	@ResponseBody
	public List<InsurancePackage> listInsurancePackages() {
		List<InsurancePackage> insurancePackages = (List<InsurancePackage>) insurancePackageService
				.findAllInsurancePackage();
		return insurancePackages;
	}
	// CRUDE Insurance Package

	// Show add new Insurance Package form
	@RequestMapping(value = { "/insurance/addInsurancePackage" }, method = RequestMethod.GET)
	public String showAddInsurancePackageForm() {
		return "insurance/addInsurancePackage";
	}

	// recive JSON object and process it
	@RequestMapping(value = { "/insurance/addInsurancePackage" }, method = RequestMethod.POST)
	public @ResponseBody String addInsurancePackageForm(@Valid @RequestBody InsurancePackage insurancePackage,
			Model model) {
		try {
			insurancePackageService.addInsuracnepackage(insurancePackage);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "insurance/addInsurancePackage";
	}

}
