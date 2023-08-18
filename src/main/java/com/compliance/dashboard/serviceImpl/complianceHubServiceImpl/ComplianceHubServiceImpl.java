package com.compliance.dashboard.serviceImpl.complianceHubServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.complianceController.ComplianceMasterResponse;
import com.compliance.dashboard.service.complianceHubService.ComplianceHubService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComplianceHubServiceImpl implements ComplianceHubService {

	@Override
	public List<ComplianceMasterResponse> getComplianceByBusinessActivity(String businessActivity) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Autowired
//    private ComplianceHubDao complianceHubDao;
//
//    @Autowired
//    private ResponseMapper responseMapper;

//    @Override
//    public List<ComplianceMasterResponse> findComplianceHubByBusinessActivity(String businessActivity) {
//        return this.complianceHubDao.findComplianceHubByBusinessActivity(businessActivity)
//        .stream().map(this::mapToComplianceMaster).collect(Collectors.toList());
//    }
//
//    private ComplianceMasterResponse mapToComplianceMaster(ComplianceHub complianceHub) {
//        return this.responseMapper.mapToComplianceMasterResponse(complianceHub);
//    }
}
