package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;
import com.compliance.dashboard.model.industryModel.Industry;

public interface IndustryRepository extends JpaRepository<Industry, Long> {

}
