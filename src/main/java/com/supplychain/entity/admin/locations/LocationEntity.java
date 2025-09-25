package com.supplychain.entity.admin.locations;

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
@Table(name = "LOCATION")
@Getter
@Setter
public class LocationEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String locationId;
    private String locationName;
    private String address;
    private String latitude;
    private String longitude;
}
