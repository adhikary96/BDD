package com.cg.EquipmentTrackingSystem.service;

import java.util.Map;

import com.cg.EquipmentTrackingSystem.bean.Equipment;
import com.cg.EquipmentTrackingSystem.bean.EquipmentRecord;

public interface EquipmentTrackingService {
	
	public Equipment getDetailsByEquipmentTag(String tag);
	public Equipment getDetailsByEquipmentId(String id);
	public Equipment getDetailsByUserId(String id);
	public Equipment getDetailsByLocation(String locId);
	public Equipment getDetailsByEquipmentType(String type);
	public Equipment getDetailsBySequenceNUmber(String number);
	public Map<String, Object> printLable(String id);
	
	//public EquipmentRecord updateDependingOnStatus(EquipmentRecord record);
}
