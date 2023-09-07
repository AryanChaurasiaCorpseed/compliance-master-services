package com.compliance.dashboard.service.businessActivityService;

import java.util.List;

import org.springframework.stereotype.Service;
import com.compliance.dashboard.response.*;

import com.compliance.dashboard.controller.businessActivityController.BusinessActivityRequest;
import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;

@Service
public interface BusinessActivityService {

	List<BusinessActivity> fetchAllBusinessActivity();

    BusinessActivity fetchBusinessActivityById(Long businessActivityId);

    boolean deleteBusinessActivityById(Long businessActivityId);

    List<BusinessActivity> searchBusinessActivity(String searchData);

    List<BusinessActivity> searchBusinessActivityBySubIndustryId(Long subIndustryId);

	BusinessActivity createBusinessActivity(String title, Long subIndustryId) throws Exception;

	Boolean updateBusinessActivity(Long baId, String title, Long subIndustryId);
}
