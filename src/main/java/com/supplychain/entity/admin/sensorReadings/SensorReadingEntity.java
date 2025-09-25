package com.supplychain.entity.admin.sensorReadings;

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
@Table(name = "SENSOR_READING")
@Getter
@Setter
public class SensorReadingEntity extends AbstractAuditingEntity<String> implements Serializable {
    @Id
    private String sensorReadingId;
    private String itemId;
    private String shipmentId;
    private String timestamp;
    private String temperature;
    private String humidity;
    private String location;
}
