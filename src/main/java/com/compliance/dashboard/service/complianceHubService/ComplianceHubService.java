package com.compliance.dashboard.service.complianceHubService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.complianceController.ComplianceMasterResponse;

@Service
public interface ComplianceHubService {

	List<ComplianceMasterResponse> getComplianceByBusinessActivity(String businessActivity);
}
