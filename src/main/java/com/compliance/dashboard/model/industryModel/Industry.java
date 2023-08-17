package com.compliance.dashboard.model.industryModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

//@Table(name = "industry")
public class Industry {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotEmpty
//	@NotNull
//	@NotBlank
	private String title;

//	@Column(name = "created_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

//	@Column(name = "updated_at")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

//	@Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//	@Comment(value = "1 : Active, 0 : Inactive")
	private boolean isEnable;

//	@OneToMany(mappedBy = "industry",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<SubIndustry> subIndustries=new ArrayList<>();

}
