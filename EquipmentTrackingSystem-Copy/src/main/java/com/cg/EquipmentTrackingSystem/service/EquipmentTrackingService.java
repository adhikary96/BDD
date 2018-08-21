package com.cg.EquipmentTrackingSystem.service;

import com.cg.EquipmentTrackingSystem.bean.Equipment;

public interface EquipmentTrackingService {
	
	public Equipment getDetailsByEquipmentTag(String tag);

}
