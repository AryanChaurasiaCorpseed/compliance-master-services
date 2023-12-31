package com.compliance.dashboard.service.businessActivityService;

import java.util.List;

import org.springframework.stereotype.Service;
import com.compliance.dashboard.response.*;

import com.compliance.dashboard.controller.businessActivityController.BusinessActivityRequest;
import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;

@Service
public interface BusinessActivityService {

	ResponseEntity fetchAllBusinessActivity();

	ResponseEntity saveBusinessActivity(BusinessActivityRequest baRequest);

    ResponseEntity updateBusinessActivity(BusinessActivityRequest baRequest);

    BusinessActivity fetchBusinessActivityById(Long businessActivityId);

    boolean deleteBusinessActivityById(Long businessActivityId);

    List<BusinessActivity> searchBusinessActivity(String searchData);

    ResponseEntity searchBusinessActivityBySubIndustryId(Long subIndustryId);
}
