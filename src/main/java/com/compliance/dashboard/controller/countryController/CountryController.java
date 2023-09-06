package com.compliance.dashboard.controller.countryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.dashboard.model.countryModel.Country;
import com.compliance.dashboard.service.countryService.CountryService;

@RestController
@RequestMapping("/master/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping()
    public List<Country> fetchCountryList(){
        return this.countryService.fetchAllCountry();
    }

    @PostMapping("/createCountry")
    public Country createCountry(@RequestParam String name,@RequestParam String shortName){
        return this.countryService.createCountry(name,shortName);
    }
    @GetMapping("/health")
    public String isOk(){
        return "Health is Ok";
    }
}
