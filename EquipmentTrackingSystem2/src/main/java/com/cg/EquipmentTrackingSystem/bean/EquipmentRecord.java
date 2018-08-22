package com.cg.EquipmentTrackingSystem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class EquipmentRecord {
	
	@Column(name="purchase_Method")
	private String purchaseMethod;
	@Id 
	@Column(name="equipment_record_id")
	private String seqNo;
	@Column(name="dept_id")
	private String deptId;
	@Column(name="use_status")
	private String useStatus;
	@Column(name="cost_center")
	private String costCenter;
	@Column(name="install_date")
	private String installDate;
	@Column(name="comments")
	private String comments;
	@Column(name="stock_location")
	private String stockLocation;
	@Column(name="audit_date")
	private String auditDate;
	@Column(name="audit_location")
	private String auditLocation;
	
	@OneToOne//(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne//(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="location_id")
	private Location location;
	
	
	
	public String getPurchaseMethod() {
		return purchaseMethod;
	}
	public void setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getInstallDate() {
		return installDate;
	}
	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStockLocation() {
		return stockLocation;
	}
	public void setStockLocation(String stockLocation) {
		this.stockLocation = stockLocation;
	}
	public String getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}
	public String getAuditLocation() {
		return auditLocation;
	}
	public void setAuditLocation(String auditLocation) {
		this.auditLocation = auditLocation;
	}
		
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "EquipmentRecord [purchaseMethod=" + purchaseMethod + ", seqNo=" + seqNo + ", deptId=" + deptId
				+ ", useStatus=" + useStatus + ", costCenter=" + costCenter + ", installDate=" + installDate
				+ ", comments=" + comments + ", stockLocation=" + stockLocation + ", auditDate=" + auditDate
				+ ", auditLocation=" + auditLocation + ", ==>\nuser=" + user + ", ==>\nlocation=" + location + "]";
	}
	
	
		

}
