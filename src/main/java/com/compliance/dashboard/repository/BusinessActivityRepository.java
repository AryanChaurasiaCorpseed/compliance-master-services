package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;

@Repository
public interface BusinessActivityRepository extends JpaRepository<BusinessActivity, Long> {

//	BusinessActivity findAllBySubIndustrtryIdAndTitle(Long id, String title);

}
