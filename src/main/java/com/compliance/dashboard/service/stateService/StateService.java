package com.compliance.dashboard.service.stateService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.model.stateModel.State;

@Service
public interface StateService {
    List<State> fetchAllStates(Long countryId);

	List<State> fetchAllStateList();
}
