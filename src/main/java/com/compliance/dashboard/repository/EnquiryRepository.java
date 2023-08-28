package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compliance.dashboard.model.cityModel.City;
import com.compliance.dashboard.model.enquiryModel.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {

}
