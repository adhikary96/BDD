package com.cg.EquipmentTrackingSystem.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Equipment {
	
	@Column(name="equipment_type")
	private String equipmentType;
	@Column(name="equipment_tag")
	private String equipmentTag;
	@Id 
	@Column(name="equipment_id")
	private String machineId;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="equipment_record_id")
	private EquipmentRecord record; 
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="computer_name")
	private ComputerDetail detail;
	
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public String getEquipmentTag() {
		return equipmentTag;
	}
	public void setEquipmentTag(String equipmentTag) {
		this.equipmentTag = equipmentTag;
	}
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public EquipmentRecord getRecord() {
		return record;
	}
	public void setRecord(EquipmentRecord record) {
		this.record = record;
	}
	public ComputerDetail getDetail() {
		return detail;
	}
	public void setDetail(ComputerDetail detail) {
		this.detail = detail;
	}
	
	

}
