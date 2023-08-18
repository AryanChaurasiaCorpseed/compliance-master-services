package com.compliance.dashboard.serviceImpl.cityServiceImpl;

//import com.master.dao.cityDao.CityDao;
//import com.master.dao.stateDao.StateDao;
//import com.master.dto.cityDto.CityResponse;
//import com.master.model.cityModel.City;
//import com.master.model.stateModel.State;
//import com.master.response.ResponseEntity;
//import com.master.service.cityService.CityService;
//import com.master.util.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliance.dashboard.service.cityService.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Override
	public ResponseEntity fetchAllCity(Long stateId) {
		// TODO Auto-generated method stub
		return null;
	}
//
//    @Autowired
//    private CityDao cityDao;
//
//    @Autowired
//    private StateDao stateDao;
//
//    @Autowired
//    private ResponseMapper responseMapper;
//
//    @Override
//    public ResponseEntity fetchAllCity(Long stateId) {
//        State state=this.stateDao.findStateById(stateId);
//        if(state!=null)
//            return new ResponseEntity().ok(this.cityDao.findCityByState(state).stream().map(this::mapToCityResponse));
//        else
//            return new ResponseEntity().badRequest("State Not Found !!");
//    }
//
//    private CityResponse mapToCityResponse(City city) {
//        return this.responseMapper.mapToCityResponse(city);
//    }
}
