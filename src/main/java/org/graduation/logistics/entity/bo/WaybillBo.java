package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class WaybillBo {
    private Integer waybillId;
    private Integer userId;
    private Integer senderAddressId;
    private AddressBo senderAddress;
    private Integer receiverAddressId;
    private AddressBo receiverAddress;
    private Integer packageId;
    private PackageBo packageBo;
    private Timestamp createTime;
    private Integer channelId;
    private ChannelBo channel;
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
