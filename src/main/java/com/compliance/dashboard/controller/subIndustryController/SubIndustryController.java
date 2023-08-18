package com.compliance.dashboard.controller.subIndustryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.service.subIndustryService.SubIndustryService;

@RestController
@CrossOrigin
@RequestMapping("/master/sub-industry")
public class SubIndustryController {

	@Autowired
	private SubIndustryService subIndustryService;
	
	@GetMapping()
	public ResponseEntity fetchAllSubIndustry(){
		return this.subIndustryService.fetchAllSubIndustry();
	}
	
	@PostMapping("/save")
	public ResponseEntity saveSubIndustry(@RequestBody SubIndustryRequest subIndustryRequest){
		return this.subIndustryService.saveSubIndustry(subIndustryRequest);
	}
	
	@PutMapping("/update")
	public ResponseEntity updateSubIndustry(@RequestBody SubIndustryRequest subIndustryRequest){
		return this.subIndustryService.updateSubIndustry(subIndustryRequest);
	}

	@GetMapping("/{industryId}")
	public ResponseEntity fetchSubIndustryByIndustry(@PathVariable("industryId") Long industryId){
		return this.subIndustryService.fetchSubIndustryByIndustry(industryId);
	}
	
	@GetMapping("/edit/{subIndustryId}")
	public ResponseEntity fetchSubIndustryById(@PathVariable("subIndustryId") Long subIndustryId){
		return this.subIndustryService.fetchSubIndustryById(subIndustryId);
	}

	@DeleteMapping("/{subIndustryId}")
	public ResponseEntity deleteSubIndustry(@PathVariable("subIndustryId") Long subIndustryId){
		return this.subIndustryService.deleteSubIndustryById(subIndustryId);
	}
}
