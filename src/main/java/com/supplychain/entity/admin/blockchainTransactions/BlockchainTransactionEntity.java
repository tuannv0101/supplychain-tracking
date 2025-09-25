package com.supplychain.entity.admin.blockchainTransactions;

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
@Table(name = "BLOCKCHAIN_TRANSACTION")
@Getter
@Setter
public class BlockchainTransactionEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String blockchainTransactionId;
    private String txHash;
    private String chainId;
    private String contractAddress;
    private String blockNumber;
    private String fromAddress;
    private String toAddress;
    private String gasUsed;
    private String status;
    private String payload;
    private String timestamp;
}
