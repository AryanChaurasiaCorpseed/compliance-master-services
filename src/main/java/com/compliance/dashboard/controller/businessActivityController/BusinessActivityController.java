package com.compliance.dashboard.controller.businessActivityController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.compliance.dashboard.response.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.service.businessActivityService.BusinessActivityService;

@RestController
@CrossOrigin
@RequestMapping("/master/business-activity")
public class BusinessActivityController {
		
	@Autowired
	private BusinessActivityService businessActivityService;

	@GetMapping("/getAllBusiness")
	public ResponseEntity fetchAllBusinessActivity(){
		return this.businessActivityService.fetchAllBusinessActivity();
	}
	
	@PostMapping("/save")
	public ResponseEntity saveBusinessActivity( @RequestBody BusinessActivityRequest baRequest){
		return this.businessActivityService.saveBusinessActivity(baRequest);
	}
	
	@PutMapping("/update")
	public ResponseEntity updateBusinessActivity( @RequestBody BusinessActivityRequest baRequest){
		return this.businessActivityService.updateBusinessActivity(baRequest);
	}
	
	@GetMapping("/{businessActivityId}")
	public ResponseEntity fetchBusinessActivityById(@PathVariable("businessActivityId") Long businessActivityId){
		return this.businessActivityService.fetchBusinessActivityById(businessActivityId);
	}

	@DeleteMapping("/{businessActivityId}")
	public ResponseEntity deleteBusinessActivity(@PathVariable("id") Long businessActivityId){
		return this.businessActivityService.deleteBusinessActivityById(businessActivityId);
	}
	
	@GetMapping("/search/{searchData}")
	public ResponseEntity searchBusinessActivity(@PathVariable("searchData") String searchData){

		return this.businessActivityService.searchBusinessActivity(searchData);
	}
	
	@GetMapping("/list/{subIndustryId}")
	public ResponseEntity searchBusinessActivityBySubIndustry(@PathVariable("subIndustryId") Long subIndustryId){
		return this.businessActivityService.searchBusinessActivityBySubIndustryId(subIndustryId);
	}
}
