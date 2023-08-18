package com.compliance.dashboard.controller.enquiryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.service.enquiryService.EnquiryService;

@RestController
@RequestMapping("/master/enquiry")
public class EnquiryController {

    @Autowired
    private EnquiryService enquiryService;

    @PutMapping("/compliance/{complianceId}/{status}")
    public ResponseEntity saveComplianceEnquiry(@PathVariable("complianceId") Long complianceId,
                                                @PathVariable("status") int status){
        return this.enquiryService.saveComplianceEnquiry(complianceId,status);
    }
}
