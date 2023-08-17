package com.compliance.dashboard.model.cityModel;

import lombok.*;

import java.util.Date;

import org.hibernate.annotations.Comment;

import com.compliance.dashboard.model.stateModel.State;


//@Table(name = "city")
public class City {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(targetEntity = State.class)
//    @JoinColumn(name = "state_id",nullable = false)
    private State state;

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
}
