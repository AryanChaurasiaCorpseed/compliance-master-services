package com.compliance.dashboard.controller.businessActivityController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;
import com.compliance.dashboard.response.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.service.businessActivityService.BusinessActivityService;

import jakarta.persistence.ManyToOne;

@RestController
@CrossOrigin
@RequestMapping("/master/business-activity")
public class BusinessActivityController {
		
	@Autowired
	private BusinessActivityService businessActivityService;

	@GetMapping("/getAllBusiness")
	public List<BusinessActivity> fetchAllBusinessActivity(){
		return this.businessActivityService.fetchAllBusinessActivity();
	}

	@PostMapping("/createBusinessActivity")
	public BusinessActivity createBusinessActivity(@RequestParam String title ,@RequestParam Long subIndustryId) throws Exception{
		return this.businessActivityService.createBusinessActivity(title,subIndustryId);
	}
	
	@PutMapping("/updateBusinessActivity")
	public Boolean updateBusinessActivity(@RequestParam Long baId,@RequestParam String title ,@RequestParam Long subIndustryId){
		return this.businessActivityService.updateBusinessActivity(baId,title,subIndustryId);
	}
	
	@GetMapping("/getBusinessActivityById")
	public BusinessActivity getBusinessActivityById(@RequestParam Long businessActivityId){
		return this.businessActivityService.fetchBusinessActivityById(businessActivityId);
	}

	@DeleteMapping("/deleteBusinessActivity")
	public boolean deleteBusinessActivity(@RequestParam Long businessActivityId){
		return this.businessActivityService.deleteBusinessActivityById(businessActivityId);
	}
	
	@GetMapping("/search/{searchData}")
	public List<BusinessActivity> searchBusinessActivity(@PathVariable("searchData") String searchData){
		return this.businessActivityService.searchBusinessActivity(searchData);
	}
	
	@GetMapping("/searchBusinessActivityBySubIndustry")
	public List<BusinessActivity> searchBusinessActivityBySubIndustry(@RequestParam Long subIndustryId){
		return this.businessActivityService.searchBusinessActivityBySubIndustryId(subIndustryId);
	}
}
