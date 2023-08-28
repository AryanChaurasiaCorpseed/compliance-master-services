package com.compliance.dashboard.service.industryService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.industryController.IndustryRequest;
import com.compliance.dashboard.model.industryModel.Industry;
@Service
public interface IndustryService {

	List<Industry> fetchAllIndustries();

	Boolean deleteIndustryById(Long industryId);

	Industry fetchIndustryById(Long industryId);

	Boolean updateIndustry(IndustryRequest industryRequest);

	ResponseEntity saveIndustry(IndustryRequest industryRequest);
}
