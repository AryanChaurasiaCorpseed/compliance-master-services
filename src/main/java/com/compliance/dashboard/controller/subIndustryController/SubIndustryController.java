package com.compliance.dashboard.controller.subIndustryController;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.model.industryModel.Industry;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;
import com.compliance.dashboard.service.subIndustryService.SubIndustryService;

@RestController
@CrossOrigin
@RequestMapping("/master/sub-industry")
public class SubIndustryController {

	@Autowired
	private SubIndustryService subIndustryService;
	
	@GetMapping("/getAllSubIndustry")
	public List<SubIndustry> fetchAllSubIndustry(){
		return this.subIndustryService.fetchAllSubIndustry();
	}
	
	@PostMapping("/createSubIndustry")
	public SubIndustry createSubIndustry(@RequestParam
			Long industryId,@RequestParam String name) throws Exception{
		return this.subIndustryService.createSubIndustry(industryId,name);
	}
	
	@PutMapping("/updateSubIndustry")
	public SubIndustry updateSubIndustry(@RequestParam String subIndustryName, @RequestParam Long id){
		return this.subIndustryService.updateSubIndustry(subIndustryName,id);
	}

	@GetMapping("/getSubIndustryByIndustryId")
	public Industry fetchSubIndustryByIndustry(@RequestParam Long industryId){
		return this.subIndustryService.fetchSubIndustryByIndustry(industryId);
	}
	
	@GetMapping("/editSubIndustry")
	public SubIndustry fetchSubIndustryById(@RequestParam Long subIndustryId){
		return this.subIndustryService.fetchSubIndustryById(subIndustryId);
	}

	@DeleteMapping("/deleteSubIndustry")
	public SubIndustry deleteSubIndustry(@RequestParam Long subIndustryId){
		return this.subIndustryService.deleteSubIndustryById(subIndustryId);
	}
}
