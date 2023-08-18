package com.compliance.dashboard.controller.industryController;

import lombok.*;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class IndustryRequest {

	private Long id;

	private String title;

	private boolean isEnable;

}
