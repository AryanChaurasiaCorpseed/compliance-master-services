package com.compliance.dashboard.serviceImpl.subIndustryServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.subIndustryController.SubIndustryRequest;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;
import com.compliance.dashboard.service.subIndustryService.SubIndustryService;
import com.compliance.dashboard.repository.*;
@Service
public class SubIndustryServiceImpl implements SubIndustryService {
	
	@Autowired
	SubIndustryRepository subIndustryRepository;

	@Override
	public ResponseEntity deleteSubIndustryById(Long subIndustryId) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public SubIndustry fetchSubIndustryById(Long subIndustryId) {
		// TODO Auto-generated method stub
		SubIndustry si =subIndustryRepository.findById(subIndustryId).get();
		return si;
	}

	@Override
	public SubIndustry updateSubIndustry(SubIndustryRequest subIndustryRequest) {
		// TODO Auto-generated method stub
		SubIndustry si =subIndustryRepository.findById(subIndustryRequest.getId()).get();
        si.setTitle(subIndustryRequest.getTitle());
        si.setUpdatedAt(new Date());
        si.setEnable(subIndustryRequest.isEnable());
        subIndustryRepository.save(si);
		return si;
	}

	@Override
	public ResponseEntity saveSubIndustry(SubIndustryRequest subIndustryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity fetchAllSubIndustry() {
		// TODO Auto-generated method stub
		List<SubIndustry> subIndustry = subIndustryRepository.findAll();
		return null;
	}

	@Override
	public ResponseEntity fetchSubIndustryByIndustry(Long industryId) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Autowired
//	private SubIndustryDao subIndustryDao;
//
//	@Autowired
//	private ResponseMapper responseMapper;
//
//	@Autowired
//	private IndustryDao industryDao;
//
//	@Override
//	public ResponseEntity deleteSubIndustryById(Long subIndustryId) {
//		SubIndustry subIndustry=this.subIndustryDao.fetchSubIndustryById(subIndustryId);
//		if(subIndustry==null)
//			return new ResponseEntity().badRequest("Sub-Industry Not Found !!");
//
//		boolean deleteSubIndustry=this.subIndustryDao.deleteSubIndustry(subIndustry);
//		if(!deleteSubIndustry)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity fetchSubIndustryById(Long subIndustryId) {
//		SubIndustry subIndustry=this.subIndustryDao.fetchSubIndustryById(subIndustryId);
//		if(subIndustry==null)
//			return new ResponseEntity().badRequest("Sub-Industry Not Found !!");
//
//		return new ResponseEntity().ok(mapToSubIndustryResponse(subIndustry));
//	}
//
//	private SubIndustryResponse mapToSubIndustryResponse(SubIndustry subIndustry) {
//
//		return this.responseMapper.mapToSubIndustryResponse(subIndustry);
//	}
//
//	@Override
//	public ResponseEntity updateSubIndustry(SubIndustryRequest subIndustryRequest) {
//		SubIndustry findSubIndustry=this.subIndustryDao.findSubIndustryByIndustryAndTitleAndIdNot(subIndustryRequest.getIndustry(),subIndustryRequest.getTitle(),subIndustryRequest.getId());
//		if(findSubIndustry!=null)
//			return new ResponseEntity().badRequest("Sub-Industry already exist !!");
//
//		SubIndustry updateSubIndustry=this.subIndustryDao.updateSubIndustry(this.responseMapper.mapToUpdateSubIndustry(subIndustryRequest));
//
//		if(updateSubIndustry==null)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity saveSubIndustry(SubIndustryRequest subIndustryRequest) {
//		SubIndustry findSubIndustry=this.subIndustryDao.findSubIndustryByIndustryAndTitle(subIndustryRequest.getIndustry(),subIndustryRequest.getTitle());
//		if(findSubIndustry!=null)
//			return new ResponseEntity().badRequest("Sub-Industry already exist !!");
//
//		SubIndustry saveSubIndustry=this.subIndustryDao.saveSubIndustry(this.responseMapper.mapToSaveSubIndustry(subIndustryRequest));
//
//		if(saveSubIndustry==null)
//			return new ResponseEntity().internalServerError();
//
//		return new ResponseEntity().ok();
//	}
//
//	@Override
//	public ResponseEntity fetchAllSubIndustry() {
//		List<SubIndustry> subIndustryList=this.subIndustryDao.fetchAllSubIndustry();
//		if(subIndustryList.isEmpty())
//			return new ResponseEntity().noContent();
//
//		return new ResponseEntity().ok(subIndustryList.stream().map(this::mapToSubIndustryResponse));
//	}
//
//	@Override
//	public ResponseEntity fetchSubIndustryByIndustry(Long industryId) {
//		Industry industry = this.industryDao.fetchIndustryById(industryId);
//		if (industry!=null){
//			return new ResponseEntity().ok(this.subIndustryDao.fetchSubIndustryByIndustry(industry)
//					.stream().map(this::mapToSubIndustryResponse));
//		}
//		return new ResponseEntity().notFound(SubIndustry.class);
//	}


}
