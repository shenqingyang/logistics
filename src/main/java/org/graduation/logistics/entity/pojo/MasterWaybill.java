package org.graduation.logistics.entity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterWaybill {
    private Integer masterWaybillId;
    private Timestamp createTime;
}