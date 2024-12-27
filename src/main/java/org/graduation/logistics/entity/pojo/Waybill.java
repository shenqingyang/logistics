package org.graduation.logistics.entity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Waybill {
    private Integer waybillId;
    private Integer senderAddressId;
    private Integer receiverAddressId;
    private Integer packageId;
    private Timestamp createTime;
    private Integer channelId;
    private Byte status;
    private Integer storeId;
}