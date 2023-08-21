package com.compliance.dashboard.model.industryModel;


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
public class SubIndustryRequest {

	private Long id;
	
	private String title;

	private boolean isEnable;

//	private Industry industry;

}
