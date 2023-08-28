package com.compliance.dashboard.service.subIndustryService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.subIndustryController.SubIndustryRequest;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;
@Service
public interface SubIndustryService {

    ResponseEntity deleteSubIndustryById(Long subIndustryId);

    SubIndustry fetchSubIndustryById(Long subIndustryId);

    SubIndustry updateSubIndustry(SubIndustryRequest subIndustryRequest);

    ResponseEntity saveSubIndustry(SubIndustryRequest subIndustryRequest);

    ResponseEntity fetchAllSubIndustry();

    ResponseEntity fetchSubIndustryByIndustry(Long industryId);
}
