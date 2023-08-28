package com.compliance.dashboard.controller.industryController;

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
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.model.industryModel.Industry;
import com.compliance.dashboard.service.industryService.IndustryService;

@RestController
@CrossOrigin
@RequestMapping("/master/industry")
public class IndustryController {

	@Autowired
	private IndustryService industryService;
	
	@GetMapping()
	public List<Industry> allIndustry(){
		return this.industryService.fetchAllIndustries();
	}
	
	@PostMapping("/save")
	public ResponseEntity saveIndustry(@RequestBody IndustryRequest industryRequest){
		return this.industryService.saveIndustry(industryRequest);
	}
	
	@PutMapping("/update")
	public Boolean updateIndustry( @RequestBody IndustryRequest industryRequest){
		return this.industryService.updateIndustry(industryRequest);
	}
	
	@GetMapping("/{industryId}")
	public Industry fetchIndustry(@PathVariable("industryId") Long industryId){
		return this.industryService.fetchIndustryById(industryId);
	}

	@DeleteMapping("/{industryId}")
	public Boolean deleteIndustry(@PathVariable("industryId") Long industryId){
		return this.industryService.deleteIndustryById(industryId);
	}
}
