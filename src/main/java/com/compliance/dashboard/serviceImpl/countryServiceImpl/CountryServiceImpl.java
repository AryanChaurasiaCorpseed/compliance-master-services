package com.compliance.dashboard.serviceImpl.countryServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.model.countryModel.Country;
import com.compliance.dashboard.repository.CountryRepository;
import com.compliance.dashboard.service.countryService.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Override
	public List<Country> fetchAllCountry() {
		// TODO Auto-generated method stub
		List<Country> countries = countryRepository.findAll();		
		return countries;
	}

	@Override
	public Country createCountry(String name, String shortName) {
		// TODO Auto-generated method stub
		Country country= new Country();
		country.setName(name);
		country.setShortName(shortName);
		country.setEnable(true);
		country.setCreatedAt(new Date());
		country.setUpdatedAt(new Date());
		countryRepository.save(country);
		return country;
	}

//    @Autowired
//    private CountryDao countryDao;
//
//    @Override
//    public ResponseEntity fetchAllCountry() {
//        return new ResponseEntity().ok(this.countryDao.findAllCountry());
//    }
}
