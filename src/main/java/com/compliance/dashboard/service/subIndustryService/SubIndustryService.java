package com.compliance.dashboard.service.subIndustryService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.subIndustryController.SubIndustryRequest;
import com.compliance.dashboard.model.industryModel.Industry;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;
@Service
public interface SubIndustryService {

    SubIndustry deleteSubIndustryById(Long subIndustryId);

    SubIndustry fetchSubIndustryById(Long subIndustryId);

    List<SubIndustry> fetchAllSubIndustry();

    Industry fetchSubIndustryByIndustry(Long industryId);

	SubIndustry createSubIndustry(Long industryId, String name) throws Exception;

	SubIndustry updateSubIndustry(String name, Long id);
}
