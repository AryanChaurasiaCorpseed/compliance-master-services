package com.compliance.dashboard.serviceImpl.countryServiceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.service.countryService.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Override
	public ResponseEntity fetchAllCountry() {
		// TODO Auto-generated method stub
		return null;
	}

//    @Autowired
//    private CountryDao countryDao;
//
//    @Override
//    public ResponseEntity fetchAllCountry() {
//        return new ResponseEntity().ok(this.countryDao.findAllCountry());
//    }
}
