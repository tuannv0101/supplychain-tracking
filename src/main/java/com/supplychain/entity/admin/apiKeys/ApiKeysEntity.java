package com.supplychain.entity.admin.apiKeys;

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
@Table(name = "API_KEYS")
@Getter
@Setter
public class ApiKeysEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String apiKeyId;
    private String orgId;
    private String keyHash;
    private String name;
    private String scopes;
    private String isActive;
    private String createdAt;
    private String expiredAt;
}
