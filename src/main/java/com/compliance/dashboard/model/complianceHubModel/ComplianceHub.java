package com.compliance.dashboard.model.complianceHubModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import com.compliance.dashboard.model.complianceCategoryHub.ComplianceCategoryHub;
import com.compliance.dashboard.model.complianceTaskHubModel.ComplianceTaskHub;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "compliance_hub")
public class ComplianceHub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotNull
//    @NotBlank
//    @NotEmpty
    private String title;

//    @NotNull
//    @NotBlank
//    @NotEmpty
    private String description;

//    @Column(name = "created_at")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

//    @Column(name = "updated_at")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

//    @Column(length = 1,name="is_enable",columnDefinition = "tinyint(1) default 1")
//    @Comment(value = "1 : Active, 0 : Inactive")
    private boolean isEnable;

    private String duration;

//    @Column(name = "business_activity")
    private String businessActivity;

    @Comment(value="1 : Mandatory Compliance, 2: Optional Compliance")
    private int priority;

//    @ManyToOne(targetEntity = ComplianceCategoryHub.class,fetch = FetchType.LAZY)
//    @JoinColumn(name = "compliance_category_hub_id",nullable = false)
//    private ComplianceCategoryHub complianceCategoryHub;
//
//    @OneToMany(mappedBy = "complianceHub",cascade = CascadeType.ALL,orphanRemoval = true)
//	private List<ComplianceTaskHub> complianceTaskHubList=new ArrayList<>();

}
