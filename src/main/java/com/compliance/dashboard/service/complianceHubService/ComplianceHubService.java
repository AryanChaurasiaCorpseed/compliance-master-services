package com.compliance.dashboard.service.complianceHubService;
import java.util.List;

import com.compliance.dashboard.controller.complianceController.ComplianceMasterResponse;

public interface ComplianceHubService {
//    List<ComplianceMasterResponse> findComplianceHubByBusinessActivity(String businessActivity);

	List<ComplianceMasterResponse> getComplianceByBusinessActivity(String businessActivity);
}
