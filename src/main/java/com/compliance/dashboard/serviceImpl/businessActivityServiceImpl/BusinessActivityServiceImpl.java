package com.compliance.dashboard.serviceImpl.businessActivityServiceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import com.compliance.dashboard.response.*;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.businessActivityController.BusinessActivityRequest;
import com.compliance.dashboard.repository.BusinessActivityRepository;
import com.compliance.dashboard.service.businessActivityService.BusinessActivityService;
import java.util.List;
import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;

@Service
public class BusinessActivityServiceImpl implements BusinessActivityService {
//
	@Autowired
	private BusinessActivityRepository businessActivityRepository;
//
//	@Autowired
//	private SubIndustryDao subIndustryDao;
//
//	@Autowired
//	private ResponseMapper responseMapper;
	
//	@Override
//	public ResponseEntity fetchAllBusinessActivity() {
//		List<BusinessActivity> businessActivityList=this.businessActivityDao.fetchAllBusinessActivity();
//		if(businessActivityList.isEmpty())
//			return new ResponseEntity().noContent();
//
//		return new ResponseEntity().ok(businessActivityList.stream().map(this::mapToBusinessActivityResponse));
//	}
	

	@Override
	public ResponseEntity fetchAllBusinessActivity() {
		List<BusinessActivity> res=businessActivityRepository.findAll();	
		if(res.isEmpty()) {
		      return new ResponseEntity().noContent();
		}
	     return new ResponseEntity().ok(res.stream().map(this::mapToBusinessActivityResponse));
      }

//	
//	public ResponseEntity saveBusinessActivity(BusinessActivityRequest baRequest) {
//		BusinessActivity findBusinessActivity=this.businessActivityDao.
//				findBusinessActivityBySubIndustryAndTitle(baRequest.getSubIndustry(),
//						baRequest.getTitle());
//
//		if(findBusinessActivity!=null)
//			return new ResponseEntity().badRequest("Business Activity already exist !!");
//
//		BusinessActivity saveBusinessActivity=this.businessActivityDao.saveBusinessActivity(this.responseMapper.mapToSaveBusinessActivity(baRequest));
//
//		if(saveBusinessActivity==null)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}

	@Override
	public ResponseEntity saveBusinessActivity(BusinessActivityRequest baRequest) {
		// TODO Auto-generated method stub
		BusinessActivity findBusinessActivity=null;
//		BusinessActivity findBusinessActivity=businessActivityRepository.findAllBySubIndustrtryIdAndTitle(baRequest.getSubIndustry().getId(),baRequest.getTitle());
		if(findBusinessActivity!=null){
			return new ResponseEntity().badRequest("Business Activity already exist !!");
		}
//		BusinessActivity saveBusinessActivity=this.businessActivityDao.saveBusinessActivity(this.responseMapper.mapToSaveBusinessActivity(baRequest));
        
		BusinessActivity businessActivity = new BusinessActivity();
		businessActivity.setTitle(baRequest.getTitle());
//		businessActivity.setSubIndustry(baRequest.getSubIndustry());
		businessActivity.setEnable(true);
		BusinessActivity saveBusinessActivity = businessActivityRepository.save(businessActivity);
		if(saveBusinessActivity==null) {
			return new ResponseEntity().internalServerError();
		}
		return new ResponseEntity().ok();
	}

	@Override
	public ResponseEntity updateBusinessActivity(BusinessActivityRequest baRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity fetchBusinessActivityById(Long businessActivityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity deleteBusinessActivityById(Long businessActivityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity searchBusinessActivity(String searchData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity searchBusinessActivityBySubIndustryId(Long subIndustryId) {
		// TODO Auto-generated method stub
		return null;
	}

	private <R> R mapToBusinessActivityResponse(BusinessActivity businessactivity1) {
		return null;
	}

//	@Override
//	public ResponseEntity fetchAllBusinessActivity() {
//		List<BusinessActivity> businessActivityList=this.businessActivityDao.fetchAllBusinessActivity();
//		if(businessActivityList.isEmpty())
//			return new ResponseEntity().noContent();
//
//		return new ResponseEntity().ok(businessActivityList.stream().map(this::mapToBusinessActivityResponse));
//	}
//
//	private BusinessActivityResponse mapToBusinessActivityResponse(BusinessActivity ba) {
//		return this.responseMapper.mapToBusinessActivityResponse(ba);
//	}
//
//	@Override
//	public ResponseEntity saveBusinessActivity(BusinessActivityRequest baRequest) {
//		BusinessActivity findBusinessActivity=this.businessActivityDao.
//				findBusinessActivityBySubIndustryAndTitle(baRequest.getSubIndustry(),
//						baRequest.getTitle());
//
//		if(findBusinessActivity!=null)
//			return new ResponseEntity().badRequest("Business Activity already exist !!");
//
//		BusinessActivity saveBusinessActivity=this.businessActivityDao.saveBusinessActivity(this.responseMapper.mapToSaveBusinessActivity(baRequest));
//
//		if(saveBusinessActivity==null)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity updateBusinessActivity(BusinessActivityRequest baRequest) {
//		BusinessActivity findBusinessActivity=this.businessActivityDao.
//				findBusinessActivityBySubIndustryAndTitleAndIdNot(baRequest.getSubIndustry(),
//						baRequest.getTitle(),baRequest.getId());
//
//		if(findBusinessActivity!=null)
//			return new ResponseEntity().badRequest("Business Activity already exist !!");
//
//		BusinessActivity updateBusinessActivity=this.businessActivityDao
//				.updateBusinessActivity(this.responseMapper.mapToUpdateBusinessActivity(baRequest));
//
//		if(updateBusinessActivity==null)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity fetchBusinessActivityById(Long businessActivityId) {
//		BusinessActivity businessActivity=this.businessActivityDao.fetchBusinessActivityById(businessActivityId);
//		if(businessActivity==null)
//			return new ResponseEntity().badRequest("Business Activity Not Found !!");
//
//		return new ResponseEntity().ok(mapToBusinessActivityResponse(businessActivity));
//	}
//
//	@Override
//	public ResponseEntity deleteBusinessActivityById(Long businessActivityId) {
//		BusinessActivity businessActivity=this.businessActivityDao.fetchBusinessActivityById(businessActivityId);
//		if(businessActivity==null)
//			return new ResponseEntity().badRequest("Business Activity Not Found !!");
//
//		boolean deleteBusiness=this.businessActivityDao.deleteBusinessActivity(businessActivity);
//
//		if(!deleteBusiness)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity searchBusinessActivity(String searchData) {
//		List<BusinessActivity> businessActivityList=this.businessActivityDao.findBusinessActivityContains(searchData);
//		if(businessActivityList.isEmpty())
//			return new ResponseEntity().noContent();
//
//		return new ResponseEntity().ok(businessActivityList.stream().map(this::mapToBusinessActivityResponse));
//	}
//
//	@Override
//	public ResponseEntity searchBusinessActivityBySubIndustryId(Long subIndustryId) {
//		SubIndustry subIndustry=this.subIndustryDao.fetchSubIndustryById(subIndustryId);
//		if(subIndustry==null)
//			return new ResponseEntity().badRequest("Sub-Industry Not Found !!");
//
//		List<BusinessActivity> businessActivityList=this.businessActivityDao.findBusinessActivityBySubIndustry(subIndustry);
//		if(businessActivityList.isEmpty())
//			return new ResponseEntity().noContent();
//
//		return new ResponseEntity().ok(businessActivityList.stream().map(this::mapToBusinessActivityResponse));
//	}
}
