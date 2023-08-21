package com.compliance.dashboard.service.industryService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.industryController.IndustryRequest;
@Service
public interface IndustryService {

	ResponseEntity fetchAllIndustries();

	ResponseEntity deleteIndustryById(Long industryId);

	ResponseEntity fetchIndustryById(Long industryId);

	ResponseEntity updateIndustry(IndustryRequest industryRequest);

	ResponseEntity saveIndustry(IndustryRequest industryRequest);
}
