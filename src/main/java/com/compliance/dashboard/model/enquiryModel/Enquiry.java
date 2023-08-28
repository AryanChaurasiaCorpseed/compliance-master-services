package com.compliance.dashboard.model.enquiryModel;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enquiry")
public class Enquiry {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long complianceId;
	private String message;
	private Date createdAt;
	private Date updatedAt;
    private boolean isDelivered;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getComplianceId() {
		return complianceId;
	}
	public void setComplianceId(Long complianceId) {
		this.complianceId = complianceId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
    
    


}
