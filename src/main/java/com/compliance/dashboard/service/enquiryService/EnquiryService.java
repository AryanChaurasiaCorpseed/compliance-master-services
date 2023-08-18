package com.compliance.dashboard.service.enquiryService;

import org.springframework.http.ResponseEntity;

public interface EnquiryService {
   ResponseEntity saveComplianceEnquiry(Long complianceId, int status);
}
