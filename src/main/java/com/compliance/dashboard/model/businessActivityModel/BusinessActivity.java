package com.compliance.dashboard.model.businessActivityModel;

import java.util.Date;

import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="business_activity")
public class BusinessActivity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//
//	@ManyToOne(targetEntity = SubIndustry.class)
//	@JoinColumn(name = "sub_industry_id",nullable = false)
//	private SubIndustry subIndustry;
//	
//	@NotEmpty
//	@NotNull
//	@NotBlank
//	@Column(name = "title")
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
}
