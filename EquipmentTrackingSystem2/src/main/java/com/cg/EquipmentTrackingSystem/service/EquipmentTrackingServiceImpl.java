package com.cg.EquipmentTrackingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.EquipmentTrackingSystem.bean.Equipment;
import com.cg.EquipmentTrackingSystem.repo.EquipmentTrackingRepo;

@Service
public class EquipmentTrackingServiceImpl implements EquipmentTrackingService {
	
	@Autowired
	private EquipmentTrackingRepo repo;

	@Override
	public Equipment getDetailsByEquipmentTag(String tag) {
		// TODO Auto-generated method stub
		return repo.getDetailsByTag(tag);
	}

}
