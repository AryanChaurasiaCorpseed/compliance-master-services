package com.compliance.dashboard.model.complianceTaskHubModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;
import com.compliance.dashboard.model.complianceSubTaskHubModel.ComplianceSubTaskHub;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "compliance_task_hub")
public class ComplianceTaskHub {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotBlank
//	@NotNull
//	@NotEmpty
//	@Column(name = "task_name")
	private String taskName;
	
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

	@ManyToOne(targetEntity = ComplianceHub.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "compliance_hub_id",nullable = false)
	private ComplianceHub complianceHub;
	
	@OneToMany(mappedBy = "complianceTaskHub",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ComplianceSubTaskHub> complianceSubTasks=new ArrayList<>();

}
