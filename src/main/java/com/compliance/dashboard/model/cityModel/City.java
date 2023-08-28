package com.compliance.dashboard.model.cityModel;

import lombok.*;

import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.Comment;

import com.compliance.dashboard.model.countryModel.Country;
import com.compliance.dashboard.model.stateModel.State;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
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
