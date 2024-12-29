package org.graduation.logistics.entity.bo;

import java.sql.Timestamp;

public class WaybillBo {
    private Integer waybillId;
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
}
