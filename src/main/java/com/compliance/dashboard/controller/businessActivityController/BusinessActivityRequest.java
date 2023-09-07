package com.compliance.dashboard.controller.businessActivityController;

import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BusinessActivityRequest {

	private Long id;
	
	private String title;

	private boolean isEnable;

	@ManyToOne
	private SubIndustry subIndustry;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public SubIndustry getSubIndustry() {
		return subIndustry;
	}

	public void setSubIndustry(SubIndustry subIndustry) {
		this.subIndustry = subIndustry;
	}



}