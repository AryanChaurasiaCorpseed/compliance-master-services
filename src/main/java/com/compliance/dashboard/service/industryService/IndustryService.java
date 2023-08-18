package com.compliance.dashboard.service.industryService;

import org.springframework.http.ResponseEntity;

import com.compliance.dashboard.controller.industryController.IndustryRequest;

public interface IndustryService {

	ResponseEntity fetchAllIndustries();

	ResponseEntity deleteIndustryById(Long industryId);

	ResponseEntity fetchIndustryById(Long industryId);

	ResponseEntity updateIndustry(IndustryRequest industryRequest);

	ResponseEntity saveIndustry(IndustryRequest industryRequest);
}
