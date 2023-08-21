package com.compliance.dashboard.service.cityService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    ResponseEntity fetchAllCity(Long stateId);
}
