
package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

@Repository
public interface SubIndustryRepository extends JpaRepository<SubIndustry, Long> {

}
