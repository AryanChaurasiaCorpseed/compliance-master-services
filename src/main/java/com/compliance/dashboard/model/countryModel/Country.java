package com.compliance.dashboard.model.countryModel;

import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.SQLUpdates;

import com.compliance.dashboard.model.stateModel.State;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.*;

//
@Data
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(unique = true)
    private String name;


    private String shortName;
//
//    @Column@Temporal(name = "created_at")
//    (TemporalType.TIMESTAMP)
    private Date createdAt;

//    @Column(name = "updated_at")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

//    @Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//    @Comment(value = "1 : Active, 0 : Inactive")
    private boolean isEnable;

    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<State> states=new HashSet<>();

}
