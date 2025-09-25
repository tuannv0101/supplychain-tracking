package com.supplychain.entity.admin.organizations;

import com.supplychain.entity.common.AbstractAuditingEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@DynamicUpdate
@Entity
@Table(name = "ORGANIZATION")
@Getter
@Setter
public class OrganizationEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String organizationId;
    private String organizationName;
    private String registrationNumber;
    private String type;
}
