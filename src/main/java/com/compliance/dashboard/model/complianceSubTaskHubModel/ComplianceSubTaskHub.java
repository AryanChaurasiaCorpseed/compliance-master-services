package com.compliance.dashboard.model.complianceSubTaskHubModel;

import java.util.Date;
import java.util.List;

import com.compliance.dashboard.model.complianceCategoryHub.ComplianceCategoryHub;
import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;
import com.compliance.dashboard.model.complianceTaskHubModel.ComplianceTaskHub;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "compliance_sub_task_hub")
public class ComplianceSubTaskHub {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
//
//	@ManyToOne(targetEntity = ComplianceTaskHub.class,fetch = FetchType.LAZY)
//	@JoinColumn(name = "compliance_task_hub_id",nullable = false)
//	private ComplianceTaskHub complianceTaskHub;

}
