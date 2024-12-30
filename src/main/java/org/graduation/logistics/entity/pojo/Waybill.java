package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Waybill {
    @TableId(type = IdType.AUTO)
    private Integer waybillId;
    private Integer userId;
    private Integer senderAddressId;
    private Integer receiverAddressId;
    private Integer packageId;
    private Timestamp createTime;
    private Integer channelId;
    private Byte status;
    private Integer storeId;
    private Byte logisticsType;
    private Timestamp createdTime;
    private Timestamp paidTime;
    private Timestamp sentToHubTime;
    private Timestamp shippedFromHubTime;
    private Timestamp arrivedCustomsTime;
    private Timestamp deliveryTime;
    private Timestamp deliveryConfirmationTime;
}