package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;

public interface ComplianceHubRepository extends JpaRepository<ComplianceHub, Long> {

}
