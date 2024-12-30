package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class LogBo {
    private Integer logId;
    private Timestamp time;
    private Integer userId;
    private String userName;
    private Byte operationType;
    private Integer changeId;
    private String changeName;
    private Integer companyId;
    private String companyName;
    private Integer storeId;
    private String storeName;
    private Integer warehouseId;
    private String warehouseName;
}
