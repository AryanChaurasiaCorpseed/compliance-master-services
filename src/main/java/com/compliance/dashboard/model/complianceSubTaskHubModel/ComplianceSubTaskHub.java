package com.compliance.dashboard.model.complianceSubTaskHubModel;

import java.util.Date;

import com.compliance.dashboard.model.complianceTaskHubModel.ComplianceTaskHub;

//@Table(name = "compliance_sub_task_hub")
public class ComplianceSubTaskHub {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotBlank
//	@NotNull
//	@NotEmpty
//	@Column(name = "sub_task_name")
	private String subTaskName;
	
//	@Min(value = 1)
//	@Column(name = "timeline_value")
	private int timelineValue;
	
//	@NotBlank
//	@NotNull
//	@NotEmpty
//	@Column(name = "timeline_type")
	private String timelineType;

//	@Column(name = "created_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

//	@Column(name = "updated_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

//	@Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//	@Comment(value = "1 : Active, 0 : Inactive")
	private boolean isEnable;

	private String criticality;

//	@ManyToOne(targetEntity = ComplianceTaskHub.class,fetch = FetchType.LAZY)
//	@JoinColumn(name = "compliance_task_hub_id",nullable = false)
	private ComplianceTaskHub complianceTaskHub;

}
