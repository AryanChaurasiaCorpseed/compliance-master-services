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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.model.industryModel.Industry;
import com.compliance.dashboard.service.industryService.IndustryService;

@RestController
@CrossOrigin
@RequestMapping("/master/industry")
public class IndustryController {

	@Autowired
	private IndustryService industryService;
	
	@GetMapping("/getAll")
	public List<Industry> allIndustry(){
		return this.industryService.fetchAllIndustries();
	}
	
	@PostMapping("/createIndustry")
	public Industry saveIndustry(@RequestParam String industryName){
		return this.industryService.saveIndustry(industryName);
	}
	
	@PutMapping("/update")
	public Boolean updateIndustry( @RequestParam Long id,@RequestParam String name){
		return this.industryService.updateIndustry(id,name);
	}
	
	@GetMapping("/getById")
	public Industry fetchIndustry(@RequestParam Long industryId){
		return this.industryService.fetchIndustryById(industryId);
	}

	@DeleteMapping("/deleteIndustry")
	public Boolean deleteIndustry(@RequestParam Long industryId){
		return this.industryService.deleteIndustryById(industryId);
	}
}
