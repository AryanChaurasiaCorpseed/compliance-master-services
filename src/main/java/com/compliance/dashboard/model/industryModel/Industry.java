package com.compliance.dashboard.model.industryModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.compliance.dashboard.model.complianceCategoryHub.ComplianceCategoryHub;
import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;
import com.compliance.dashboard.model.subIndustryModel.SubIndustry;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "industry")
public class Industry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	private String title;


	private Date createdAt;


	private Date updatedAt;


	private boolean isEnable;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="industry_sub_industry",joinColumns = {@JoinColumn(name="industry_id",referencedColumnName="id",nullable=true)},
			inverseJoinColumns = {@JoinColumn(name="industry_sub_industry_id"
					+ "",referencedColumnName = "id",nullable=true,unique=false)})
	private List<SubIndustry> subIndustries=new ArrayList<>();
	
	

}
