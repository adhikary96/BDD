package com.cg.EquipmentTrackingSystem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class ComputerDetail {
	
	@Id
	@Column(name="computer_name")
	private String computerName;
	@Column(name="disk_capacity")
	private String diskCapacity;
	@Column(name="total_Installed_Memory")
	private String totalInstalledMemory;
	@Column(name="network_Card_Number")
	private String networkCardNumber;
	@Column(name="network_Card_Manufacturer")
	private String networkCardManufacturer;
	@Column(name="free_Space_In_C_Drive")
	private String freeSpaceInCDrive;
	@Column(name="os")
	private String OS;
	@Column(name="os_version")
	private String OSVersion;
	
	

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public String getDiskCapacity() {
		return diskCapacity;
	}

	public void setDiskCapacity(String diskCapacity) {
		this.diskCapacity = diskCapacity;
	}

	public String getTotalInstalledMemory() {
		return totalInstalledMemory;
	}

	public void setTotalInstalledMemory(String totalInstalledMemory) {
		this.totalInstalledMemory = totalInstalledMemory;
	}

	public String getNetworkCardNumber() {
		return networkCardNumber;
	}

	public void setNetworkCardNumber(String networkCardNumber) {
		this.networkCardNumber = networkCardNumber;
	}

	public String getNetworkCardManufacturer() {
		return networkCardManufacturer;
	}

	public void setNetworkCardManufacturer(String networkCardManufacturer) {
		this.networkCardManufacturer = networkCardManufacturer;
	}

	public String getFreeSpaceInCDrive() {
		return freeSpaceInCDrive;
	}

	public void setFreeSpaceInCDrive(String freeSpaceInCDrive) {
		this.freeSpaceInCDrive = freeSpaceInCDrive;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getOSVersion() {
		return OSVersion;
	}

	public void setOSVersion(String oSVersion) {
		OSVersion = oSVersion;
	}

	@Override
	public String toString() {
		return "ComputerDetail [computerName=" + computerName + ", diskCapacity=" + diskCapacity
				+ ", totalInstalledMemory=" + totalInstalledMemory + ", networkCardNumber=" + networkCardNumber
				+ ", networkCardManufacturer=" + networkCardManufacturer + ", freeSpaceInCDrive=" + freeSpaceInCDrive
				+ ", OS=" + OS + ", OSVersion=" + OSVersion + "]";
	}

	
	
}
