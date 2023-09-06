package com.compliance.dashboard.model.stateModel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.compliance.dashboard.model.cityModel.City;
import com.compliance.dashboard.model.countryModel.Country;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToOne(targetEntity = Country.class)
//    @JoinColumn(name = "country_id",nullable = false)
//    private Country country;

//    @NotNull
    private String name;


    private Date createdAt;


    private Date updatedAt;


    private boolean isEnable;
    
    
    
//    @OneToMany(mappedBy = "state",cascade = CascadeType.ALL,orphanRemoval = true)
    @ManyToMany
	@JoinTable(name="state_city",joinColumns = {@JoinColumn(name="state_city",referencedColumnName="id",nullable=true)},
			inverseJoinColumns = {@JoinColumn(name="city_id"
					+ "",referencedColumnName = "id",nullable=true,unique=false)})
    private Set<City> cities=new HashSet<>();

}
