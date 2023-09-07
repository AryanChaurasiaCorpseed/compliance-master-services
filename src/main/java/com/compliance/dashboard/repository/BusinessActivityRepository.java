package com.compliance.dashboard.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

@Repository
public interface BusinessActivityRepository extends JpaRepository<BusinessActivity, Long> {

	@Query(value = "SELECT * FROM business_activity ba WHERE ba.sub_industry_id=:subIndustryId and ba.title=:title and id=:id ", nativeQuery = true)
	BusinessActivity findAllBySubIndustryAndTitleAndId(Long subIndustryId, String title, Long id);
	
	@Query(value = "SELECT * FROM business_activity ba WHERE ba.title = :title", nativeQuery = true)
	List<BusinessActivity> findAllByTitle(String title);
	
	
	@Query(value = "SELECT * FROM business_activity ba WHERE ba.title = :title and  ba.sub_industry_id=:id ", nativeQuery = true)
	BusinessActivity findAllBySubIndustrtryIdAndTitle(Long id, String title);
	
	@Query(value = "SELECT * FROM business_activity ba WHERE ba.sub_industry_id=:id ", nativeQuery = true)
	List<BusinessActivity> findAllBySubIndustrtryId(Long id);

}
