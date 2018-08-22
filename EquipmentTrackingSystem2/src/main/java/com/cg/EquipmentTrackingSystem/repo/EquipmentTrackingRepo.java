package com.cg.EquipmentTrackingSystem.repo;


import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.EquipmentTrackingSystem.bean.Equipment;
import com.cg.EquipmentTrackingSystem.bean.EquipmentRecord;

@Repository
public interface EquipmentTrackingRepo  extends JpaRepository<Equipment, String>{
	
	@Query(value="SELECT e FROM Equipment e WHERE e.equipmentTag=(:tag)")
	public Equipment getDetailsByEquipmentTag(@Param(value="tag") String tag);
	
	@Query(value="SELECT e FROM Equipment e WHERE e.machineId=(:id)")
	public Equipment getDetailsByEquipmentId(@Param(value="id") String id);	
	
	@Query(value="SELECT e FROM Equipment e WHERE e.equipmentType=(:type)")
	public Equipment getDetailsByEquipmentType(@Param(value="type") String type);
	
	@Query(value="SELECT e FROM Equipment e JOIN e.record r JOIN r.user u WHERE u.userId=(:id)")
	public Equipment getDetailsByUserId(@Param(value="id") String id);
	
	@Query(value="SELECT e FROM Equipment e JOIN e.record r JOIN r.location l WHERE l.locationId=(:locId)")
	public Equipment getDetailsByLocation(@Param(value="locId") String locId);
	
	@Query(value="SELECT e FROM Equipment e JOIN e.record r WHERE r.seqNo=(:no)")
	public Equipment getDetailsBySequenceNumber(@Param(value="no") String no);
	
	@Query(value="SELECT e FROM Equipment e WHERE e.machineId=(:id)")
	public Equipment printLable(@Param(value="id") String id);
	
	/*@Query(value="UPDATE Equipment e SET e.equipmentTag")
	public EquipmentRecord updateDependingOnStatus(EquipmentRecord record);*/
	
}
