package com.compliance.dashboard.controller.stateController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.compliance.dashboard.service.stateService.StateService;

@CrossOrigin
@RestController
@RequestMapping("/master/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/{countryId}")
    public ResponseEntity fetchStateList(@PathVariable("countryId") Long countryId){
        return this.stateService.fetchAllStates(countryId);
    }

	/* 
	@Author :- Aryan Chaurasia
	*/
    @GetMapping()
    public ResponseEntity fetchAllStateList(){
        return this.stateService.fetchAllStateList();
    }
}
