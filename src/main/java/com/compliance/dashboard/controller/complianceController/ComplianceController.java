package com.compliance.dashboard.controller.complianceController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.service.complianceHubService.ComplianceHubService;


@RestController
@RequestMapping("/master/compliance")
public class ComplianceController {

    @Autowired
    private ComplianceHubService complianceHubService;

    @GetMapping("/by-activity")
    public List<ComplianceMasterResponse> getComplianceByBusinessActivity(@RequestParam("businessActivity") String businessActivity){
        System.out.println("compliance master fetch compliance called.........."+businessActivity);
        return this.complianceHubService.getComplianceByBusinessActivity(businessActivity);
    }
}
