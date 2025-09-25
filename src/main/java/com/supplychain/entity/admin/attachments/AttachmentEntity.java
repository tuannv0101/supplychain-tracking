package com.supplychain.entity.admin.attachments;

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
@Table(name = "ATTACHMENT")
@Getter
@Setter
public class AttachmentEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String attachmentId;
    private String eventId;
    private String storageUrl;
    private String fileName;
    private String mimeType;
    private String sizeBytes;
}
