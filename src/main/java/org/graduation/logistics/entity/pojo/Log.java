package org.graduation.logistics.entity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Log {
    private Integer logId;
    private Timestamp time;
    private Integer userId;
    private Byte operationType;
    private Integer changeId;
    private Byte subordinateType;
    private Integer subordinateId;
}