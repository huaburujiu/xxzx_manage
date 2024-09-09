package com.xxzx.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

import com.xxzx.manage.util.IntegerListToJsonConverter;

@Data
@Entity
@Table(name = "ggw_faults_maintenance")
public class GgwFaultsMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Convert(converter = IntegerListToJsonConverter.class)
    @Column(name = "resolved_by", nullable = false)
    private List<Integer> resolvedBy;

    @Convert(converter = IntegerListToJsonConverter.class)
    @Column(name = "maintenance_location")
    private List<Integer> maintenanceLocation;

    @Column(name = "fault_description", nullable = false)
    private String faultDescription;

    @Column(name = "type_of_maintenance", nullable = false)
    private String typeOfMaintenance;

    @Column(name = "is_remote", nullable = false)
    private String isRemote; // 注意：这里我们假设is_remote存储的是0或1，并且数据库层面已经做了转换

    @Column(name = "start_time", nullable = false)
    private Timestamp startTime; // 使用Hibernate注解来模拟创建时间戳

    @Column(name = "end_time", nullable = false)
    private Timestamp endTime;

    @Column(name = "maintenance_process")
    private String maintenanceProcess;

    @Column(name = "root_cause")
    private String rootCause;

    @Column(name = "maintenance_result", nullable = false)
    private String maintenanceResult;
}
