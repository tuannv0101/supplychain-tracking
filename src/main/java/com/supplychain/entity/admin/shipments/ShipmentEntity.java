package com.supplychain.entity.admin.shipments;

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
@Table(name = "SHIPMENT")
@Getter
@Setter
public class ShipmentEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String shipmentId;
    private String shipmentCode;
    private String fromOrg;
    private String toOrg;
    private String status;
    private String departureDate;
    private String arrivalDate;
}
