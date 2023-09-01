package com.compliance.dashboard.service.countryService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.model.countryModel.Country;

@Service
public interface CountryService {
    List<Country> fetchAllCountry();
}
