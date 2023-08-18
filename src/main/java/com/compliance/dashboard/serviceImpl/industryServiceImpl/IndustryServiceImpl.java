package com.compliance.dashboard.serviceImpl.industryServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.industryController.IndustryRequest;
import com.compliance.dashboard.service.industryService.IndustryService;

import java.util.List;


@Service
public class IndustryServiceImpl implements IndustryService {

	@Override
	public ResponseEntity fetchAllIndustries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity deleteIndustryById(Long industryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity fetchIndustryById(Long industryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity updateIndustry(IndustryRequest industryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity saveIndustry(IndustryRequest industryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Autowired
//	private IndustryDao industryDao;
//
//	@Override
//	public ResponseEntity fetchAllIndustries() {
//		List<Industry> industries = this.industryDao.fetchAllIndustry();
//		if(industries.isEmpty())
//			return new ResponseEntity().noContent();
//
//		return new ResponseEntity().ok(industries.stream().map(this::mapToResponse));
//	}
//
//	private IndustryResponse mapToResponse(Industry industry) {
//		return IndustryResponse.builder().id(industry.getId())
//				.title(industry.getTitle())
//				.isEnable(industry.isEnable()).build();
//	}
//
//	@Override
//	public ResponseEntity deleteIndustryById(Long industryId) {
//		Industry industry=this.industryDao.fetchIndustryById(industryId);
//		if(industry==null)
//			return new ResponseEntity().badRequest("Industry Not Found !!");
//
//		boolean deleteFlag=this.industryDao.deleteIndustry(industry);
//
//		if(!deleteFlag)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity fetchIndustryById(Long industryId) {
//		Industry industry=this.industryDao.fetchIndustryById(industryId);
//		if(industry==null)
//			return new ResponseEntity().badRequest("Industry Not Found !!");
//
//		return new ResponseEntity().ok(mapToResponse(industry));
//	}
//
//	@Override
//	public ResponseEntity updateIndustry(IndustryRequest industryRequest) {
//		Industry findIndustry=this.industryDao.findIndustryByTitleAndIdNot(industryRequest.getTitle(),industryRequest.getId());
//		if(findIndustry!=null)
//			return new ResponseEntity().badRequest("Industry already exist !!");
//
//		Industry updateIndustry=this.industryDao.updateIndustry(Industry.builder().id(industryRequest.getId())
//				.title(industryRequest.getTitle())
//				.isEnable(industryRequest.isEnable()).build());
//
//		if(updateIndustry==null)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity saveIndustry(IndustryRequest industryRequest) {
//		Industry findIndustry=this.industryDao.findIndustryByTitle(industryRequest.getTitle());
//		if(findIndustry!=null)
//			return new ResponseEntity().badRequest("Industry already exist !!");
//
//		Industry saveIndustry=this.industryDao.saveIndustry(Industry.builder().title(industryRequest.getTitle()).createdAt(CommonUtil.getDate())
//				.isEnable(true).build());
//
//		if(saveIndustry==null)
//			return new ResponseEntity().internalServerError();
//		return new ResponseEntity().ok();
//	}
	
	
}
