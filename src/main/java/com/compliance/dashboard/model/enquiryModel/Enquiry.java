package com.compliance.dashboard.model.enquiryModel;

import java.util.Date;

import jakarta.persistence.Table;

@Table(name = "enquiry")
public class Enquiry {

	private Long id;

	private Long complianceId;


	private String message;


	private Date createdAt;


	private Date updatedAt;
    private boolean isDelivered;


}
