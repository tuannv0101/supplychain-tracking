package com.supplychain.entity.admin.productEvents;

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
@Table(name = "PRODUCT_EVENT")
@Getter
@Setter
public class ProductEventEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String productEventId;
    private String productId;
    private String itemId;
    private String eventType;
    private String eventSubtype;
    private String eventTimestamp;
    private String locationId;
    private String actorUserId;
    private String actorOrgId;
    private String shipmentId;
    private String blockchainTxId;
}
