package com.compliance.dashboard.service.subIndustryService;

import org.springframework.http.ResponseEntity;

import com.compliance.dashboard.controller.subIndustryController.SubIndustryRequest;

public interface SubIndustryService {

    ResponseEntity deleteSubIndustryById(Long subIndustryId);

    ResponseEntity fetchSubIndustryById(Long subIndustryId);

    ResponseEntity updateSubIndustry(SubIndustryRequest subIndustryRequest);

    ResponseEntity saveSubIndustry(SubIndustryRequest subIndustryRequest);

    ResponseEntity fetchAllSubIndustry();

    ResponseEntity fetchSubIndustryByIndustry(Long industryId);
}
