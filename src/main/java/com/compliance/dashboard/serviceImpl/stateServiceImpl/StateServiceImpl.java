package com.compliance.dashboard.serviceImpl.stateServiceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.service.stateService.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Override
	public ResponseEntity fetchAllStates(Long countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity fetchAllStateList() {
		// TODO Auto-generated method stub
		return null;
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
