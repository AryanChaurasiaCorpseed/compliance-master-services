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


}
