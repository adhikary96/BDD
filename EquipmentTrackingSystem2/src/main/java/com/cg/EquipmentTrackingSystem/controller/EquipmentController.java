package com.cg.EquipmentTrackingSystem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.EquipmentTrackingSystem.bean.Equipment;
import com.cg.EquipmentTrackingSystem.service.EquipmentTrackingService;

@RestController
public class EquipmentController {
	
	@Autowired
	private EquipmentTrackingService service;
	
	@RequestMapping(value="/tag", method=RequestMethod.GET)
	public Equipment getDetailsByEquipmentTag(String tag) {
		return service.getDetailsByEquipmentTag(tag);
	}
	
	@RequestMapping(value="/eid", method=RequestMethod.GET)
	public Equipment getDetailsByEquipmentId(String id) {
		return service.getDetailsByEquipmentId(id);
	}
	
	@RequestMapping(value="/uid", method=RequestMethod.GET)
	public Equipment getDetailsByUserId(String id) {
		return service.getDetailsByUserId(id);
	}
	
	@RequestMapping(value="/lid", method=RequestMethod.GET)
	public Equipment getDetailsByLocation(String locationId) {
		return service.getDetailsByLocation(locationId);
	}
	
	@RequestMapping(value="/type", method=RequestMethod.GET)
	public Equipment getDetailsByEquipmentType(String type) {
		return service.getDetailsByEquipmentType(type);
	}
	
	@RequestMapping(value="/seqNumber", method=RequestMethod.GET)
	public Equipment getDetailsBySeqNo(String number) {
		return service.getDetailsBySequenceNUmber(number);
	}
	
	@RequestMapping(value="/printLable", method=RequestMethod.GET)
	public Map<String, Object> printLable(String id) {
		return service.printLable(id);
	}

}
