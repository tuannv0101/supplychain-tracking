package com.supplychain.entity.admin.qrCode;

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
@Table(name = "QR_CODE")
@Getter
@Setter
public class QrCodeEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String qrCodeId;
    private String token;
    private String productId;
    private String itemId;
    private String url;
    private String isActive;
    private String expireDate;
}
