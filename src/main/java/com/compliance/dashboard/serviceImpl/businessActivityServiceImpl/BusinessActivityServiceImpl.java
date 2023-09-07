package com.compliance.dashboard.serviceImpl.businessActivityServiceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import com.compliance.dashboard.response.*;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.businessActivityController.BusinessActivityRequest;
import com.compliance.dashboard.repository.BusinessActivityRepository;
import com.compliance.dashboard.repository.SubIndustryRepository;
import com.compliance.dashboard.service.businessActivityService.BusinessActivityService;

import java.util.Date;
import java.util.List;
import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

@Service
public class BusinessActivityServiceImpl implements BusinessActivityService {
//
	@Autowired
	private BusinessActivityRepository businessActivityRepository;	
	@Autowired
	SubIndustryRepository subIndustryRepository;

	@Override
	public List<BusinessActivity> fetchAllBusinessActivity() {
		List<BusinessActivity> res=businessActivityRepository.findAll();
		return res;
      }


	@Override
	public BusinessActivity createBusinessActivity(String title, Long subIndustryId) throws Exception {
		BusinessActivity findBusinessActivity=null;
		findBusinessActivity=businessActivityRepository.findAllBySubIndustrtryIdAndTitle(subIndustryId,title);
		if(findBusinessActivity!=null){
			throw new Exception("already exist");
		}
		SubIndustry si =subIndustryRepository.findById(subIndustryId).get();
		BusinessActivity businessActivity = new BusinessActivity();
		businessActivity.setTitle(title);
		businessActivity.setEnable(true);
		businessActivity.setUpdatedAt(new Date());
		businessActivity.setSubIndustry(si);
		BusinessActivity saveBusinessActivity = businessActivityRepository.save(businessActivity);
		return saveBusinessActivity;
	}
	
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

	@Override
	public Boolean updateBusinessActivity(Long baId, String title, Long subIndustryId) {
        BusinessActivity findBusinessActivity = businessActivityRepository.findById(baId).get();		
        findBusinessActivity.setTitle(title); 
		SubIndustry si =subIndustryRepository.findById(subIndustryId).get();    
        findBusinessActivity.setSubIndustry(si);
        businessActivityRepository.save(findBusinessActivity);
		return true;
	}


	@Override
	public BusinessActivity fetchBusinessActivityById(Long businessActivityId) {
        BusinessActivity findBusinessActivity = businessActivityRepository.findById(businessActivityId).get();		
		return findBusinessActivity;
	}

//	@Override
//	public boolean deleteBusinessActivity(BusinessActivity businessActivity) {
//		Session session=null;
//		Transaction tx=null;
//		try {
//			session=this.sessionFactory.openSession();
//			tx=session.beginTransaction();
//			session.delete(businessActivity);
//			tx.commit();
//			return true;
//		} catch (Exception e) {
//			tx.rollback();
//			return false;
//		}finally {
//			if(session!=null)session.close();
//		}
//	}
	
	@Override
	public boolean deleteBusinessActivityById(Long businessActivityId) {
        BusinessActivity findBusinessActivity = businessActivityRepository.findById(businessActivityId).get();		
        findBusinessActivity.setEnable(false);
        businessActivityRepository.save(findBusinessActivity);
		return true;
	}

	@Override
	public List<BusinessActivity> searchBusinessActivity(String searchData) {
          List<BusinessActivity> findBusinessActivity = businessActivityRepository.findAllByTitle(searchData);		
		return findBusinessActivity;
	}

	@Override
	public List<BusinessActivity>  searchBusinessActivityBySubIndustryId(Long subIndustryId) {
        List<BusinessActivity> findBusinessActivity = businessActivityRepository.findAllBySubIndustrtryId(subIndustryId);		
		return findBusinessActivity;
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
