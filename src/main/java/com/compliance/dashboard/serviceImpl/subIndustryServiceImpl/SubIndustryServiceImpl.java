package com.compliance.dashboard.serviceImpl.subIndustryServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.controller.subIndustryController.SubIndustryRequest;
import com.compliance.dashboard.model.industryModel.Industry;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;
import com.compliance.dashboard.service.subIndustryService.SubIndustryService;
import com.compliance.dashboard.repository.*;
@Service
public class SubIndustryServiceImpl implements SubIndustryService {
	
	@Autowired
	SubIndustryRepository subIndustryRepository;
	
	@Autowired
	IndustryRepository industryRepository;

	
	@Override
	public SubIndustry createSubIndustry(Long industryId, String name) throws Exception {
		
         SubIndustry subIndustry = new SubIndustry();
		 Optional<Industry> opIndustry = industryRepository.findById(industryId);

		if(opIndustry!=null && opIndustry.get()!=null) {
			Industry industry = opIndustry.get();
			subIndustry.setTitle(name);
			subIndustry.setIsEnable(true);
			subIndustry.setUpdatedAt(new Date());
			subIndustry.setCreatedAt(new Date());
			subIndustryRepository.save(subIndustry);
			List<SubIndustry> subIndustryList = industry.getSubIndustries();
			if(subIndustryList!=null && subIndustryList.size()!=0) {
				subIndustryList.add(subIndustry);
			}else {
				List<SubIndustry>siList = new ArrayList<>();
				siList.add(subIndustry);
				subIndustryList=siList;
			}
			industry.setSubIndustries(subIndustryList);
			industryRepository.save(industry);
		}

		else {
			throw new Exception("please insert correct industry Id");
		}
		return subIndustry;
	}

	@Override
	public SubIndustry deleteSubIndustryById(Long subIndustryId) {
		SubIndustry si =subIndustryRepository.findById(subIndustryId).get();
		si.setIsEnable(false);
		subIndustryRepository.save(si);
		return si;
	}

	@Override
	public SubIndustry fetchSubIndustryById(Long subIndustryId) {
		// TODO Auto-generated method stub
		SubIndustry si =subIndustryRepository.findById(subIndustryId).get();
		return si;
	}

	@Override
	public SubIndustry updateSubIndustry(String name,Long id) {
		SubIndustry si =subIndustryRepository.findById(id).get();
        si.setTitle(name);
        si.setUpdatedAt(new Date());
        si.setIsEnable(true);
        subIndustryRepository.save(si);
		return si;
	}

	@Override
	public List<SubIndustry> fetchAllSubIndustry() {
		List<SubIndustry> subIndustry = subIndustryRepository.findAll().stream().filter(i->i.getIsEnable().equals(true)).collect(Collectors.toList());
		return subIndustry;
	}

	@Override
	public Industry fetchSubIndustryByIndustry(Long industryId) {
		  Industry industry = industryRepository.findById(industryId).get();  
		return industry;
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
