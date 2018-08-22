package com.cg.EquipmentTrackingSystem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.EquipmentTrackingSystem.bean.Equipment;
import com.cg.EquipmentTrackingSystem.bean.EquipmentRecord;
import com.cg.EquipmentTrackingSystem.repo.EquipmentTrackingRepo;

@Service
public class EquipmentTrackingServiceImpl implements EquipmentTrackingService {
	
	@Autowired
	private EquipmentTrackingRepo repo;

	@Override
	public Equipment getDetailsByEquipmentTag(String tag) {
		// TODO Auto-generated method stub
		//System.err.println("in service:"+repo.getDetailsByEquipmentTag(tag));
		return repo.getDetailsByEquipmentTag(tag);
	}

	@Override
	public Equipment getDetailsByEquipmentId(String id) {
		// TODO Auto-generated method stub
		return repo.getDetailsByEquipmentId(id);
	}

	@Override
	public Equipment getDetailsByUserId(String id) {
		// TODO Auto-generated method stub
		return repo.getDetailsByUserId(id);
	}

	@Override
	public Equipment getDetailsByLocation(String locId) {
		// TODO Auto-generated method stub
		return repo.getDetailsByLocation(locId);
	}

	@Override
	public Equipment getDetailsByEquipmentType(String type) {
		// TODO Auto-generated method stub
		return repo.getDetailsByEquipmentType(type);
	}

	@Override
	public Equipment getDetailsBySequenceNUmber(String number) {
		// TODO Auto-generated method stub
		return repo.getDetailsBySequenceNumber(number);
	}

	@Override
	public Map<String, Object> printLable(String id) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		Equipment equipment = repo.printLable(id);
		
		map.put("machineId", equipment.getEquipmentTag());
		map.put("userId", equipment.getRecord().getUser().getUserId());
		map.put("locationId", equipment.getRecord().getLocation().getLocationId());
		return map;
	}

	/*@Override
	public EquipmentRecord updateDependingOnStatus(EquipmentRecord record) {
		// TODO Auto-generated method stub
		return repo.save(record);
	}*/

	

}
