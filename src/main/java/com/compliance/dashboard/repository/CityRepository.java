package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compliance.dashboard.model.cityModel.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
