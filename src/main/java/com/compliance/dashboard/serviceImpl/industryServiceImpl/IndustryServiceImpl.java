package com.compliance.dashboard.serviceImpl.industryServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.industryController.IndustryRequest;
import com.compliance.dashboard.model.industryModel.Industry;
import com.compliance.dashboard.repository.IndustryRepository;
import com.compliance.dashboard.service.industryService.IndustryService;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class IndustryServiceImpl implements IndustryService {

	@Autowired
	IndustryRepository industryRepository;

	
	@Override
	public List<Industry> fetchAllIndustries() {
		return industryRepository.findAll();
	}

	@Override
	public Boolean deleteIndustryById(Long industryId) {
		Industry industry = industryRepository.findById(industryId).get();
		industry.setEnable(false);
		Industry i = industryRepository.save(industry);
		return true;
	}

	@Override
	public Industry fetchIndustryById(Long industryId) {
		Industry industry = industryRepository.findById(industryId).get();
		return industry;
	}

	@Override
	public Boolean updateIndustry(Long id,String name) {
		Industry industry = industryRepository.findById(id).get();	
		industry.setTitle(name);
		industry.setUpdatedAt(new Date());
		industryRepository.save(industry);
		return true;
	}

	@Override
	public Industry saveIndustry(String industryName) {
		Industry industry = new Industry();
		industry.setTitle(industryName);
		industry.setCreatedAt(new Date());
		industry.setEnable(true);
        industry.setUpdatedAt(new Date());
        industryRepository.save(industry);
		return industry;
	}

	
	
}
