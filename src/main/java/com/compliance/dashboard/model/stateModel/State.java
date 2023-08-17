package com.compliance.dashboard.model.stateModel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.compliance.dashboard.model.cityModel.City;
import com.compliance.dashboard.model.countryModel.Country;

//@Table(name = "state")
public class State {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(targetEntity = Country.class)
//    @JoinColumn(name = "country_id",nullable = false)
    private Country country;

//    @NotNull
    private String name;

//    @Column(name = "created_at")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

//    @Column(name = "updated_at")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

//    @Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//    @Comment(value = "1 : Active, 0 : Inactive")
    private boolean isEnable;

//    @OneToMany(mappedBy = "state",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<City> cities=new HashSet<>();

}
