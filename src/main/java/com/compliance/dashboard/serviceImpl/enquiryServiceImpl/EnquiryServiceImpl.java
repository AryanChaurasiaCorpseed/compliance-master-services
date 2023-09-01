package com.compliance.dashboard.serviceImpl.enquiryServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.model.enquiryModel.Enquiry;
import com.compliance.dashboard.repository.EnquiryRepository;
import com.compliance.dashboard.service.enquiryService.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	
	@Autowired
	EnquiryRepository enquiryRepository;
	@Override
	public ResponseEntity saveComplianceEnquiry(Long complianceId, int status) {
		// TODO Auto-generated method stub
		Optional<Enquiry> opEnquiry = enquiryRepository.findById(complianceId);
		if(opEnquiry!=null) {
			Enquiry enquiry = opEnquiry.get();
		}
		return null;
		
	}
//
//    @Autowired
//    private EnquiryDao enquiryDao;
//
//    @Autowired
//    private ResponseMapper responseMapper;
//
//    @Override
//    public ResponseEntity saveComplianceEnquiry(Long complianceId, int status) {
//       /* Compliance compliance=this.complianceDao.findComplianceById(complianceId);
//        if(compliance==null)
//            return new ResponseEntity().badRequest("Compliance Not Found !!");
//        compliance.setWorkStatus(status);
//        Compliance updateCompliance = this.complianceDao.updateCompliance(compliance);
//        if(status==1)
//            this.enquiryDao.saveEnquiry(this.responseMapper.mapSaveEnquiry(compliance));
//
//        if(updateCompliance==null)
//            return new ResponseEntity().internalServerError();*/
//
//        return new ResponseEntity().ok();
//    }
}
