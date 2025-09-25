package com.supplychain.entity.admin.productItems;

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
@Table(name = "PRODUCT_ITEMS")
@Getter
@Setter
public class ProductItemEntity extends AbstractAuditingEntity<String> implements Serializable {

    @Id
    private String productItemId;
    private String productId;
    private String serialNumber;
    private String batchNumber;
    private String status;
    private String manufactureDate;
    private String expiryDate;
}
