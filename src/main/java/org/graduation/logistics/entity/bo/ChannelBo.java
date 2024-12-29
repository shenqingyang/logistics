package org.graduation.logistics.entity.bo;

import lombok.Data;
import org.graduation.logistics.entity.pojo.MiscellaneousExpensesChannel;

import java.sql.Timestamp;
import java.util.List;

@Data
public class ChannelBo {
    private Integer channelId;
    private String name;
    private Double defaultPrice;
    private Timestamp expirationDate;
    private Double discount;
    private Integer companyId;
    private String companyName;
    private List<MiscellaneousExpensesChannel> miscellaneousExpensesChannels;
}
