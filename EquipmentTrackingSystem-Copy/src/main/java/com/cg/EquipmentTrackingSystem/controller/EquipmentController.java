package com.cg.EquipmentTrackingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Equipment getDetailsByTag(String tag) {
		return service.getDetailsByEquipmentTag(tag);
	}

}
