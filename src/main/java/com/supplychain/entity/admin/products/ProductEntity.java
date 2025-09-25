package com.supplychain.entity.admin.products;

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
@Table(name = "PRODUCTS")
@Getter
@Setter
public class ProductEntity extends AbstractAuditingEntity<String> implements Serializable {

    @Id
    private String id;
    private String productCode;
    private String productName;
    private String productDescription;
    private String manufacturerOrgId;
    private String origin;
}
