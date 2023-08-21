package com.compliance.dashboard.model.subIndustryModel;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.compliance.dashboard.model.businessActivityModel.BusinessActivity;
import com.compliance.dashboard.model.complianceCategoryHub.ComplianceCategoryHub;
import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;
import com.compliance.dashboard.model.industryModel.Industry;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@NoArgsConstructor@Table(name = "sub_industry")
public class SubIndustry {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@ManyToOne(targetEntity = Industry.class)
//	@JoinColumn(name = "industry_id",nullable = false)
//	private Industry industry;
	
//	@NotEmpty
//	@NotNull
//	@NotBlank
//	@Column(name = "title")
	private String title;

//	@Column(name = "created_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
//
//	@Column(name = "updated_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

//	@Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//	@Comment(value = "1 : Active, 0 : Inactive")
	private boolean isEnable;
	
//	@OneToMany(mappedBy = "subIndustry",cascade = CascadeType.ALL,orphanRemoval = true)
//	private List<BusinessActivity> businessActivities=new ArrayList<>();



}
