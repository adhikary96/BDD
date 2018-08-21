package com.cg.EquipmentTrackingSystem.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.EquipmentTrackingSystem.bean.Equipment;

@Repository
public interface EquipmentTrackingRepo  extends JpaRepository<Equipment, String>{
	
	@Query(value="Select e from Equipment e Where e.machineId=(:tag)")
	public Equipment getDetailsByTag(@Param(value="tag") String tag);

}
