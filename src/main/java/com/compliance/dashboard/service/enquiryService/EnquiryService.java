package com.compliance.dashboard.service.enquiryService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EnquiryService {
   ResponseEntity saveComplianceEnquiry(Long complianceId, int status);
}
