package com.compliance.dashboard.controller.businessActivityController;

import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

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

	private SubIndustry subIndustry;

}