package com.compliance.dashboard.service.cityService;

import org.springframework.http.ResponseEntity;

public interface CityService {
    ResponseEntity fetchAllCity(Long stateId);
}
