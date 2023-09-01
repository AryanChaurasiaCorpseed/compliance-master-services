package com.compliance.dashboard.model.countryModel;

import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.SQLUpdates;

import com.compliance.dashboard.model.complianceCategoryHub.ComplianceCategoryHub;
import com.compliance.dashboard.model.complianceHubModel.ComplianceHub;
import com.compliance.dashboard.model.stateModel.State;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.*;

//
@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String shortName;

    private Date createdAt;

    private Date updatedAt;

    private boolean isEnable;

    
    @OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="country_state",joinColumns = {@JoinColumn(name="country_state_id",referencedColumnName="id",nullable=true)},
			inverseJoinColumns = {@JoinColumn(name="country_id"
					+ "",referencedColumnName = "id",nullable=true,unique=false)})
    private List<State> states=new ArrayList<>();

}
