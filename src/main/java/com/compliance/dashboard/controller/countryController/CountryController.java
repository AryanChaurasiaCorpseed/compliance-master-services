package com.compliance.dashboard.controller.countryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.service.countryService.CountryService;

@RestController
@RequestMapping("/master/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping()
    public ResponseEntity fetchCountryList(){
        return this.countryService.fetchAllCountry();
    }

    @GetMapping("/health")
    public String isOk(){
        return "Health is Ok";
    }
}
