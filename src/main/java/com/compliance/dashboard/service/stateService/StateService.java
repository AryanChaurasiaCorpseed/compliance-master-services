package com.compliance.dashboard.service.stateService;

import org.springframework.http.ResponseEntity;

public interface StateService {
    ResponseEntity fetchAllStates(Long countryId);

	ResponseEntity fetchAllStateList();
}
