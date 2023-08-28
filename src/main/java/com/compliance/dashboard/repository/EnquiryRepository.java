package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compliance.dashboard.model.cityModel.City;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {

}
