package com.compliance.dashboard.serviceImpl.stateServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.model.countryModel.Country;
import com.compliance.dashboard.model.stateModel.State;
import com.compliance.dashboard.repository.CountryRepository;
import com.compliance.dashboard.repository.StateRepository;
import com.compliance.dashboard.service.stateService.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	StateRepository stateRepository;
	
	@Override
	public List<State> fetchAllStates(Long countryId) {
		List<State>states = new ArrayList<>();
		Optional<Country> opCountry = countryRepository.findById(countryId);
		if(opCountry!=null && opCountry.get()!=null) {
			Country country=opCountry.get();
			states=country.getStates();
		}
		return states;
	}

	@Override
	public List<State> fetchAllStateList() {
		List<State> states = stateRepository.findAll();
		return states;
	}

	@Override
	public State createState(String name,Long countryId) {
		Optional<Country> opCountry = countryRepository.findById(countryId);
		State state = new State();
		state.setName(name);
		state.setCreatedAt(new Date());
		state.setEnable(true);
		state.setUpdatedAt(new Date());
		stateRepository.save(state);
		if(opCountry!=null && opCountry.get()!=null) {
			Country country = opCountry.get();
			List<State> states = country.getStates();
			if(states==null) {
				states=new ArrayList<>();
				states.add(state);
			}
			states.add(state);
			country.setStates(states);
			countryRepository.save(country);
		}
		return state;
	}

//    @Autowired
//    private StateDao stateDao;
//
//    @Autowired
//    private CountryDao countryDao;
//
//    @Autowired
//    private ResponseMapper responseMapper;
//
//    @Override
//    public ResponseEntity fetchAllStates(Long countryId) {
//        Country country = this.countryDao.findCountryById(countryId);
//        if(country!=null)
//            return new ResponseEntity().ok(this.stateDao.findStateByCountry(country).stream().map(this::mapToStateResponse));
//        else
//            return new ResponseEntity().badRequest("Country Not Found !!");
//    }
//
//    private StateResponse mapToStateResponse(State state) {
//        return this.responseMapper.mapToStateResponse(state);
//    }
//
//	@Override
//	public ResponseEntity fetchAllStateList() {
//		List<State>stateList=stateDao.findAllState();
//		Map<String,Set<City>>mapList=new HashMap<>();
//		for(State s:stateList) {
//			mapList.put(s.getName(), s.getCities());	
//		}
//        return new ResponseEntity().ok(mapList);
//	}
}
