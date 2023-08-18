package com.compliance.dashboard.service.businessActivityService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.businessActivityController.BusinessActivityRequest;

@Service
public interface BusinessActivityService {

    ResponseEntity fetchAllBusinessActivity();

    ResponseEntity saveBusinessActivity(BusinessActivityRequest baRequest);

    ResponseEntity updateBusinessActivity(BusinessActivityRequest baRequest);

    ResponseEntity fetchBusinessActivityById(Long businessActivityId);

    ResponseEntity deleteBusinessActivityById(Long businessActivityId);

    ResponseEntity searchBusinessActivity(String searchData);

    ResponseEntity searchBusinessActivityBySubIndustryId(Long subIndustryId);
}
