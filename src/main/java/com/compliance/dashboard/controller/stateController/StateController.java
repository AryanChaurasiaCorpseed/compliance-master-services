package com.compliance.dashboard.controller.stateController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.compliance.dashboard.model.stateModel.State;
import com.compliance.dashboard.service.stateService.StateService;

@CrossOrigin
@RestController
@RequestMapping("/master/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/getCountry")
    public List<State> fetchStateList(@RequestParam Long countryId){
        return this.stateService.fetchAllStates(countryId);
    }

	/* 
	@Author :- Aryan Chaurasia
	*/
    @GetMapping("/getAllState")
    public List<State> fetchAllStateList(){
        return this.stateService.fetchAllStateList();
    }
    @GetMapping("/createState")
    public State createState(@RequestParam String name,@RequestParam Long countryId){
        return this.stateService.createState(name,countryId);
    }
    
}
