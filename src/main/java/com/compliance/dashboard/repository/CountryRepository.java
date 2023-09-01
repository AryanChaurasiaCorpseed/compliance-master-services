package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compliance.dashboard.model.countryModel.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
	

}
