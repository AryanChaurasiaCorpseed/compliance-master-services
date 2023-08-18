package com.compliance.dashboard.model.complianceCategoryHub;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "compliance_category_hub")
public class ComplianceCategoryHub {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotNull
//	@NotBlank
//	@NotEmpty
	private String title;

//	@NotNull
//	@NotBlank
//	@NotEmpty
	private String slug;
//
//	@Column(name = "created_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

//	@Column(name = "updated_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

//	@Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//	@Comment(value = "1 : Active, 0 : Inactive")
	private boolean isEnable;

	@OneToMany(mappedBy = "complianceCategoryHub",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ComplianceHub> complianceHubList=new ArrayList<>();

}
